package TestNGSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGfeatures {
@BeforeSuite	
	public void DBconnection() {
	System.out.println("BS db connection connected");
}
@BeforeTest
public void Createuser() {
	System.out.println("Bt-create user");
}
@BeforeClass
public void OpenBrowser() {
	System.out.println("Bt OPEN BROWSER");
}
@BeforeMethod
public void AmazonLogin() {
	System.out.println("login with un and pswrd");
}

@Test(priority=0)
public void searchTest() {
	System.out.println("search test");
}

@Test(priority=0)
public void Addtocarttest() {
	System.out.println("Test-add to cart test");
}
@AfterMethod
public void logoutApp() {
	System.out.println("AM-logout");
}
@AfterClass
public void closeBrowser(){
	System.out.println("AC-closing browser");
}
@AfterTest
public void deleteUser() {
	System.out.println("AT-delete user test");
}
@AfterSuite
public void closeDBconnection() {
	System.out.println("As closeDB connection");
}



	

}
