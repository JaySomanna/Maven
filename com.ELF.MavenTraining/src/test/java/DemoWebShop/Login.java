package DemoWebShop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
public static void main(String[] args) {
		
		String Email="jays@gmail.com";
		String Password="Password";
		
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		
		WebElement login=driver.findElement(By.className("ico-login"));
		login.click();
		
		WebElement email=driver.findElement(By.id("Email"));
		email.sendKeys(Email);
		
		WebElement password=driver.findElement(By.id("Password"));
		password.sendKeys(Password);
		
		WebElement remember=driver.findElement(By.id("RememberMe"));
		remember.click();
	
		
		WebElement loginbutton=driver.findElement(By.className("login-button"));
		loginbutton.click();
	}


}
