package com.Project.steps;

import org.junit.Assert;
import org.openqa.selenium.Keys;

import com.Project.utils.CommonMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LanguageDiffSteps extends CommonMethods {
	@Given("user navigate to employee listpage")
	public void user_navigate_to_employee_listpage() {
		dashboard.navigateToEmployeeList();
	}

	@Given("click on the table id {string} element")
	public void click_on_the_table_id_element(String string) {
	    language.userId.sendKeys(string,Keys.ENTER);
	   jsClick(language.searchBtn);
	   jsClick(language.id);
	}

	@Given("user navigate to qualifications")
	public void user_navigate_to_qualifications() {
	   jsClick(language.qualific);
	}

	@Given("add any available languages")
	public void add_any_available_languages() {
	   jsClick(language.addB);
	}

	@Given("user  enter employees {string}, {string}, {string} and {string}")
	public void user_enter_employees_and(String string, String string2, String string3, String string4) {
		selectDdValue(language.slct1, string);
		selectDdValue(language.slct2, string2);
		selectDdValue(language.slct3, string3);
		sendText(language.comment,string4);
		jsClick(language.lSave);
	}

	@Then("user see language speciality")
	public void user_see_language_speciality() {
		 Assert.assertTrue(language.disp.isDisplayed());
	}

}
