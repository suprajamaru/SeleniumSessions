package jan23seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropHandle {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		Thread.sleep(2000);
		WebElement dragele=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement dropele=driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions action=new Actions(driver);
		//action.dragAndDrop(dragele,dropele).build().perform();
		
		action.clickAndHold(dragele).moveToElement(dropele).release();
		
	}
}
