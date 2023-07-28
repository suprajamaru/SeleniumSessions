package jan23seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHRM {
	static WebDriver driver;
public static void main(String[] args) {
	Browserutil broutil=new Browserutil();
	driver = broutil.intidriver("CHROME");
	 broutil.launchURL("https://demo.1crmcloud.com/login.php");
	By language=By.xpath("//select[@id='login_lang']");

	By theme=By.id("login_theme");
	ElementUtil eleutil=new ElementUtil(driver);
	//eleutil.getAllDrodownOptions(language);
	eleutil.getDropDownValueCount(theme);
	//boolean flag=	 eleutil.doSelectDropDownValue(language, "DE Deutsch");
//boolean flag=eleutil.doSelectDropDownValueWithoutSelectClass(theme, "Delight Theme");
//	System.out.println(flag);
	
	
}
}
