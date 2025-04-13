package stepDefinitions;

import org.testng.Assert;
import Utility.TestContextSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObjetcs.LandingPageObject;
import pageObjetcs.OffersPageObject;


//single responsibility principle
//loosely coupled
//factory design pattern

public class OfferPageStepDefinition {

	
	public String offersPageProductName;
	TestContextSetup testContextSetup;
	OffersPageObject op;
	LandingPageObject lp;
	public OfferPageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
	}
	@Then("^User searched for (.+) shortname in offers page$")
	public void User_searched_for_shortname_in_offers_page(String Name) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		switchToOffersPage();
		op = testContextSetup.pgmgr.getOffersPageObject();
				op.getSearchBox(Name);
	  Thread.sleep(5000);
	  offersPageProductName = op.getproductName();
		System.out.println(offersPageProductName);
	  
	  
	   
	}
	public void switchToOffersPage()
	{
		lp = testContextSetup.pgmgr.getLandingPageObject();
	    lp.getTopDealsPage();
	    testContextSetup.genericUtils.SwitchWindowToChild();
	    //explicit wait, parse string...
		  
	}
	
	@And("validate product name in offers page matches with Landing Page")
	public void validate_product_name_in_offers_page_matches_with_Landing_Page() {
		Assert.assertEquals(offersPageProductName, testContextSetup.landingPageProductName);
	}
	
	
	
}
