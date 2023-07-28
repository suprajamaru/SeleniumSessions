package MaruthiSessions;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickCocnept {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement rightcliclkelement=driver.findElement(By.cssSelector("span.context-menu-one"));
		//List<WebElement> totalelements=driver.findElements("li.context-menu-icon");
		
		Actions action = new Actions(driver);
		action.contextClick(rightcliclkelement).build().perform();
		List<WebElement> totalelements=driver.findElements(By.cssSelector("li.context-menu-icon"));
		System.out.println(totalelements.size());
		
		for(WebElement e:totalelements )
		{
			String text=e.getText();
			System.out.println(text);
			if(text.equals("Copy"))
			{
			  e.click();
			  break;
			}
		}
		Thread.sleep(2000);
		
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
