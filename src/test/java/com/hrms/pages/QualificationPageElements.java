package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class QualificationPageElements {

	@FindBy(xpath="//ul[@id='sidenav']/li/a[text()='Qualifications']")
	public WebElement qualification;
	
	@FindBy (id="addLicense")
	public WebElement addLicense;
	
	@FindBy (id="license_code")
	public WebElement selectLicenseType;
	
	@FindBy (id="license_license_no")
	public WebElement licenseNumber;
	
	@FindBy (id="license_date")
	public WebElement licenseIssueDate;
	
	@FindBy (id="license_renewal_date")
	public WebElement licenseEndDate;

	@FindBy(id="btnLicenseSave")
	public WebElement saveBtn;
	
	@FindBy(id="btnAdd")
	public WebElement addBtn;
	
	@FindBy(id="license_name")
	public WebElement licenseName;
	
	@FindBy(id="btnSave")
	public WebElement saveLicenseBtn;

	public QualificationPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
}
