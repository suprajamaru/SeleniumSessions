package jan23seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jquery_dropdown {
	static WebDriver driver;
public static void main(String[] args) {
	driver=new ChromeDriver();
	driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
	//driver.findElement(By.id("justAnInputBox")).click();

	By multiselection=By.xpath("(//div[@class='comboTreeDropDownContainer'])[1]//li[@class='ComboTreeItemChlid']/span");
	By singleselection=By.xpath("(//div[@class='comboTreeDropDownContainer'])[3]//li[@class='ComboTreeItemChlid']/span");
	By multicascadedselect=By.xpath("//div[@class='comboTreeDropDownContainer'])[2]//li[@class='ComboTreeItemChlid']/span");

	ElementUtil eleutil=new ElementUtil(driver);
	
	//multiselction dropdown
	//Tc_1 single selection
	//Boolean flag=eleutil.SelectChoices(multiselection, "choice 2");
	//System.out.println(flag);
	//TC_2 Multiple selection
//	Boolean flag1=eleutil.SelectChoices(multiselection, "choice 3","choice 4","choice 5");
//	System.out.println(flag1);
	//singleselection dropdown
//	driver.findElement(By.id("justAnotherInputBox")).click();
//
//	eleutil.SelectChoices(singleselection,"choice 6 1");
	//multiselection with cascaded option selecton
	driver.findElement(By.className("comboTreeInputBox")).click();
	eleutil.SelectChoices(multicascadedselect,"choice 1");
	
	
	
	
	
}
}
