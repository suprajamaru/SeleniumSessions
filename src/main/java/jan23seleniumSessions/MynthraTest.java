package jan23seleniumSessions;

public class MynthraTest {
public static void main(String[] args) {
	Browserutil brutil=new Browserutil();
	brutil.intidriver("Edge");
	brutil.launchURL("https://www.myntra.com/?utm_source=dms_bing&utm_medium=bing_cpc&utm_campaign=Bing_Brand_BMM_Desktop&utm_source=bing&msclkid=73559ad5f0af1a1bdd8dfecb09c4e46e&utm_term=%2Bmyntra%5C&utm_content=Myntra_Generic");
	String acttitle=brutil.getpageTitle();
	System.out.println(acttitle);
verify.equalValues(acttitle, "Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra");
String acturl=brutil.getpageUrl();
verify.containsValues(acturl,"mynthra.com");
brutil.quitBrowser();

}
}
