package TestNGSessions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionConcept {
@Test
public void homepagetest() {
	String title="naveenautomationlabs";
	Assert.assertEquals(title.contains("naveenautomation"), title, title );
}
}
