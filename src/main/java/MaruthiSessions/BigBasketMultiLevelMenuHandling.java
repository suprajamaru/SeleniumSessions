package MaruthiSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasketMultiLevelMenuHandling {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.get("https://BigBasket.com");
		
		Actions action=new Actions(driver);
		WebElement element=driver.findElement(By.xpath("//a[@qa='categoryDD']"));
		action.moveToElement(element).build().perform();
		
	}

}
