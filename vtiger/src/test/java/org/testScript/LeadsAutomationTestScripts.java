package org.testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.eva.vtiger.pages.functionality.Createleadbutton;
import com.eva.vtiger.pages.functionality.Homepage;
import com.eva.vtiger.pages.functionality.LeadInformation;
import com.eva.vtiger.pages.functionality.LoginPage;
import com.eva.vtiger.util.Webutil1;
@Test
public class LeadsAutomationTestScripts {
	@Test
	public void testLeadsCreationswithRequaredFieldsOnly() {
	Webutil1 wu = 	new Webutil1();
	wu.launchBrowser("Chrome");
	wu.openUrl("http://localhost:8888/");
		LoginPage login = new LoginPage(wu);
		login.validLogin();
	
	
	Homepage home = new Homepage(wu);
		home.clickLeadsLink();
		Createleadbutton create=	new Createleadbutton(wu);
		create.creatleadfuction();
		LeadInformation leadi=	new LeadInformation(wu);
		leadi.leadInfo();
	
	}

}
