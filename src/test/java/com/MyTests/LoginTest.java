/**
 * 
 */
package com.MyTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mypages.HomePage;
import com.mypages.LoginPage;

/**
 * @author Harish
 *
 */
public class LoginTest extends BaseTest {

	
	@Test(priority=1)
	public void verifyLoginPageTitleTest() {
		
		String title=pages.getInstance(LoginPage.class).getLoginPageTitle();
		System.out.println(title);
		Assert.assertEquals(title, "HubSpot Login");
		}
	
	@Test(priority=2)
	public void verifyLoginPageHeaderTest() {
		
		String header=pages.getInstance(LoginPage.class).getLoginPageHeader();
		System.out.println(header);
		Assert.assertEquals(header, "Don't have an account?");
		}
	
	@Test(priority=3)
	
	public void doLoginTest() {
	HomePage homePage =	pages.getInstance(LoginPage.class).doLogin("garpallyharish@gmail.com", "Harish@12345");
	String headerHome = homePage.getHomePageHeader();
	System.out.println(headerHome);
	Assert.assertEquals(headerHome, "Setup Guide");
		
	}
}
