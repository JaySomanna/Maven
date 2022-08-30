package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

	public loginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className ="email")
	WebElement emailTF;
	public void enteremail(String email) {
		emailTF.sendKeys(email);
	}
	
	@FindBy(className = "password")
	WebElement pwdTF;
	public void enterpwd(String pwd) {
		pwdTF.sendKeys(pwd);
	}
	
	@FindBy(linkText = "Log in")
	WebElement loginB;
	public void clickLogin() {
		loginB.click();
	}

}
