package pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	WebDriver driver;
	
	public Home_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="//button[text()='Open Menu']")
	private WebElement open_menu;
	
	
	
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	private WebElement logout;



	public WebDriver getDriver() {
		return driver;
	}

	
	
	
	public WebElement getOpen_menu() {
		return open_menu;
	}



	public WebElement getLogout() {
		return logout;
	}
	
	
	
	
}
