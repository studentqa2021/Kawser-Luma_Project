package com.pagefactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumPageFactory {
	WebDriver driver;

	public SeleniumPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@class='authorization-link']")
	private List <WebElement> signin;
	@FindBy(xpath = "//*[@id = 'email']")
	private WebElement email;
	@FindBy(xpath = "//*[@title = 'Password']")
	private WebElement password;
	@FindBy(xpath = "//*[@class = 'action login primary']")
	private WebElement secondSignIn;
	@FindBy(xpath = "//*[@class='greet welcome']") 
	private List<WebElement> welcome;
	@FindBy(xpath = "(//*[@class='action switch'])[1]")
	private WebElement arrowBtn;
	@FindBy(xpath = "//*[(//*[@class='authorization-link']//a)[1]]")
	private WebElement signOut;
	

	public List<WebElement> getSignin() {
		return signin;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSecondSignIn() {
		return secondSignIn;
	}

	public List<WebElement> getWelcome() {
		return welcome;
	}
	
	public WebElement getArrowBtn() {
		return arrowBtn;
	}

	public WebElement getSignOut() {
		return signOut;
	}
	
	
}
