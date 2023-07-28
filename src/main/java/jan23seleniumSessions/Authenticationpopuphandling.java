package jan23seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authenticationpopuphandling {
//Authentication popup-->we will recognize this popup if it is having un and pswrd and we cant inspect that popup
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();	
		driver.get("https://www.the-internet.herokuapp.com/basic-auth");
		
		
		
	}
	
	
	
	
}
