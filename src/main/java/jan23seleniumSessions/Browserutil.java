package jan23seleniumSessions;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
/**
 * date:25/3/2023
 * @author supraja mamidipelly
 *
 */
public class Browserutil {
	WebDriver driver;

	/**
	 * This method is intializing the driver on the basis of given browser name
	 * possible browsers are chrome,firefox.edge,safari
	 * 
	 * @param browserName
	 */
	public WebDriver intidriver(String browserName) {
		System.out.println("Launching browser" + browserName);
		if (browserName == null) {
			System.out.println("browser cant be null");
			// throw new MyExeption("BROWSERNAMECANTBENULL");
		}

		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(co);
			break;
		
		
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;
		default:
			System.out.println("plz pass the right browser name" + browserName);
			throw new MyExeption("INVALIDBROWSERNAME");
		}
		return driver;
	}

	/**
	 * This method is used to launch url and please pass the url with https://
	 * @param url
	 */
	public void launchURL(String url) {
		if (url == null) {
			System.out.println("url cant be null");
			throw new MyExeption("URLCANTBENULL");
		}
		if (url.contains("http")) {// https://www.google.com
			driver.get(url);
		} else {
			System.out.println("http(s) is missing");
		}
	}
	public void launchURL(URL url) {
		if (url == null) {
			System.out.println("url cant be null");
			throw new MyExeption("URLCANTBENULL");
		}
        String mainurl=String.valueOf(url);
		if (mainurl.contains("http")) {// https://www.google.com
			driver.navigate().to(url);
		} else {
			System.out.println("http(s) is missing");
		}
	}

	public String getpageTitle() {
		return driver.getTitle();
	}

	public String getpageUrl() {
		return driver.getCurrentUrl();
	}
	public void quitBrowser() {
		driver.quit();
	}
	public void closeBrowser() {
		driver.close();
	}

}
