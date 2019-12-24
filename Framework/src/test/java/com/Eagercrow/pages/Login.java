package com.Eagercrow.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {

	
		
	@FindBy(id="username") WebElement user;
	
	@FindBy(name="password")
	WebElement pwd;
	
	@FindBy(xpath="//input[@type='submit']") 
	WebElement login;
	

	
	public void enteruser(String username,String password) {
		user.sendKeys(username);
		pwd.sendKeys(password);
        login.click();
	}
		
	}


