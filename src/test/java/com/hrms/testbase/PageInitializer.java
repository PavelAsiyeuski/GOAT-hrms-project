package com.hrms.testbase;

import com.hrms.pages.DashboardPageElements;
import com.hrms.pages.LoginPageElements;
import com.hrms.pages.QualificationPageElements;

public class PageInitializer extends BaseClass{

	public static QualificationPageElements qualification;
	public static LoginPageElements login;
	public static DashboardPageElements dashboard;
	
	public static void initialize() {
		
		
		qualification=new QualificationPageElements();
		login=new LoginPageElements();
		dashboard=new DashboardPageElements();
	}
	
}
