package com.testleaf;

import org.testng.annotations.Test;

import com.leafobject.BaseClass;
import com.leafobject.EditObject;

public class EditTestCase {

	BaseClass base;
	EditObject editobj;
	
	public EditTestCase() {
		base = new BaseClass();
		editobj = new EditObject();
	}
	@Test
	public void edit() {
		base.lauchBrowser("chrome");
		base.launchURL("http://www.leafground.com/");
		editobj.getBtnEdit().click();
	}
}
