package jan23seleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDominsideIframeHandle {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://selectorshub.com/shadow-dom-in-iframe/");
		Thread.sleep(4000);
		//Browser
		   //page
		      //iframe
		     //shadow dom it should be in open state than only we can automate the script
		         //elements
		driver.switchTo().frame("pact");
	   String pizza_jspath="return document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")";
	JavascriptExecutor js=(JavascriptExecutor)driver;
WebElement lunch=(WebElement)js.executeScript(pizza_jspath);
	lunch.sendKeys("biryani");
	
	}

}
