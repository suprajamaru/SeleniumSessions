package jan23seleniumSessions;

import javax.management.openmbean.OpenMBeanAttributeInfo;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class JavaScriptAlertHandling {
public static void main(String[] args) throws InterruptedException {
		//popups are 3 types to handle we use Alert class
		//Alert-if we get only 1 option i.e ok
		//Confirm-if we get 2 option i.e ok&cancel
		//prompt-we get 1 text field and ok&cancel options
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
	driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
	Alert alert=driver.switchTo().alert();//Alert is an interface
	String alerttext=alert.getText();
		System.out.println(alerttext);
		alert.accept();
	    driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();	
		Thread.sleep(4000);
		Alert alert1=driver.switchTo().alert();//Alert is an interface
		String alerttext1=alert.getText();
		System.out.println(alerttext1);
		alert.accept();
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(4000);
		Alert alert2=driver.switchTo().alert();//Alert is an interface
		alert2.sendKeys("ilove shanveeksha");
		String text=alert2.getText();
		System.out.println(text);
		alert2.accept();
		//alert2.dismiss();
		
		
		
		
	}
}
