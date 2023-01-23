package com.test.cucumber;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.asserts.SoftAssert;

import com.pagefactory.SeleniumPageFactory;
import com.util.BaseConfig;

import com.util.HighLighter;
import com.util.ScreenShot;
import com.util.SeleniumWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdef {

	WebDriver driver;
	SeleniumPageFactory pf;

	@Given("go to application URL")
	public void getSetup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		//wait = implicit ==> HTML ==> HTML DOM page loaded or not => problem = slow down automation
		SeleniumWait.implicitWait(driver, 3);
		//PageLoadTimeout ==> UI/graphics ==> all webelement loaded or not
		SeleniumWait.pageloadTimeout(driver, 3);
		
		pf = new SeleniumPageFactory(driver);
		driver.navigate().to(BaseConfig.getConfig("URL"));
		ScreenShot.getScreenShot(driver, "Home Page");
	}

	@When("Click the login button")
	public void clickLoginBtn() {
		HighLighter.getColor(driver, pf.getSignin().get(0), "green");
		pf.getSignin().get(0).click();
		ScreenShot.getScreenShot(driver, "Login Page");
	}

	@When("Put username")
	public void putUsername() {
		HighLighter.getColor(driver, pf.getEmail(), "blue");
		pf.getEmail().click();
		pf.getEmail().sendKeys(BaseConfig.getConfig("user"));
	}

	@When("Put password")
	public void addPassword() {
		HighLighter.getColor(driver, pf.getPassword(), "purple");
		pf.getPassword().click();
		pf.getPassword().sendKeys(BaseConfig.getConfig("password"));
	}

	@When("Click sign in button")
	public void clickSignInBtn() {
		HighLighter.getColor(driver, pf.getSecondSignIn(), "pink");
		pf.getSecondSignIn().click();
	}

	@Then("Validation login status")
	public void validation() {
		//wait = Explicit wait = any single/specific web element check properties(clickable,visible,enable)
		//explicit wait = webdriver wait
		SeleniumWait.explicitWait(driver, pf.getArrowBtn(), 30);
		HighLighter.getColor(driver, pf.getArrowBtn(),"green");
		pf.getArrowBtn().click();
		ScreenShot.getScreenShot(driver, "Login Validation");
		HighLighter.getColor(driver, pf.getSignOut(),"red");
		boolean status = pf.getSignOut().isDisplayed();
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(status);

		sa.assertAll();
	}
}
