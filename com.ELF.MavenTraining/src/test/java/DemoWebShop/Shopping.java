package DemoWebShop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

public class Shopping {
	public static void main(String[] args) {
		String Email="jays@gmail.com";
		String Password="Password";
		
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
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
		
		Actions act = new Actions(driver);	
		WebElement ele = driver.findElement(By.partialLinkText("ELECTRONICS"));
		ele.click();
		driver.findElement(By.xpath("//img[@title='Show products in category Cell phones']")).click();
		driver.findElement(By.xpath("//img[@alt='Picture of Smartphone']")).click();
		driver.findElement(By.id("add-to-wishlist-button-43")).click();
		driver.findElement(By.xpath("//span[text()='Wishlist']")).click();
		
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(Email, Password);
		
	}

}
