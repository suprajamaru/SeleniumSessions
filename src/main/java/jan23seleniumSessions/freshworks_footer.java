package jan23seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class freshworks_footer {
	
	static WebDriver driver;
	public static void main(String[] args) {
		Browserutil broutil=new Browserutil();
		driver =broutil.intidriver("chrome");
		 broutil.launchURL("https://www.freshworks.com/");
		
		ElementUtil eleutil=new ElementUtil(driver);
		By footer=By.xpath("//div[@class='sc-ace17a57-0 hFnGrz']//ul/li");
	List<String>textlist	=eleutil.getElementsTextList(footer);
	System.out.println(textlist);
	Boolean flag=eleutil.IsElementDisplayed(footer);
	System.out.println(flag);
		eleutil.clickElementfrompagesection(footer, "Contact");
		
		
		
		
}
}