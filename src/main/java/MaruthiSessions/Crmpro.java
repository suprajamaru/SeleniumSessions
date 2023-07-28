package MaruthiSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Crmpro {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver=new ChromeDriver();
		driver.get("https://classic.freecrm.com/");
		
		driver.findElement(By.name("username")).sendKeys("newautomation");
		driver.findElement(By.name("password")).sendKeys("selenium@12345");
		driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();
		Thread.sleep(5000);
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		
		//System.out.println(getElments());
		getEles();
		
	}
	public static void getEles()
	{
		driver.findElement(By.xpath("//a[text()='deepti gupta']/parent::td/preceding-sibling::td/input[@name='contact_id']")).click();
	}
	
	public static List<String> getElments()
	{
		List<WebElement> elemntscount=driver.findElements(By.xpath("//a[text()='deepti gupta']/parent::td/following-sibling::td"));
		List<String> elementstext= new ArrayList<String>();
		for(WebElement e: elemntscount) {
			String text=e.getText();
			elementstext.add(text);
			
			
		}
		return elementstext;
	}

}
