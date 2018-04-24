/**
 * 
 */
package com.legalmetrology.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


/**
 * @author Syam
 *
 */
public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(how=How.XPATH,using="/html/body/div/div/div/form/h3") 
	WebElement HomepageLabel;
	
	@FindBy(how=How.ID,using="webmaster")
	WebElement UserTypeWebmaster;
	
	@FindBy(how=How.ID,using="establishment")
	WebElement UserTypeEstablishment;
	
	@FindBy(how=How.ID,using="callcenter") 
	WebElement UserTypeCallcenter;
	
	@FindBy(how=How.ID,using="client") 
	WebElement UserTypeClient;
	
	@FindBy(how=How.ID,using="email") 
	WebElement UserName;
	
	@FindBy(how=How.ID,using="password") 
	WebElement Password;
	
	@FindBy(how=How.CLASS_NAME,using="remember_me") 
	WebElement RememberMe;
	
	@FindBy(how=How.XPATH,using="/html/body/div/div/div/form/button") 
	WebElement SignIn;
	
	@FindBy(how=How.ID,using="forgot_pass") 
	WebElement ForgotPassword;
	
	public void login_legal(String uid,String pass)
	{
		UserTypeWebmaster.click();
		UserName.sendKeys(uid);
		Password.sendKeys(pass);
		SignIn.submit();
	}
}
