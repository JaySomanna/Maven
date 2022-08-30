package DemoWebShop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest {
	
	WebDriver driver;
	
	@Parameters("browser") //broser name must be given at runtime
	@BeforeTest
	public void setUpBrowser(@Optional("chrome") String browserName) {
		if(browserName.contains("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browserName.contains("firefox")) {
			System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
			driver=new EdgeDriver();
		}
		else {
			System.out.println("Browser name is not specified");
		}
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
	}
	
	@AfterTest
	public void browserTearDown() {
		driver.close();
	}

}
