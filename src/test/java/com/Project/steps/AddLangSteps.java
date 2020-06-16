package com.Project.steps;

import org.junit.Assert;

import com.Project.utils.CommonMethods;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AddLangSteps extends CommonMethods{
	@Given("user is logged with valid admin credentials")
	public void user_is_logged_with_valid_admin_credentials() {
	    login.login();
	    wait(5);
	    
	}

	@Given("As an Admin  navigates to Qualifications and Languages")
	public void as_an_Admin_navigates_to_Qualifications_and_Languages() {
		wait(3);
	   language.navigateToQualifications();
	   wait(3);
	   
	}

	@Given("user  click to add button")
	public void user_click_to_add_button() {
		language.addBtn.click();
	}

	@Given("create a name and save")
	public void create_a_name_and_save() {
	   sendText(language.trk,"Turkce");
	   language.btnSave.click();
	   
	}

	@Then("language name succesfuly added")
	public void language_name_succesfuly_added() {
		Assert.assertTrue(language.trk.isDisplayed());  
	  
	}

}
