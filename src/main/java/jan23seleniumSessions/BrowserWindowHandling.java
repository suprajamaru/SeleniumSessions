package jan23seleniumSessions;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandling {
	static WebDriver driver;
public static void main(String[] args) throws InterruptedException {
	driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
	Set<String>handles=driver.getWindowHandles();
	Iterator<String>it=handles.iterator();
String parentWindowId=it.next();
System.out.println("parentWindowId"+parentWindowId);
String childWindowId=it.next();
System.out.println("childWindowId"+childWindowId);
driver.switchTo().window(childWindowId);
System.out.println("child window url"+driver.getCurrentUrl());
driver.close();
driver.switchTo().window(parentWindowId);
System.out.println("parent window url"+driver.getCurrentUrl());

	driver.quit();
	
}
}
