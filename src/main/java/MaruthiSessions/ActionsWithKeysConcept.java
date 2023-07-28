package MaruthiSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsWithKeysConcept {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By firstname=By.id("input-firstname");
		
		Actions action=new Actions(driver);
		action.sendKeys(driver.findElement(firstname), "naveen")
		.sendKeys(Keys.TAB)
		.sendKeys("khuenta")
		.sendKeys(Keys.TAB)
		.sendKeys("naveen@gmail.com")
		.sendKeys(Keys.TAB)
		.sendKeys("9848022338")
		.sendKeys(Keys.TAB)
		.sendKeys("nannu@123")
		.sendKeys(Keys.TAB)
		.sendKeys("nannu@123")
		.sendKeys(Keys.TAB)
		.sendKeys(Keys.TAB)
		.sendKeys(Keys.TAB)
		.click(driver.findElement(By.xpath("//input[@type='checkbox']")))
		.sendKeys(Keys.TAB)
		.click(driver.findElement(By.xpath("//input[@class='btn btn-primary']"))).build().perform();
		
		
	}

}
