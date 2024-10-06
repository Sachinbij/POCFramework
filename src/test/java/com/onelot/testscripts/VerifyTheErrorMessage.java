package com.onelot.testscripts;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.onelot.POm.HomePage;
import com.onelot.generic.OneLotbase;

public class VerifyTheErrorMessage extends OneLotbase {
	
	@Test(groups = "smoke")
	public void errorMessage() throws InterruptedException {
		
		HomePage h=new HomePage(d);
		h.getSignupbutton().click();
		//Thread.sleep(4000);
		
		WebDriverWait wait=new WebDriverWait(d, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(h.getErrorMessage()));
	String error=	h.getErrorMessage().getText();
	System.out.println(error);
	boolean res=h.getSignupbutton().isDisplayed();
	Assert.assertTrue(res);

		
	}

}

