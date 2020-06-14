package com.hrms.steps;


import java.util.List;
import java.util.Map;

import org.openqa.selenium.support.ui.Select;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddLicenceSteps extends CommonMethods{
	@Given("user logging in as an admin")
	public void user_logging_in_as_an_admin() {
		sendText(login.username,ConfigsReader.getProperty("login"));
		sendText(login.password,ConfigsReader.getProperty("pass"));
		click(login.loginBtn);
		wait(2);
	}

	@Given("user is creating a new employee profile")
	public void user_is_creating_a_new_employee_profile() {
	   click(dashboard.PIM);
	   wait(2);
	   click(dashboard.addEmployeeBtn);
	   sendText(dashboard.firstName,"Pavel");
	   sendText(dashboard.lastName,"Asiyeuski");
	   click(dashboard.saveBtn);
	}

	@When("user navigates to Qualifications")
	public void user_navigates_to_Qualifications() {
	   jsClick(qualification.qualification);
	}

	@Then("user has to be able to add different licenses")
	public void user_has_to_be_able_to_add_different_licenses(DataTable dataTable) {
		
		Select selectType=new Select(qualification.selectLicenseType);
		List <Map<String,String>> list=dataTable.asMaps();
		for (Map<String,String> el:list) {
			jsClick(qualification.addLicense);
			selectType.selectByVisibleText(el.get("Type"));
			sendText(qualification.licenseNumber,el.get("LicenseNum"));
			sendText(qualification.licenseIssueDate,el.get("IssueDate"));
			sendText(qualification.licenseEndDate,el.get("ExpDate"));
			jsClick(qualification.saveBtn);
			
		}
	}
	
	@When("user navigates to Admin menu and Qualification")
	public void user_navigates_to_Admin_menu_and_Qualification() {
	   jsClick(dashboard.adminMenu);
	   jsClick(dashboard.qualificationMenu);
	   jsClick(dashboard.licenseMenu);
	   
	}

	@Then("user is able to create new license")
	public void user_is_able_to_create_new_license() {
	   jsClick(qualification.addBtn);
	   sendText(qualification.licenseName,"Java Certificate");
	   jsClick(qualification.saveLicenseBtn);
	}

	
}


