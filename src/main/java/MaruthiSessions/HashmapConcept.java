package MaruthiSessions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HashmapConcept 
{
	
	static WebDriver driver;
	static HashMap<String,String> hashobj;
	
	public static void main(String[] args)
	{
		
		driver=new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=product/product&product_id=45&search=macbook");
	    List<WebElement>elelist=driver.findElements(By.xpath("(//div[@id='content']//ul[@class='list-unstyled'])[position()=1]/li"));
	    List<String> elelisttext=new ArrayList<String>();
	    
	     hashobj=new HashMap<String,String>();
	    
    for(WebElement e:elelist)
	    {
    	String metatext=e.getText();
    	String[] arraymeta=metatext.split(":");
    	String key=arraymeta[0];
    	String value=arraymeta[1].trim();
    	hashobj.put(key, value);
	    }
    
    System.out.println(hashobj);
    //{Brand= Apple, Availability= In Stock, Product Code= Product 18, Reward Points= 800}
    	 
    	
//	    	elelisttext.add(text);
	    	
	    }
  //  System.out.println(arraymeta);    
    
//	    System.out.println(elelisttext);
//	  //  [Brand: Apple, Product Code: Product 18, Reward Points: 800, Availability: In Stock]     
	    
	}


//(//div[@id='content']//ul[@class='list-unstyled'])[position()=1]/li