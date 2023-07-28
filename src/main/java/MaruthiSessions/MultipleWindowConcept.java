package MaruthiSessions;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowConcept {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
		String parentwindow=driver.getWindowHandle();
		//System.out.println(parentwindow);
		
		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();
		Set<String> windowhandleslist=driver.getWindowHandles();
		Iterator<String> it=windowhandleslist.iterator();
		while(it.hasNext())
		{
			String windowID=it.next();
			driver.switchTo().window(windowID);
			String url=driver.getCurrentUrl();
			System.out.println(url);
			Thread.sleep(4000);
			if(!windowID.equals(parentwindow))
			{
				driver.close();
			}
		}
		//System.out.println(windowhandleslist.size());
		driver.switchTo().window(parentwindow);
		String parenturl1=driver.getCurrentUrl();
		System.out.println(parenturl1);

	}
	
	

}
