/**
 * 
 */
package com.mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author Harish
 *
 */
public class HomePage extends BasePage {

	private By header = By.xpath("//i18n-string[@data-key='login.signupLink.text']");
	
	public HomePage(WebDriver driver) {
		super(driver);
		
	}

	/**
	 * @return the header
	 */
	public WebElement getHeader() {
		return getElement (header);
	}

	//page actions;
	
	public String getHomePageTitle() {
		return getPageTitle();
	
	}
    
	public String getHomePageHeader() {
		return getPageHeader(header);
	}
}
