package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import Utility.TestContextSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjetcs.CheckoutPageObject;
import pageObjetcs.LandingPageObject;

public class CheckOutPageStepDefinition {

	public WebDriver driver;
	public String cartPageProductName;
	
	TestContextSetup testContextSetup;
	CheckoutPageObject cp;
	
	public CheckOutPageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
		this.cp = testContextSetup.pgmgr.getCheckoutPageObject();
	}
	
	
	@Then("^User proceeds to checkout and validate the (.+) items in checkoutpage$")
	public void User_proceeds_to_checkout_and_validate_the_items_in_checkoutpage(String Name){
		
		cp.getcartIcon();
		cp.getproceedCheckout();
		testContextSetup.cartPageProductName = cp.getSelectedProductName().split("-")[0].trim();
	    System.out.println(testContextSetup.cartPageProductName);
	    Assert.assertEquals(testContextSetup.cartPageProductName, testContextSetup.landingPageProductName);
		
	
		
	}
	
	@And("verify user has ability to enter promocode and place order")
		public void verify_user_has_ability_to_enter_promocode_and_place_order() {
		Assert.assertTrue(cp.getpromobtn());
		Assert.assertTrue(cp.getplaceOrder());
	}
	
	
}
