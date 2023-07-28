package jan23seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launchbrowser {
	public static void main(String[] args) {
	
//	
ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

   WebDriver driver = new ChromeDriver(co);
	//WebDriver driver=new FirefoxDriver();
   driver.get("https://www.google.com");
   System.out.println(driver.getTitle());
  driver.quit();
	

	
} 
}
