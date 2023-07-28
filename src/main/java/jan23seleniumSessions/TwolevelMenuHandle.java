package jan23seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TwolevelMenuHandle {
	static WebDriver driver;
public static void main(String[] args) throws InterruptedException {
	driver=new ChromeDriver();
	driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");
By parentmenu=By.className("menulink");
//Actions action=new Actions(driver);
//action.moveToElement(parentmenu).build().perform();

By childmenu=By.linkText("ARTICLES");
//childmenu.click();
//twolevelmenuhandle(parentmenu, childmenu);
Twolevelmenuhandle(parentmenu,"ARTICLES");

}
public static void twolevelmenuhandle(By parentmenu,By childmenu) {
WebElement parentele=	driver.findElement(parentmenu);
Actions action=new Actions(driver);
action.moveToElement(parentele).build().perform();
WebElement childele=driver.findElement(childmenu);
	childele.click();
	}
public static void Twolevelmenuhandle(By parentmenu,String childmenulinktext) throws InterruptedException {
WebElement parentele=	driver.findElement(parentmenu);
Actions action=new Actions(driver);
action.moveToElement(parentele).build().perform();
Thread.sleep(4000);
driver.findElement(By.linkText(childmenulinktext)).click();;
	}


}
