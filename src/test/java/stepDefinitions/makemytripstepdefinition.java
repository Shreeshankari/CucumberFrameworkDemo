package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import Utility.TestContextSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjetcs.LandingPageObject;
import pageObjetcs.makemytripPageObjects;

public class makemytripstepdefinition {

	public WebDriver driver;
	public String landingPageProductName;
	public String offersPageProductName;
    
	TestContextSetup testContextSetup;
	LandingPageObject lp;
	makemytripPageObjects mp;
	public makemytripstepdefinition(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
		this.lp =testContextSetup.pgmgr.getLandingPageObject();
		this.mp = testContextSetup.pgmgr.getmakemytripPageObjects();
		
	}
	@Given("user is on maketrip page")
	public void user_is_on_maketrip_page() {
		Assert.assertTrue(mp.getLandingPageTitle().contains("GreenKart"));
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
	
	@Given("User is on MakeMyTrip Opening Page")
	public void user_is_on_MakeMyTrip_Opening_page() {
		Assert.assertTrue(mp.getLandingPageTitle().contains("MakeMyTrip"));
	   }
	
	@When("user clicks hotel and search hotel room availablity in dubai in selected date")
	public void user_clicks_hotel_and_search_hotelroom_availablity_in_dubai_in_selected_date() {
		mp.getHotelLink();
		mp.getCountrySearchButton();
		mp.getCountrySearchBox();
		mp.getCountrySearchBoxValue();
		
	}
}
