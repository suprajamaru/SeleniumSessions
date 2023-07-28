package jan23seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Totallinks_in_page {
	static WebDriver driver;
public static void main(String[] args) {
	driver=new ChromeDriver();
	driver.get("https://www.amazon.com");
	      List<WebElement> linkslist=driver.findElements(By.tagName("a"));
	      int totallinks=linkslist.size();
	      System.out.println(totallinks);
	      //to print all the links text
	      for(int i=0;i<linkslist.size();i++) {
	    	 String text= linkslist.get(i).getText();
	    	// System.out.println(text);
	    	 System.out.println(i+"="+text);
	    	 driver.quit();
	      }
}
}
