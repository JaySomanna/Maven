package DemoWebShop;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pomRepository.RegisterPage;
import pomRepository.WelcomePage;
import pomRepository.loginPage;

public class welcomeTcTest extends BaseTest {

	@Test 	
	public void TestCases() {
		WelcomePage wel=new WelcomePage(driver);
 
		
		loginPage login=new loginPage(driver);
		login.enteremail("jays@gmail.com");
		login.enterpwd("Password");
		login.clickLogin();
		
		/*
		 * RegisterPage register = new RegisterPage(driver); register.forRegister();
		 * register.forGender(); register.passFname("jaya"); register.passLname("S");
		 * register.passemail("js@gmail.com"); register.passwd("123456789");
		 * register.cofirmpwd("123456789"); register.clickRegister1();
		 */
	}
}
