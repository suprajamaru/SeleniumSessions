package jan23seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonTest {
public static void main(String[] args) {
	Browserutil brutil=new Browserutil();
WebDriver driver =brutil.intidriver("chrome");
brutil.launchURL("https://www.amazon.com");
String acttitle=brutil.getpageTitle();
System.out.println(acttitle);
verify.equalValues(acttitle,"Amazon.com. Spend less. Smile more.");

//if(acttitle.equals("amazon.com")) {
//	System.out.println("pass--title");
//}
//else {
//	System.out.println("fail--title");
//}
String actUrl=brutil.getpageUrl();
verify.containsValues(actUrl, "amazon.com");
By search=By.id("twotabsearchtextbox");
ElementUtil eleutil=new ElementUtil(driver);
eleutil.CheckElementIsDisplayed(search);
if(eleutil.CheckElementIsDisplayed(search)) {
	System.out.println("Element is displayed");
}
else {
	System.out.println("element not displayed");
}
By image=By.tagName("img");
By links =By.tagName("a");
List<String> imgattrlist=eleutil. getAttributeValue(image, "alt");
if(imgattrlist.contains("Computer mice")) {
	System.out.println("Computer mice"+"pass");
}
else {
	System.out.println("fail");
}
//List<String> linksattrlist=eleutil. getAttributeValue(links, "href");

//System.out.println(linksattrlist);
//if(imgattrlist.contains("Computer mice")) {
//	System.out.println("Computer mice"+"pass");
//}
//else {
//	System.out.println("fail");
//}
int numbercoflinks=eleutil.getElementsCount(links);
System.out.println( numbercoflinks);


By r8panellinks=By.xpath("//div[@class='navFooterLinkCol navAccessibility']//li");
List<String>eletextlist=eleutil.getElementsTextList(r8panellinks);
System.out.println(eletextlist);
if(eletextlist.contains("Blog")) {
	System.out.println("pass");
}
else {
	System.out.println("fail");
}
eleutil.clickElementfrompagesection(r8panellinks,"Blog");





	}
}

