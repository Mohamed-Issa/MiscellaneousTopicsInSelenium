package testing;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class HTTPsCertifications {

	public static void main(String[] args) {
		
		
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		
		
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://expired.badssl.com/");
		
		System.out.println(driver.getTitle());
		
		

	}

}
