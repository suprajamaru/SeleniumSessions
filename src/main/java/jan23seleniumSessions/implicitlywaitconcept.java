package jan23seleniumSessions;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitlywaitconcept {
	static WebDriver driver;
public static void main(String[] args) {
	driver=new ChromeDriver();
//wait-->1.static wait-->Thread.sleep()
	// 2.dynamic wait-->1.implicitly wait
	//                   2.Explicity wait-->1.Webdriverwait
	//                                      2.fluent wait
	//1.implicitly wait-->global wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//it is applicable for all the webelements by default
	//not applied to the specific element
	//not applicable for non webelement:title,url,alerts
	//home page:10 sec
	driver.get("https://www.amazon.in");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
	
	
	
}
}
