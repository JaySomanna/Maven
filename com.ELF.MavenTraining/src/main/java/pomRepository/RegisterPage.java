package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Register")
	WebElement registerlink;
	public void forRegister() {
		registerlink.click();
	}
	
	@FindBy(id = "gender-male")
	WebElement male;
	public  void forGender() {
		male.click();
	}
	
	@FindBy(id = "FirstName")
	WebElement fname;
	public  void passFname(String firstname) {
		fname.sendKeys(firstname);
	}
	
	@FindBy(id = "LastName")
	WebElement lname;
	public  void passLname(String lirstname) {
		lname.sendKeys(lirstname);
	}
	
	@FindBy(id = "Email")
	WebElement email;
	public void passemail(String email1) {
		email.sendKeys(email1);
	}
	
	@FindBy(id =  "Password")
	WebElement pwd;
	public void passwd(String pwd1) {
		pwd.sendKeys(pwd1);
	}
	
	@FindBy(id = "ConfirmPassword")
	WebElement cpwd;
	public void cofirmpwd(String cpwd1) {
		cpwd.sendKeys(cpwd1);
	}
	
	@FindBy( id="register-button")
	WebElement registerB;
	public void clickRegister1() {
		registerB.click();
	}
	

}
