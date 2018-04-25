/**
 * 
 */
package com.legalmetrology.Testcases;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
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
		WebDriver driver=BrowserFactory.startbrowser("firefox", "http://legalmetrology-qa.rainconcert.biz/login");
	
		LoginPage login_page=PageFactory.initElements(driver, LoginPage.class);
		
		login_page.login_legal("boban.gm@rainconcert.in", "Rain12345");
		
	}
	

}

