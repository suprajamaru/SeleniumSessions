package jan23seleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomHandle {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
		
		String JS_path =" return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")";
		JavascriptExecutor js=(JavascriptExecutor)driver;
	WebElement pizza=(WebElement)js.executeScript(JS_path);
	pizza.sendKeys("Mutton Pizza");

	}

}
