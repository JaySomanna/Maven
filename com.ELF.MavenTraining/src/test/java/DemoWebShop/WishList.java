package DemoWebShop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import okio.Options;

public class WishList {
public static void main(String[] args) {
		
		String Email="jays@gmail.com";
		String Password="Password";
		
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
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
		
		Actions act=new Actions(driver);
		
		driver.findElement(By.linkText("Books")).click();	
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();

	}
}
