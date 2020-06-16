package com.Project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Project.testbase.BaseClass;
import com.Project.utils.CommonMethods;

public class LanguagePageElements extends CommonMethods{
	
	@FindBy(xpath="//*[@id=\"menu_admin_viewAdminModule\"]/b")
	public WebElement admin;
	
	@FindBy(xpath="//a[contains(text(),'Qualifications')]")
	public WebElement qualification;
	
	@FindBy(xpath="//a[@id='menu_admin_viewLanguages']")
	public WebElement lang;
	
	@FindBy(id="btnAdd")
	public WebElement addBtn;
	
	@FindBy(id="language_name")
	public WebElement lanName;
	
	@FindBy(id="btnSave")
	public WebElement btnSave;
	
	@FindBy(xpath="//input[@id='language_name']")
	public WebElement trk;
  
	
	//for qualification
	@FindBy(xpath="//table[@class='table hover']//tbody//tr//td[2]/a")
	public WebElement idName;
	
	@FindBy(id="empsearch_id")
	public WebElement userId;
	
	@FindBy(id="searchBtn")
	public WebElement searchBtn;
	
	@FindBy(xpath="//table[@id='resultTable']//td[2]/a")
	public WebElement id;

	
	@FindBy(xpath="//ul[@id='sidenav']//li[10]//a")
	public WebElement qualific;
	
	@FindBy(id="addLanguage")
	public WebElement addB;
	
	@FindBy(xpath="//select[@id='language_code']")
	public WebElement slct1;
	
	@FindBy(linkText="Turkce")
	public WebElement tr;
	
	@FindBy(xpath="//select[@id='language_lang_type']")
	public WebElement slct2;
	
	@FindBy(linkText="Reading")
	public WebElement spking;
	
	@FindBy(xpath="//select[@id='language_competency']")
	public WebElement slct3;
	
	@FindBy(linkText="Good")
	public WebElement lComp;
	
	@FindBy(id="language_comments")
	public WebElement comment;
	
	@FindBy(id="btnLanguageSave")
	public WebElement lSave;
	
	@FindBy(xpath="//td[@class='name']/a")
	public WebElement disp;
	
	public LanguagePageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	public void navigateToQualifications() {
		jsClick(admin);
		wait(2);
		Actions act= new Actions(BaseClass.driver);
		act.moveToElement(qualification).build().perform();
		click(lang);
		
	}

	public void ddValue() {
		selectDdValue(lang, "Languages");
	}
}
