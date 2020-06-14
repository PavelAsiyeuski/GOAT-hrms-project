package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class DashboardPageElements {

	@FindBy(id="menu_pim_viewPimModule")
	public WebElement PIM;
	
	@FindBy(id="menu_pim_addEmployee")
	public WebElement addEmployeeBtn;
	
	@FindBy(id="firstName")
	public WebElement firstName;
	
	@FindBy(id="lastName")
	public WebElement lastName;

	@FindBy(id="btnSave")
	public WebElement saveBtn;
	
	@FindBy(id="menu_admin_viewAdminModule")
	public WebElement adminMenu;
	
	@FindBy(id="menu_admin_Qualifications")
	public WebElement qualificationMenu;
	
	@FindBy(id="menu_admin_viewLicenses")
	public WebElement licenseMenu;
	
	
	
	public DashboardPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}

}
