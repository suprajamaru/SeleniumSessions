package jan23seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VehicleRegistrationPage {
	static WebDriver driver;
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//img[@title='vehicle-registration-forms-and-templates']")).click();
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));
	driver.findElement(By.name("RESULT_TextField-1")).sendKeys("Honda vehicle reg");
	driver.findElement(By.name("RESULT_TextField-3")).sendKeys("Hyderabad");
	driver.findElement(By.name("RESULT_TextField-4")).sendKeys("4-22-2023");
	driver.findElement(By.name("RESULT_TextArea-5")).sendKeys("honda registration");
	driver.findElement(By.name("RESULT_FileUpload-6")).sendKeys("C:\\Users\\marip\\OneDrive\\Pictures\\Screenshots");
	driver.findElement(By.name("RESULT_TextField-8")).sendKeys("suppu");
	driver.findElement(By.name("RESULT_TextField-9")).sendKeys("marripelly");
	driver.findElement(By.name("RESULT_TextField-10")).sendKeys("ktl");
	driver.findElement(By.name("RESULT_TextField-11")).sendKeys("padmapuri");
	driver.findElement(By.name("RESULT_TextField-12")).sendKeys("korutla");
	driver.findElement(By.name("RESULT_RadioButton-13")).click();
	WebElement stateele=driver.findElement(By.id("RESULT_RadioButton-13"));
	Select select=new Select(stateele);
	select.selectByVisibleText("California");
    driver.findElement(By.name("RESULT_TextField-14")).sendKeys("12345");
    driver.findElement(By.name("RESULT_TextField-15")).sendKeys("12345578910");
    driver.findElement(By.name("RESULT_TextField-16")).sendKeys("suppu@gmail.com");
    driver.findElement(By.name("Submit")).click();
	
	
	
	
	
	
}
}
