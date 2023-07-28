package MaruthiSessions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotConcept {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		TakesScreenshot dobj=(TakesScreenshot)driver;
		File file=dobj.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("D:\\/Amazon_Home.jpg"));
		
	
		
	}
		

}
