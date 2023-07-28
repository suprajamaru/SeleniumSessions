package jan23seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class w3scholls {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		//div[@class='w3-white w3-padding notranslate w3-padding-16']//child::tr[1]/th
	int columncount=	getcolumncount();
	System.out.println(columncount);
	List<String>columnnames=getcolumnname();
	System.out.println(columnnames);
	}
	public static int getcolumncount() {
		return driver.findElements(By.xpath("//div[@class='w3-white w3-padding notranslate w3-padding-16']//child::tr[1]/th")).size();
	}
		
	public static List<String> getcolumnname() {
		List<WebElement>columnnames= driver.findElements
				(By.xpath("//div[@class='w3-white w3-padding notranslate w3-padding-16']//child::tr[1]/th"));
	
		List<String>columnnameslist=new ArrayList();
	for(WebElement e:columnnames) {
		String text=e.getText();
		columnnameslist.add(text);
	}
	return columnnameslist;
	}
		
	//td[text()='Alfreds Futterkiste']/parent::tr/following-sibling::tr
		

}
