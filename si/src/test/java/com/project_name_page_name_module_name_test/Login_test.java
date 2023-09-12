package com.project_name_page_name_module_name_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import generic_utilities.Base_class;
import io.github.bonigarcia.wdm.WebDriverManager;
import pom_classes.Home_Page;

public class Login_test extends Base_class {

@Test
public void logintest() throws InterruptedException
{

	Home_Page hp = new Home_Page(driver);
	hp.getOpen_menu().click();
	Thread.sleep(4000);
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
}
