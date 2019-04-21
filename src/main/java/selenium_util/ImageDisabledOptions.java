package selenium_util;

import java.util.HashMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ImageDisabledOptions {



	public static void main(String[] args) {
		
		
		//WebDriverManager.chromedriver().arch64().setup();
		
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "/src/main/resources/driver/chromedriver");
		
		
		ChromeOptions options = new ChromeOptions();
		disableImageChrome(options);
		
		
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.amazon.com");
		
		System.out.println(driver.getTitle());
		
		
		

	}
	
	public static void  disableImageChrome(ChromeOptions options) {
		
		HashMap<String,Object> images = new HashMap<String,Object>();
		images.put("images", 2);
		
		HashMap<String,Object> prefs = new HashMap<String,Object>();
		prefs.put("profile.defautl_content_setting_values", images);
		
		options.setExperimentalOption("prefs", prefs);
	
		
		
		
	}
	
	
	
	
	
	

}
