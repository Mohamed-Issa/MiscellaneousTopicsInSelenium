package testing;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));

		// System.out.println(url);

		for (WebElement link : links) {

			String url = link.getAttribute("href");
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int responseCode = conn.getResponseCode();
			System.out.println(responseCode);

			if (responseCode > 400) {
				System.out.println("The link with Text " + link.getText() + " is broken with the code " + responseCode);
				Assert.assertTrue(false);
			}
		}

	}

}
