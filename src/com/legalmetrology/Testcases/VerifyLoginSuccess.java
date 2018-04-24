/**
 * 
 */
package com.legalmetrology.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.legalmetrology.Pages.LoginPage;

import Utility.BrowserFactory;

/**
 * @author Adith
 *
 */
public class VerifyLoginSuccess 
{

	@Test
	public void checklogin()
	{
		WebDriver driver=BrowserFactory.startbrowser("chrome", "http://legalmetrology-qa.rainconcert.biz");
	
		LoginPage login_page=PageFactory.initElements(driver, LoginPage.class);
		
		login_page.login_legal("boban.gm@gmail.com", "Rain@12345");
	}
	
	
}
