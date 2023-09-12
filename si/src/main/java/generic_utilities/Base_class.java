package generic_utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pom_classes.Home_Page;
import pom_classes.Login_page;

public class Base_class {
	
	public WebDriver driver;
	public WebDriver_Utilities wb= new WebDriver_Utilities();
	@BeforeClass
	public void configureBeforeClass()
	{
		System.out.println("launching the browser");
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		
		
	}
	
	@BeforeMethod
	public void configureBeforeMethod()
	{
		
		driver.get("https://www.saucedemo.com/");
		
		Login_page login = new Login_page(driver);
		
		login.login_to_application("standard_user","secret_sauce");
		
	}
	
	
	@AfterMethod
	public void configureAfterMethod()
	{
		Home_Page hp = new Home_Page(driver);
		hp.getLogout().click();
		
		
	}
	
	@AfterClass
	public void configureAfterClass() {
		System.out.println("=============Close the Browser=======");
		//driver.quit();
	}		
	
	
	
	
	
	
	
	
}
