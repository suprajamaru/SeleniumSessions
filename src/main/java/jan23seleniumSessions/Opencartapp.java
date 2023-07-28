package jan23seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Opencartapp {
public static void main(String[] args) {
	Browserutil  broutil=new Browserutil();
	WebDriver driver=broutil.intidriver("chrome");
	broutil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	String acturl=broutil.getpageUrl();
	System.out.println(acturl);
    System.out.println(verify.containsValues(acturl, "Register Account"));
   String acttitle= broutil.getpageTitle();
   System.out.println(acttitle);
    System.out.println(verify.equalValues(acttitle, "naveenautomation labs"));
    By firstname=By.id("input-firstname");
    By lastname=By.id("input-lastname");
    By email=By.id("input-email");
    By telephone=By.id("input-telephone");
    By password=By.id("input-password");
    By passinputconfirm=By.id("input-confirm");
    By privacycheck=By.xpath("//*[@id=\"content\"]/form/div/div/input[1]");
    By continue_btn=By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
    By text=By.xpath("//*[@id=\"content\"]/h1");
    By search=By.name("search");
    By Footerlinks=By.xpath("footer//a");
    ElementUtil eleutil=new ElementUtil(driver);
    eleutil.clickElementfrompagesection(Footerlinks, "aboutus");
    System.out.println("clicked");
//   . Boolean search1=eleutil.CheckElementIsDisplayed(search);
//    System.out.println(search1);
//   String fn= eleutil.doGetsingleAttributeValue(firstname, "placeholder");
//   System.out.println(fn);
//   String ln= eleutil.doGetsingleAttributeValue(lastname, "placeholder");
//   System.out.println(ln);
//   String emailid= eleutil.doGetsingleAttributeValue(email, "placeholder");
//   System.out.println(emailid);
//   String telenum= eleutil.doGetsingleAttributeValue(telephone, "placeholder");
//   System.out.println(telenum);
//   String pswrd= eleutil.doGetsingleAttributeValue(password, "placeholder");
//   System.out.println(pswrd);
//   String pswrdinput= eleutil.doGetsingleAttributeValue(passinputconfirm, "placeholder");
//   System.out.println(pswrdinput);
//       eleutil.doSendkeys(firstname, "chinnodu");
//       String enteredtxt=eleutil.doGetsingleAttributeValue(firstname, "value");
//       System.outprintln(enteredtxt);
//       eleutil.doSendkeys(lastname, "mamidipelly");
//       String enteredtxt1=eleutil.doGetsingleAttributeValue(lastname, "value");
//       System.out.println(enteredtxt1);
//       
//       
////   
////    eleutil.doSendkeys(email, "junnu@gmail.com");
////    eleutil.doSendkeys(telephone, "8317567");
////    eleutil.doSendkeys(password, "134565");
////    eleutil.doSendkeys(passinputconfirm,"134565");
////    eleutil.doClick(privacycheck);
////    eleutil.doClick(continue_btn);
////    String text1=eleutil.getElementText(text);
////    System.out.println(text1);
////    broutil.quitBrowser();
//    





}
}
