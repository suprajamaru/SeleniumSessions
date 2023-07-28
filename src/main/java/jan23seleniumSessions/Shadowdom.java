package jan23seleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shadowdom {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
		Thread.sleep(4000);
		//Browser
		   //page
		     //shadow dom it should be in open state than only we can automate the script
		         //elements
	   String pizza_jspath="return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")";
	JavascriptExecutor js=(JavascriptExecutor)driver;
WebElement pizza=(WebElement)js.executeScript(pizza_jspath);
	pizza.sendKeys("chicken pizza");
	
	}
}
