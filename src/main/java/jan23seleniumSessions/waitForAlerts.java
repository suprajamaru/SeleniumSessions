package jan23seleniumSessions;
import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitForAlerts {
	static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		By jsalert=By.xpath("//button[text()='Click for JS Alert']");
		ElementUtil ele=new ElementUtil(driver);
		ele.clickElementWhenReady(jsalert,10);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		Alert alert=wait.until(ExpectedConditions.alertIsPresent());
		alert.getText();
}
	public static void waitforJsAlert(By locator,int timeout) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		Alert alert=wait.until(ExpectedConditions.alertIsPresent());
}
	
	
	
	
	
}
