package jan23seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebdriverMethods {
	public static void main(String[] args) {
	
ChromeOptions co=new ChromeOptions();
co.addArguments("--remote-allow-origins=*");
WebDriver driver=new ChromeDriver(co);
//driver.manage().window().maximize();
driver.manage().window().fullscreen();
driver.get("https://www.crmpro.com");
//driver.navigate().refresh();
//THIS BELOW LINE IS ALSO TO REFRESH PAGE
driver.get(driver.getCurrentUrl());
String pgsource=driver.getPageSource();
System.out.println(pgsource);
System.out.println(pgsource.contains(" CRMPRO lets you export data anytime"));


}
}
