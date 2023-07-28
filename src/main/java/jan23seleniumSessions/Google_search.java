package jan23seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_search {
	static WebDriver driver;
	public static void search(By searchlocator,String seachkey,By suggestionslocator,String suggestionname) throws InterruptedException {
		driver.findElement(searchlocator).sendKeys(seachkey);
		Thread.sleep(3000);
		List<WebElement>suggetionlist=driver.findElements(suggestionslocator);
		System.out.println(suggetionlist.size());
		if(suggetionlist.size()>0) {
		for(WebElement e:suggetionlist) {
			String text=e.getText();
			if(text.length()>0) {
			System.out.println(text);
			if(text.contains(suggestionname)) {
			e.click();
			break;
			}
			}
			else {
				System.out.println("blank values--no suggestions");
				break;
			}
		}
		}
		else {
			System.out.println("no search suggestions found");
		}
		}
	
		
	
public static void main(String[] args) throws InterruptedException {
	driver=new ChromeDriver();
	driver.get("https://www.google.com");
	By searchlocator=By.name("q");
	By suggestionslocator=By.xpath("//div[@class='wM6W7d']/span");
	search(searchlocator,"  ", suggestionslocator,"webdriver");
}
}
