package jan23seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.manager.SeleniumManager;

public class SeleniumMangerConcept {
	public static void main(String[] args) {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.amazon.com");
		//String cpath=SeleniumManager.getInstance().getDriverPath(driver);
		//System.out.println(cpath);
		driver.quit();
	}
}
