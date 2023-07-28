package MaruthiSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectorsHub {
	
	static WebDriver driver;
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		//getElements();
		System.out.println(getelemntsName());
		
		
	}
	
	public static void getElements()
	{
		driver.findElement(By.xpath("//a[text()='John.Smith']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
	}
	
	public static List<String> getelemntsName()
	{
		List<WebElement> sidelist=driver.findElements(By.xpath("//a[text()='John.Smith']/parent::td//following-sibling::td"));
        List<String> sidelistcount=new ArrayList<String>();
        
        for(WebElement e: sidelist)
        {
        	String text=e.getText();
        	sidelistcount.add(text);
        	
        	
        }
        return sidelistcount;
        
	}
}
