package jan23seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementDisplayedConcept {
	static WebDriver driver;
public static void main(String[] args) {
	driver=new ChromeDriver();
	driver.get("https://www.amazon.com");
	Boolean search=driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
	if(search) {
		System.out.println("element displayed");
	}else {
		System.out.println("fail");
	}
	
}
}
