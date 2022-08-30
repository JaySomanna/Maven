package DemoWebShop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		
		WebElement register=driver.findElement(By.className("ico-register"));
		register.click();
		
		WebElement gender=driver.findElement(By.id("gender-male"));
		gender.click();
		
		WebElement firstName=driver.findElement(By.name("FirstName"));
		firstName.sendKeys("Jayi");
		
		WebElement lastname=driver.findElement(By.name("LastName"));
		lastname.sendKeys("S");
		
		WebElement email=driver.findElement(By.name("Email"));
		email.sendKeys("jays132@gmail.com");
		
		WebElement password=driver.findElement(By.name("Password"));
		password.sendKeys("Password3214");
		
		WebElement confirmpassword=driver.findElement(By.name("ConfirmPassword"));
		confirmpassword.sendKeys("Password3214");
		
		WebElement registerButton=driver.findElement(By.name("register-button"));
		registerButton.click();
		
	}

}
