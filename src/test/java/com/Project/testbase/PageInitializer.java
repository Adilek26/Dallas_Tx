package com.Project.testbase;

import com.Project.pages.DashboardPageElements;
import com.Project.pages.LanguagePageElements;
import com.Project.pages.LoginPageElements;
import com.Project.pages.PersonalDetailsPageElements;

//Initialize all pages classes and stores reference in static variables
//that will called /used in test classes

public class PageInitializer extends BaseClass{

	public static LoginPageElements login;
	public static PersonalDetailsPageElements pdetails;
	public static DashboardPageElements dashboard;
	public static LanguagePageElements language;
	
	public static void initialize() {
		
		login=new LoginPageElements();
		pdetails=new PersonalDetailsPageElements();
		dashboard=new DashboardPageElements();
		language=new LanguagePageElements();
	}
	
}
