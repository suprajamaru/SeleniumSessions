package jan23seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_Concept {
	static WebDriver driver;
	public static void main(String[] args) {
		 driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//1st approach
		//driver.findElement(By.id("input-email")).sendKeys("naveen@gmail.com");
//	driver.findElement(By.id("input-password")).sendKeys("naveen@123");
	//2nd approch
	//WebElement emailId=driver.findElement(By.id("input-email"));
//	WebElement password=driver.findElement(By.id("input-password"));
//	emailId.sendKeys("naveen@gmail.com");
	//password.sendKeys("naveen@123");
	//3rd approch
//	By email=By.id("input-email");
//	By pwd=By.id("input-password");
//    WebElement emailId=driver.findElement(email);
//	WebElement password=driver.findElement(pwd);
//	emailId.sendKeys("naveen@gmail.com");
//	password.sendKeys("naveen@123");
		//dis:we are writting druver.findelement everytime
//	4th approach
		//By using locator and By creating a generic function for webelement
//		By email=By.id("input-email");
//        By pwd=By.id("input-password");
//       getElement(email).sendKeys("naveen@gmail.com");
//       getElement(pwd).sendKeys("naveen@123");
		
	//dis:writing sendkeys again and again
	//5th aproach:by locator,create webelement generic function and sendkeys generic function
//	By email=By.id("input-email");
//    By pwd=By.id("input-password");
//     doSendkeys(email,"naveen@gmail.com");
//     doSendkeys(pwd,"naveen@123");
//     //dis:dosendkeys applicable for only this class
     //6th approch:by locator,create generic function for webelement and actions in element util class
		By email=By.id("input-email");
        By pwd=By.id("input-password");
     ElementUtil eleutil=new ElementUtil(driver);
     eleutil.doSendkeys(email,"naveen@gmail.com" );
     eleutil.doSendkeys(pwd, "naveen@123");
     
	}

//	public static WebElement getElement(By locator) {
//	
//		return driver.findElement(locator);
//	}
//	public static void doSendkeys(By locator,String value) {
//		
//		getElement(locator).sendKeys(value);
//	}
	
}
