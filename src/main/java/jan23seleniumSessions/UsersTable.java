package jan23seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsersTable {
	static WebDriver driver;
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		By userdetails=By.xpath("//a[text()='Jasmine.Morgan']/parent::td/following-sibling::td");
		By checkbox=By.xpath("//a[text()='Garry.White']/parent::td/preceding-sibling::td/input[@type='checkbox']");
    		clickcheckbox("Jasmine.Morgan");
    	}
	
public static void clickcheckbox(String username1 ) {
			driver.findElement(By.xpath("//a[text()='"+username1+"']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
			
		
}
	
		public static void selectuser(String username) {
			List<WebElement>userdetailslist=driver.findElements(By.xpath("//a[text()='"+username+"']/parent::td/following-sibling::td"));
			List<String>userinfo=new ArrayList();
			System.out.println(userdetailslist.size());
			for(WebElement e:userdetailslist) {
				String text=e.getText();
				System.out.println(text);
				userinfo.add(text);
				
			}
			
			
				
				
			
			
			
			
			
		}
		
		
		
	
	
	
	
}
