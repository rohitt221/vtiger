package com.eva.vtiger.pages.functionality;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eva.vtiger.util.Webutil1;
import com.eva.vtigers.pages.OR.LeadInformationOR;

public class LeadInformation extends LeadInformationOR{
 private Webutil1 wu;
public LeadInformation(Webutil1 wuobject) {
	super(wuobject);
	wu=wuobject;
}
public void leadInfo() {
	wu.selectDropDown(getsearchDropDown(),"Mr.");
	wu.type(getfirstname(), "Rohit");
	wu.type(getlastname(),"yadav");
	wu.type(getcompanyname(), "RohitPrivateLimited", "companyname");
	wu.type(gettitle(), "Electronic product ");
	wu.selectDropDown(getleadsource(), "Partner");
	wu.selectDropDown(getindustry(), "Manufacturing");
	wu.type(getannulrevenue(), "9876543");
	wu.type(getNumberOfEmployee(), "1500");
	wu.type(getSecondryEmial(), "yadavrohit91002@gmail.com");
	wu.type(getPhone(), "6306872103");
	wu.type(getMobile(), "6306872102");
	wu.type(getFax(), "rohit123");
	wu.type(getEmail(), "yadavrohit3569@gmail.com");
	wu.selectDropDown(getLeadStatus(), "Not Contacted");
	wu.selectDropDown(getRate(), "Active");
	wu.save(getSave());
  
	
	
	
}
}
