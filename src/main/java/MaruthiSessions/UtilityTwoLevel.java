package MaruthiSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UtilityTwoLevel {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver= new ChromeDriver();
		driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");
		
		By contentparentmenu=By.className("menulink");
		By coursechildmenu=By.linkText("COURSES");
		
		twolevelmousehover(contentparentmenu,coursechildmenu);
		
	}
	
	public static void twolevelmousehover(By parentmenu ,By courseelement) throws InterruptedException
	{
		WebElement pelement=driver.findElement(parentmenu);
		Actions action=new Actions(driver);
		action.moveToElement(pelement).build().perform();
		Thread.sleep(3000);
		driver.findElement(courseelement).click();
		
	}

}
