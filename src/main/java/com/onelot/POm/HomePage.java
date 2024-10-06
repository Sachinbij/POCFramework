package com.onelot.POm;

import javax.management.loading.PrivateClassLoader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.onelot.generic.ReusableMethods;

public class HomePage {



	@FindBy(xpath = "//h1[text()='Dealer Sign Up']")
	private WebElement DealerText;

	@FindBy(id = "firstName")
	private WebElement firstName;

	@FindBy(id = "lastName")
	private WebElement lastName;

	@FindBy(id = "month")
	private WebElement month;

	@FindBy(id = "day")
	private WebElement selectDay;
	@FindBy(id = "year")
	private	WebElement selectYear;

	@FindBy(id = "civilStatus")
	private	WebElement civialStatus;

	@FindBy(xpath = "//label[text()='Business Name']/parent::div//input")
	private WebElement businessName;

	@FindBy(id = "email")
	private WebElement email;
	@FindBy(xpath = "//label[text()='Contact Number']/parent::div//input")
	private	WebElement contactNumber;

	@FindBy(id = "tin")
	private WebElement tinNumber;

	@FindBy(xpath = "//p[contains(text(),'By signing up, you confirm that you')]/ancestor::div[@class='flex items-center gap-2']/input")
	private WebElement agressCheckBox;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement signupbutton;
	
	@FindBy(xpath = "//p[contains(text(),'You have successfully')]")
	private WebElement sucessmessge;
	
	@FindBy(xpath = "//span[text()='Business Name is required']")
	WebElement errorMessageTxt;
	
	public HomePage(WebDriver d) {
		PageFactory.initElements(d, this);
	}

	public WebElement getDealerText() {
		return DealerText;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getSelectDay() {
		return selectDay;
	}

	public WebElement getSelectYear() {
		return selectYear;
	}

	public WebElement getCivialStatus() {
		return civialStatus;
	}

	public WebElement getBusinessName() {
		return businessName;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getContactNumber() {
		return contactNumber;
	}

	public WebElement getTinNumber() {
		return tinNumber;
	}

	public WebElement getAgressCheckBox() {
		return agressCheckBox;
	}

	public WebElement getSignupbutton() {
		return signupbutton;
	}
	
	public WebElement getsucessmesage() {
		return sucessmessge;
	}
	public WebElement getErrorMessage() {
		return errorMessageTxt;
	}
	
	
}
