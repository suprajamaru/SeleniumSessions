package jan23seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-scenario/");
		//nested frame scenario
		//browser
		  //page-elements
		      //iframe1-elements
		          //iframe2-elements
		             //iframe3-elements
		driver.switchTo().frame("pact1").
		                       switchTo().frame("pact2")
		                                 .switchTo().frame("pact3")
		                                        .findElement(By.id("glaf")).sendKeys("love");
//	driver.switchTo().frame("pact1");
//	driver.findElement(By.id("inp_val")).sendKeys("shanu");
//	driver.switchTo().frame("pact2");
//	driver.findElement(By.id("jex")).sendKeys("veeksha");
//	driver.switchTo().frame("pact3");
//	driver.findElement(By.id("glaf")).sendKeys("follow destiny");
//	driver.switchTo().parentFrame();
//	driver.findElement(By.id("jex")).sendKeys("beeshyam");
//	driver.switchTo().parentFrame();
//	driver.findElement(By.id("inp_val")).sendKeys("benna");
//	driver.switchTo().defaultContent();
//	String title=driver.findElement(By.xpath("//h1[contains(@class,'elementor-heading')]")).getText();
//	System.out.println(title);
		
		//use cases
		//f1-f2-f3 yes
		//f3-f2-f1 no by using parentframe()
		//f1-page yes by using defaultcontent()
		//f3-page noooo
		//page-f3-noo
		//page-f1-f2-f3 yes
		//f1-f3 no
		//f3 to f1 yes by writing two parentframe()
		
		
		
		
		
		
	}

}
