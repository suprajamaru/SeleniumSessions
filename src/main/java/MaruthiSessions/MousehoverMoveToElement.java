package MaruthiSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MousehoverMoveToElement {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");
		
		WebElement contentmenu=driver.findElement(By.className("menulink"));
		//driver.findElement(By.linkText("Courses"));
		
		Actions action = new Actions(driver);
		action.moveToElement(contentmenu).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("COURSES")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
