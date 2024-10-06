package com.onelot.testscripts;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.onelot.POm.HomePage;
import com.onelot.generic.ListenersImplementation;
import com.onelot.generic.OneLotbase;
import com.onelot.generic.ReusableMethods;

import io.opentelemetry.api.logs.Logger;


public class Verifyuserregister extends OneLotbase {
	boolean result;
	
	@Test(groups = "regression")
	public void enterTheDealerDetails() throws InterruptedException {
		System.out.println("EnterTheDealer is strted");
		HomePage hm=new HomePage(d);
		Thread.sleep(5000);
		System.out.println("beforeAssert");
		 result=hm.getDealerText().isDisplayed();
		Assert.assertTrue(result);
		System.out.println("Afterassert");
		hm.getFirstName().sendKeys("ron");
		hm.getLastName().sendKeys("terd");
		ReusableMethods r=new ReusableMethods();
		r.selectingtheOptipns(hm.getMonth(), "January");
		hm.getSelectDay().sendKeys("12");
		hm.getSelectYear().sendKeys("2000");
		r.selectingtheOptipns(hm.getCivialStatus(), "Single");
		hm.getBusinessName().sendKeys("testmantra");
		hm.getEmail().sendKeys("testrjonetwoq@gmail.com");
		hm.getContactNumber().sendKeys("8866442207");
		hm.getTinNumber().sendKeys("887755556");
		hm.getAgressCheckBox().click();
		hm.getSignupbutton().click();
	result	=hm.getsucessmesage().isDisplayed();
	Assert.assertTrue(result);
		System.out.println("EnterTheDealer is ended");
		
		
	}
	

	

}
