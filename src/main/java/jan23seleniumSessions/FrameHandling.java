package jan23seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://classic.freecrm.com/index.cfm?CFID=712086&CFTOKEN=75477538&jsessionid=b630fbbe4105b6af57e13f7d206f46e1c192");
	driver.findElement(By.name("username")).sendKeys("newautomation");
	driver.findElement(By.name("password")).sendKeys("Selenium@12345");
    driver.findElement(By.xpath("//input[@value='Login']")).click();
   driver.switchTo().frame("mainpanel");
   driver.findElement(By.linkText("CONTACTS")).click();
}
}
