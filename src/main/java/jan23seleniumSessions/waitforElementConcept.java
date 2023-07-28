package jan23seleniumSessions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitforElementConcept {
	static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		By username=By.name("email");
		By forgotpswrd=By.linkText("Forgotten Password");
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//		WebElement forgotpassword=wait.until(ExpectedConditions.presenceOfElementLocated(forgotpswrd));
//		forgotpassword.click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//		WebElement user_name=wait.until(ExpectedConditions.presenceOfElementLocated(username));
//		user_name.sendKeys("test@gmail.com");
//		WebElement frgotpaswrd=waitForElementVisible(forgotpswrd,10);
//		frgotpaswrd.click();
//		By footer=By.xpath("//footer//div/ul/li/a");
//		List<WebElement>footerlinks1=waitForAllElementsVisible(footer,10);
//		System.out.println(footerlinks1.size());
//		
//		List<WebElement>footerlinks=waitForAllElementsPresence(footer,10);
//		
//		for(WebElement e: footerlinks)
//		{
//			String text=e.getText();
//			System.out.println(text);
//		}
   WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(10));
	WebElement forgopswrd=wait.until(ExpectedConditions.elementToBeClickable(forgotpswrd));
	forgopswrd.click();
		
	}
	public static WebElement waitForElementPresence(By locator,int timeout) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
	return	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	
	}
	public static List<WebElement> waitForAllElementsPresence(By locator,int timeout) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
	return	wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
	
	}
	public static WebElement waitForElementVisible(By locator,int timeout) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
	return	wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	
	}
	public static List<WebElement>waitForAllElementsVisible(By locator,int timeout) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
	return	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	
	}
	public static WebElement waitforElementtobeclickable(By locator,int timeout) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
		
	}
	
	
}
