package generic_utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebDriver_Utilities {

	
	
	public void mousehover(WebDriver driver,WebElement element)
	{
		Actions action=new Actions(driver);
		
		action.moveToElement(element).perform();
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
