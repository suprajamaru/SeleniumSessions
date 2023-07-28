package MaruthiSessions;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesConcept {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		
		Set<Cookie> cookies=driver.manage().getCookies();
		System.out.println(cookies.size());
		
		for(Cookie cook:cookies)
		{
			System.out.println(cook.getName()+":"+cook.getValue());
		}
		System.out.println("----------------------------------------------------------------------------------------");
		Cookie cookobj=new Cookie("Kingking2222222222222222222222222","123456789111111111111111111111111111111");
		driver.manage().addCookie(cookobj);
		Set<Cookie> cookies2=driver.manage().getCookies();
		for(Cookie cook:cookies2)
		{
			System.out.println(cook.getName()+":"+cook.getValue());
		}
				
		
		
		
		
//		driver.manage().deleteAllCookies();
//		
//		cookies=driver.manage().getCookies();
//		System.out.println(cookies.size());
	}

}
