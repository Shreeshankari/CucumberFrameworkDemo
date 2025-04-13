package pageObjetcs;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	public LandingPageObject lp;
	public OffersPageObject op;
	public CheckoutPageObject cp;
	public makemytripPageObjects mp;
	public WebDriver driver;
	public PageObjectManager(WebDriver driver) {
		this.driver=driver;
	}

	public LandingPageObject getLandingPageObject() {
		lp = new LandingPageObject(driver);
		return lp;
		
	}
	
	public OffersPageObject getOffersPageObject() {
		op = new OffersPageObject(driver);
		return op;
		
	}
	
	public makemytripPageObjects getmakemytripPageObjects() {
		mp = new makemytripPageObjects(driver);
		return mp;
		
	}
	
	public CheckoutPageObject getCheckoutPageObject() {
		cp = new CheckoutPageObject(driver);
		return cp;
		
	}
}
