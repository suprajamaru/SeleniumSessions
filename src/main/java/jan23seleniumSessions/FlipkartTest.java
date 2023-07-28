package jan23seleniumSessions;

public class FlipkartTest {

	public static void main(String[] args) {
		Browserutil brutil=new Browserutil();
		brutil.intidriver("firefox");
		brutil.launchURL("https://www.flipkart.com/");
		String acttitle=brutil.getpageTitle();
		System.out.println(acttitle);
	verify.equalValues(acttitle, "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
		
	String acturl=brutil.getpageUrl();
	verify.containsValues(acturl,"flipkart.com");
	brutil.quitBrowser();

	}

}
