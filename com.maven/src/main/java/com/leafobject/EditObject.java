package com.leafobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditObject extends BaseClass {
	public EditObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a")
	private WebElement btnEdit;
	
	@FindBy(id="email")
	private WebElement txtEmail;
	
	@FindBy(xpath="//*[@id=\'contentblock\']/section/div[2]/div/div/input")
	private WebElement txtAppand;
	
	public WebElement getBtnEdit()
	{
		return btnEdit;
	}

	
	

}
