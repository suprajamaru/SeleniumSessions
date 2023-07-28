package jan23seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsendkeys {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		Actions act=new Actions(driver);
		By email=By.id("input-email");
		By pswrd=By.id("input-password");
		By login=By.xpath("//input[@type='submit']");
		act.sendKeys(driver.findElement(email),"supraja@gmail.com").build().perform();
		act.sendKeys(driver.findElement(pswrd),"suppumaru").build().perform();
		act.click(driver.findElement(login)).build().perform();
	
	}
}
