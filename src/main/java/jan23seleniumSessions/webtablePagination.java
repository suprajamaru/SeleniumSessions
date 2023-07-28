package jan23seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtablePagination {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
	
		while(true)
		{
			//element is present on 1st page
			if(driver.findElements(By.xpath("//td[text()='Canada']")).size()>0) {
				selectcountryname("Canada");
				break;
			}
			else {
				//pagination logic
               WebElement next=driver.findElement(By.linkText("Next"));
				//click on next link
				if(next.getAttribute("class").contains("disable")) {
					System.out.println("pagination is over..country not found");
					break;
				}
				Thread.sleep(4000);
				next.click();
				Thread.sleep(4000);
			}
		}
		}
	public static void selectcountryname(String countryname) {
		driver.findElement(By.xpath("//td[text()='"+countryname+"']/preceding-sibling::td/input[@type='checkbox']")).click();
		
	}
}
