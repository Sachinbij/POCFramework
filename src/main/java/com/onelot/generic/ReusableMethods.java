package com.onelot.generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ReusableMethods extends OneLotbase {
	
	
	public void selectingtheOptipns(WebElement dropdownElement, String text) {
		
		Select sel =new Select( dropdownElement);
		sel.selectByVisibleText(text);
	}
	

	

}
