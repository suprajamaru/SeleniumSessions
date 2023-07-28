package jan23seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MenuhandlinginSpicejet {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(2000);
		By parentmenu=By.xpath("//div[text()='Add-ons']");
		By childmenu=By.xpath("//div[text()='Friends and Family']");
		ElementUtil eleutil=new ElementUtil(driver);
		eleutil.twolevelmenuhandle(parentmenu,childmenu);
		}
}
