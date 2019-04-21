package selenium_util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownDemo {
	
	        //ArrayList >Collection
			//How to dropdown
			//Collections

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				 System.getProperty("user.dir") + "/src/main/resources/driver/chromedriver");
		
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		

	}

}
