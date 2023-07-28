package jan23seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class google_footer {
	static WebDriver driver;
public static void main(String[] args) {
	Browserutil broutil=new Browserutil();
	driver =broutil.intidriver("chrome");
	 broutil.launchURL("https://www.google.com");
	
	ElementUtil eleutil=new ElementUtil(driver);
	By googlefooter=By.xpath("//div[@class='KxwPGc SSwjIe']//a");
	List<String>googlefootertext=eleutil.getElementsTextList(googlefooter);
	 System.out.println(googlefootertext);
	 int elecount=eleutil.getElementsCount(googlefooter);
	System.out.println(elecount);
	
}
}
