package jan23seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowHandle {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String parentwindowid=driver.getWindowHandle();
		    Thread.sleep(4000);
		    //driver.switchTo().newWindow(WindowType.TAB);
		    driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.google.com");
		    Thread.sleep(4000);
		    System.out.println(driver.getTitle());
		    driver.close();
		    driver.switchTo().window(parentwindowid);
		    System.out.println(driver.getTitle());
		    driver.close();
		    
		
		
		
		
		
	}
}
