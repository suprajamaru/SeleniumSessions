package MaruthiSessions;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BroweserWindowHadleConcept {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		String parentwindow=driver.getWindowHandle();
		System.out.println(parentwindow);
		
		WebElement linkedinele=driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
		linkedinele.click();
		
		Set<String> windowhandleseles=driver.getWindowHandles();
		java.util.Iterator<String> it=windowhandleseles.iterator();
		String parentwindowid=it.next();
		String childwindowid=it.next();
		driver.switchTo().window(childwindowid);
		String childurl=driver.getCurrentUrl();
		System.out.println(childurl);
		//System.out.println(parentwindowid);
		//System.out.println(childwindowid);
		
		
		
	}

}
