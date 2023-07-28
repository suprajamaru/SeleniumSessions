package jan23seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownmultiselection {
	static WebDriver driver;
public static void main(String[] args) {
	driver=new ChromeDriver();
	
	driver.get("https://www.lambdatest.com/selenium-playground/select-dropdown-demo");
	
	By weeks=By.id("select-demo");
	By states=By.id("multi-select");
	WebElement weekele=driver.findElement(weeks);
	WebElement stateele=driver.findElement(states);
	Select select1=new Select(weekele);
	//System.out.println(select1.isMultiple());
	Select select2=new Select(stateele);
	//System.out.println(select2.isMultiple());
	select1.selectByVisibleText("Monday");
	select2.selectByVisibleText("New Jersey");
	select2.selectByVisibleText("New York");
	
	List<WebElement>optionslist=select2.getAllSelectedOptions();
	for(WebElement e:optionslist) {
		String text=e.getText();
		System.out.println(text);
	}
	String fistoption=select1.getFirstSelectedOption().getText();
	
	System.out.println(fistoption);
	//select2.deselectAll();
	select2.deselectByVisibleText("New York");
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
