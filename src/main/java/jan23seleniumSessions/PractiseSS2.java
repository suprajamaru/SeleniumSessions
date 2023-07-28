package jan23seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractiseSS2 {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.get("https://classic.freecrm.com/");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("newautomation");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Selenium@12345");
		driver.findElement(By.xpath("//input[@type='password']")).submit();
		
		
		//1.getSize();
//		WebElement features=driver.findElement(By.xpath("//a[text()='Features']"));
//		System.out.println(features.getSize());
		
		//2.getCssValue();
//		WebElement features=driver.findElement(By.xpath("//a[text()='Features']"));
//		System.out.println(features.getCssValue("color"));
//		System.out.println(features.getCssValue("font-family"));
//		System.out.println(features.getCssValue("background-color"));
//		System.out.println(features.getLocation());
//		
		
		
		
		
		
		
		
	}

}
