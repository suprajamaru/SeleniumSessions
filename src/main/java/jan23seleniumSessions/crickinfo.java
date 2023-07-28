package jan23seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class crickinfo {
static WebDriver driver;
public static void main(String[] args) throws InterruptedException {
	driver=new ChromeDriver();
	driver
	.get("https://www.espncricinfo.com/series/indian-premier-league-2023-1345038/delhi-capitals-vs-mumbai-indians-16th-match-1359490/full-scorecard");
	String text=getwicketkeepername("Yash Dhull");
	System.out.println(text);
	List<String> list=getscorecard("Yash Dhull");
	System.out.println(list);
}
public static String getwicketkeepername(String batmanname) {
	return driver.findElement(By.xpath("//span[text()='"+batmanname+"']/ancestor::td/following-sibling::td/span")).getText();
}
public static List<String> getscorecard(String batmanname) {
List<WebElement>scorelist=	driver
	.findElements(By
			.xpath("//span[text()='"+batmanname+"']/ancestor::td/following-sibling::td[contains(@class,'ds-text-right')]"));
	List<String>scorelist1=new ArrayList();
	for(WebElement e:scorelist)
	{
		String text=e.getText();
		scorelist1.add(text);
	}
	return scorelist1;
}

}