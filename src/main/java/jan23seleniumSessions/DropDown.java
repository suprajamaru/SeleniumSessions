package jan23seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	static WebDriver driver;
public static void main(String[] args) {
	driver=new ChromeDriver();
	driver.get("https://www.orangehrm.com/en/orangehrm-30-day-trial");
	    By country=By.id("Form_getForm_Country");
	    doslectByindex(country,5);
	    doslectByVistbile(country,"Argentina");
      doslectByValue(country,"Armenia");
}
public static WebElement  getElement(By locator) {
	return driver.findElement(locator);
}
public static void doslectByindex(By locator,int index) {
	Select select=new Select(getElement(locator));
	select.selectByIndex(index);
}
public static void doslectByVistbile(By locator,String text) {
	Select select=new Select(getElement(locator));
	select.selectByVisibleText(text);;
}
public static void doslectByValue(By locator,String Value) {
	Select select=new Select(getElement(locator));
	select.selectByValue(Value);;
}


}
