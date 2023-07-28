package jan23seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightclickaction {
	static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	WebElement r8click=	driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions action=new Actions(driver);
		action.contextClick(r8click).build().perform();
		 List<WebElement>rightelelist=driver.findElements(By.cssSelector("ul.context-menu-list.context-menu-root span "));
		for(WebElement e:rightelelist){
		String text=e.getText();
		System.out.println(text);
		for(int i=0;i<text.length();i++) {
			if(text.contains("Edit")) {
				e.click();
				break;
			}	
		}
		
			
			
			
		}
		
		
		
		
		
	}
}
