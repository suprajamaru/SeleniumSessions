package MaruthiSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSendKeysClickConcept {
	
	static WebDriver driver;
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By email=By.id("input-email");
		By password=By.id("input-password");
		By loginbtn=By.xpath("//input[@type='submit']");
		
		Actions action=new Actions(driver);
		action.sendKeys(driver.findElement(email), "test@gmail.com");
		action.sendKeys(driver.findElement(password), "test@123");
		action.click(driver.findElement(loginbtn)).build().perform();
		
	}

}
