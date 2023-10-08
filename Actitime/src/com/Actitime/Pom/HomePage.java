package com.Actitime.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{
//decleration
	
	@FindBy(xpath = "//div[.='Tasks']")
	private WebElement tasktab;
	
	@FindBy(id = "logoutLink")
	private WebElement lgoutlink;
	
	
	//inilitilization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public WebElement getTasktab() {
		return tasktab;
	}


	public WebElement getLgoutlink() {
		return lgoutlink;
	}
	
	
}
