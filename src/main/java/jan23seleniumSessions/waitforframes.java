package jan23seleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitforframes {
	static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://classic.freecrm.com/index.cfm?CFID=824485&CFTOKEN=68912004&jsessionid=b630484e2c5a3ec1e6417215687315494d77");
		driver.findElement(By.name("username")).sendKeys("newautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
	    driver.findElement(By.xpath("//input[@value='Login']")).click();
	    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("mainpanel"));
        driver.findElement(By.linkText("CONTACTS")).click();
}
	public static void waitforFrameandSwitchtoItbyNameorId(By idorname,int timeout) {
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
	        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(idorname));
	     }
	public static void waitforFrameandSwitchtoItbyIndex(int index,int timeout) {
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
	        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(index));
	     }
	public static void waitforFrameandSwitchtoItbyLocator(By locator,int timeout) {
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
	        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));
	     }
	public static void waitforFrameandSwitchtoItbyFrameElement(WebElement frameelement,int timeout) {
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
	        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameelement));
	     }
}
