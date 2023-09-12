package pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
/**
 * //create a constructor to receive driver and 
 * load pagefactory class and access this class elements
 * @param driver
 */
	public Login_page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@id='user-name']")
	private WebElement user_name;
	
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement pass_word;

	
	
	@FindBy(xpath="//input[@id='login-button']")
	private WebElement login_button;
	
	
	

	public WebElement getUser_name() {
		return user_name;
	}


	public WebElement getPassword() {
		return pass_word;
	}
	
	public WebElement getLogin_button() {
		return login_button;
	}
	
	
	
	
	
	public void login_to_application(String username,String password)
	{
		user_name.sendKeys(username);
		pass_word.sendKeys(password);
		login_button.click();
	}
	
	
	
	
}
