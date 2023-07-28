package jan23seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultilevelMenuHandling {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
	By parentmenu=By.xpath("//a[@qa='categoryDD']");
	By level1=By.linkText("Foodgrains, Oil & Masala");
	By level2=By.linkText("Dals & Pulses");
	By level3=By.linkText("Cereals & Millets");
//	Actions act=new Actions(driver);
//	WebElement parentmenuele=driver.findElement(parentmenu);
//	act.moveToElement(parentmenuele).build().perform();
//	Thread.sleep(4000);
//	WebElement level1ele=driver.findElement(level1);
//	act.moveToElement(level1ele).build().perform();
//	Thread.sleep(4000);
//	WebElement level2ele=driver.findElement(level2);
//	act.moveToElement(level2ele).build().perform();
//	Thread.sleep(4000);
//	driver.findElement(level3).click();
	Multilevelmenu(parentmenu,"Foodgrains, Oil & Masala","Dals & Pulses","Cereals & Millets");
}
	public static void Multilevelmenu(By parentmenu,String level1,String level2,String level3) throws InterruptedException {
		Actions act=new Actions(driver);
		WebElement parentmenuele=driver.findElement(parentmenu);
		act.moveToElement(parentmenuele).build().perform();
		Thread.sleep(4000);
		WebElement level1ele=driver.findElement(By.linkText(level1));
		act.moveToElement(level1ele).build().perform();
		Thread.sleep(4000);
		WebElement level2ele=driver.findElement(By.linkText(level2));
		act.moveToElement(level2ele).build().perform();
		Thread.sleep(4000);
		driver.findElement(By.linkText(level3)).click();

	}
}
