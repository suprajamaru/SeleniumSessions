package jan23seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrcatiseWebElementSessions {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver=new ChromeDriver();
		
		driver.get("https://classic.freecrm.com/index.html?e=1");
		System.out.println(driver.findElement(By.cssSelector("input.form-control")).isDisplayed());
		Thread.sleep(3000);
		//System.out.println(driver.findElement(By.name("username")).getTagName());
		//System.out.println(driver.findElement(By.xpath("//h3[text()='Marketing Automation']")).getText());
		driver.findElement(By.cssSelector("input.form-control")).clear();
		
		
	}

}
