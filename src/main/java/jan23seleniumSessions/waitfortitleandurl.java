package jan23seleniumSessions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitfortitleandurl {
	static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//	   Boolean flag= wait.until(ExpectedConditions.titleContains("Register"));
//		System.out.println(flag);
//		Boolean flag1=waitfortitle("Register Account",10);
//		System.out.println(flag1);
//		//account/register
	String url=waitforUrlcontains("account/register",10);
	System.out.println(url);
}
	public static Boolean waitfortitlecontains(String titlefraction,int timeout) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
		   return wait.until(ExpectedConditions.titleContains(titlefraction));
			
	}
	public static Boolean waitfortitle(String title,int timeout) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
		   return wait.until(ExpectedConditions.titleIs(title));
			
	}
	public static String waitforUrlcontains(String urlfraction,int timeout) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
		  if(wait.until(ExpectedConditions.urlContains(urlfraction))) {
			 String url= driver.getCurrentUrl();
			return url;
		  }
		  else {
			  System.out.println("url is not present within the given timeout"+timeout);
			  return null;
		  }
			
	}
	public static Boolean waitforUrl(String url,int timeout) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
		   return wait.until(ExpectedConditions.urlToBe(url));
			
	}
}
