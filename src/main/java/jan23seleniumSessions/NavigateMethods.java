package jan23seleniumSessions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NavigateMethods {
public static void main(String[] args) {
	ChromeOptions co=new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	//co.addArguments("--headless");
	co.addArguments("--incognito");
	WebDriver driver=new ChromeDriver(co);
//	driver.navigate().to("https://www.amazon.com");
//	//driver.get("https://www.google.com");
//	driver.navigate().refresh();
//	driver.navigate().back();
//	System.out.println(driver.getTitle());
//	driver.navigate().forward();
//	System.out.println(driver.getTitle());
	try {
		driver.navigate().to(new URL("https://www.amazon.com"));
	} catch (MalformedURLException e) {
		e.printStackTrace();
	}
}
}
