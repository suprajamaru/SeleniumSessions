package jan23seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Totalimages_in_page {
	static WebDriver driver;
public static void main(String[] args) {
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
//	    List<WebElement>linkslist=driver.findElements(By.tagName("a"));
//	    List<String>linkstext=new ArrayList<String>();
//	   int totallinks= linkslist.size();
//	   System.out.println(totallinks);
//	   for(WebElement e:linkslist) {
//		  String text= e.getText();
//		  linkstext.add(text);
//		  
//		  if( linkstext.contains("Tablets")) {
//			  System.out.println("pass");
//		  }
//		  else {
//			  System.out.println("fail");
//		  }
//	   }
	//images count in the amazon app
	List<WebElement>imageslist=driver.findElements(By.tagName("img"));
	List<String>linkstext=new ArrayList<String>();
	int totalimages=imageslist.size();
	System.out.println( totalimages);
	for(WebElement e:imageslist) {
	  String text= e.getAttribute("alt");
	  //System.out.println(text);
	  linkstext.add(text);
  
}
	if(linkstext.contains("Gift for boys")) {
		System.out.println("pass");
	}
	else {
		System.out.println("fail");
	}
		 
}
}
