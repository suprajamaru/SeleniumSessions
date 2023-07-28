package jan23seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileHandlingpopup {
//never use AutoIT-->itis only for windows it wont wrk on remotemachine/mac/linux
	//Robot class-->IT IS ONLY WINDOWS
	//Sikuli
	
	
	
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
	driver.findElement(By.name("upfile")).sendKeys("D:\\java class notes");
}
}
