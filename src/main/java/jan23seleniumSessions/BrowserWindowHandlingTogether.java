package jan23seleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandlingTogether {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();
	String parentwindowid=driver.getWindowHandle();
	Set<String>handles=	driver.getWindowHandles();
	Iterator<String>it=handles.iterator();
		while(it.hasNext()) {
			String windowid=it.next();
		driver.switchTo().window(windowid);
		Thread.sleep(4000);
		String url=driver.getCurrentUrl();
		System.out.println("current window url"+url);
		if(!(windowid.equals(parentwindowid))) {
		driver.close();
		}
		}
		
		
		
		
		
	}
}
