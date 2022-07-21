package testing;


import java.io.IOException;


import org.openqa.selenium.chrome.ChromeDriver; 

public class MaxWindowDeleteCookies {

	public static void main(String[] args) throws IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	//	driver.manage().deleteCookieNamed("sessionKey");
		driver.get("https://www.google.com/");
		
		

		

	}

}
