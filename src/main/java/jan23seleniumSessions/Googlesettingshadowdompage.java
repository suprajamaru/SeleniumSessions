package jan23seleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesettingshadowdompage {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("chrome://settings/");
		Thread.sleep(4000);
		//Browser
		   //page
		    
		     //shadow dom it should be in open state than only we can automate the script
		         //elements
	
	   String search_jspath="return document.querySelector(\"body > settings-ui\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#search\").shadowRoot.querySelector(\"#searchInput\")";
	JavascriptExecutor js=(JavascriptExecutor)driver;
WebElement search=(WebElement)js.executeScript(search_jspath);
search.sendKeys("notification");
	
	}
}
