package com.Eagercrow.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.Eagercrow.pages.Browserfactory;

public class LoginTest  {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		@Test
		 public void openapp(){
		 Browserfactory.openbrowser("browser","chrome", "https://www.crmpro.com/" );
			
		 }
	
		
		
	}



