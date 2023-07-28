package jan23seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownwithoutSelectMethods {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		//By country = By.id("Form_getForm_Country");
By country=By.xpath("//select[@name='Country']/option");
		//getDropDownValueCount(country);
	//	doSelectDropDownValue(country, "Aruba");
		doSelectDropDownValue(country, "Aruba");
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static int getDropDownValueCount(By locator) {
		return getAllDrodownOptions(locator).size() - 1;
	}

	public static List<String> getAllDrodownOptions(By locator) {
		Select select = new Select(getElement(locator));
		List<WebElement> Optionslist = select.getOptions();
		List<String> OptionvalueList = new ArrayList();
		System.out.println("total options:" + (Optionslist.size() - 1));
		for (WebElement e : Optionslist) {
			String text = e.getText();
			System.out.println(text);
			OptionvalueList.add(text);

		}
		return OptionvalueList;
	}

	public static Boolean doSelectDropDownValue(By locator, String dropdownvalue) {
		Select select = new Select(getElement(locator));
		List<WebElement> Optionslist = select.getOptions();
		Boolean flag = false;
		System.out.println("total options:" + (Optionslist.size() - 1));
		for (WebElement e : Optionslist) {
			String text = e.getText();
			System.out.println(text);
			if (text.contains(dropdownvalue)) {
				flag = true;
				e.click();
				break;
			}
		}
		if (flag == false) {
			System.out.println(dropdownvalue + "is not present in" + locator);
		}
		return flag;
	}
	//variable argument
	public static Boolean SelectChoices(By locator, String... dropdownvalue) {
		List<WebElement> Optionslist = getElements(locator);
		
		Boolean flag = false;
		System.out.println("total options:" + (Optionslist.size() - 1));
		for (WebElement e : Optionslist) {
			String text = e.getText();
			System.out.println(text);
			for(int i=0;i<dropdownvalue.length;i++) {
			if (text.equals(dropdownvalue[i])) {
				flag = true;
				e.click();
				break;
			}
		}
		if (flag == false) {
			System.out.println(dropdownvalue + "is not present in" + locator);
		}
		return flag;
		}
	}
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	}


