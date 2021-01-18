package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnDropDown {
	 WebDriver driver = new ChromeDriver();
	
	public void init() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		
		 
		
		driver.get("\"https://techfios.com/billing/?ng=admin/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
		@Test
		
		public void login() {
			
			
	}
		@After
		public void tearDown() {
			driver.quit();
		}
}
