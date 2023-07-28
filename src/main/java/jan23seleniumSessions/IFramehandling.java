package jan23seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFramehandling {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
	Thread.sleep(4000);
	driver
	.findElement(By
			.xpath("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/"))
	.click();
	driver.switchTo().frame(0)
	
	
	
	
	
	}

}
