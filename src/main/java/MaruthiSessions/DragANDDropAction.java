package MaruthiSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragANDDropAction {
	
	public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
	
	By draggable=By.id("draggable");
	WebElement dragelement =driver.findElement(draggable);
	
	By droppable=By.id("droppable");
	WebElement dropelement=driver.findElement(droppable);
	
	Actions action=new Actions(driver);
	
	//action.dragAndDrop(dragelement, dropelement).build().perform();
	action.clickAndHold(dragelement).moveToElement(dropelement).release().build().perform();
		
	}
	
}
