package jan23seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CRM_Cricketdetails {
	static WebDriver driver;
public static void main(String[] args) throws InterruptedException {
	driver=new ChromeDriver();
	driver.get("https://classic.freecrm.com/index.cfm?CFID=712086&CFTOKEN=75477538&jsessionid=b630fbbe4105b6af57e13f7d206f46e1c192");
	driver.findElement(By.name("username")).sendKeys("newautomation");
	driver.findElement(By.name("password")).sendKeys("Selenium@12345");
    driver.findElement(By.xpath("//input[@value='Login']")).click();
    driver.switchTo().frame("mainpanel");
    driver.findElement(By.linkText("CONTACTS")).click();
    Thread.sleep(4000);
//selectmultiplsamecontacts("deepti gupta");
//String text=getcontactnamecompany("Adam Lambert");
	//System.out.println(text);
	String text= getcontactnameEmail("deepti gupta");
	System.out.println(text);
}
public static String getcontactnameEmail(String contactname1) {
	return driver
			.findElement(By.xpath("(//a[text()='"+contactname1+"']/parent::td//following-sibling::td)[5]/a"))
			.getText();
}
public static String getcontactnamecompany(String contactname1) {
	return driver
			.findElement(By.xpath("//a[text()='"+contactname1+"']/parent::td/following-sibling::td/a[@context='company']"))
			.getText();
}

public static void selectmultiplsamecontacts(String contactname) {
	 List<WebElement>contactschecks=driver
			 .findElements
			 (By.xpath("(//a[text()='"+contactname+"'])/parent::td/preceding-sibling::td/input[@type='checkbox']"));
for(WebElement e:contactschecks) {
	e.click();
}

}
 
}
