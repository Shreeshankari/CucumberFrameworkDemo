package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import Utility.TestContextSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjetcs.LandingPageObject;

public class makemytripstepdefinition {

	public WebDriver driver;
	public String landingPageProductName;
	public String offersPageProductName;
	TestContextSetup testContextSetup;
	LandingPageObject lp;
	public makemytripstepdefinition(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
		this.lp =testContextSetup.pgmgr.getLandingPageObject();
	}
	@Given("user is on maketrip page")
	public void user_is_on_maketrip_page() {
		Assert.assertTrue(lp.getLandingPageTitle().contains("GreenKart"));
	   }
	
	@When("^User searched with shortname (.+) and extracted actual name of product$")
	public void user_searched_with_shortname_and_extracted_actual_name_of_product(String Name) throws InterruptedException {
		
	    lp.getSearchBox(Name);
		Thread.sleep(5000);
		testContextSetup.landingPageProductName = lp.getproductName().split("-")[0].trim();
	    System.out.println(testContextSetup.landingPageProductName);
	}
	
	@And("Added {string} items of selected product to cart")
	public void Added_3_items_of_selected_product_to_cart(String quantity) {
		lp.getprodQuantity(Integer.parseInt(quantity));
		lp.getAddToCart();
	}
}
