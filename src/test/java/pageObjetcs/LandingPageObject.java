package pageObjetcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LandingPageObject {

public WebDriver driver;

	public LandingPageObject(WebDriver driver) {
		this.driver=driver;
	}
	
	
	private By searchBox = By.xpath("//input[@type='search']");
	private	By productName = By.cssSelector("h4.product-name");
	private By prodQuantity = By.cssSelector(".increment");
	private By addToCart = By.cssSelector(".product-action button");
	private By topDeals = By.linkText("Top Deals");
	
	public String getLandingPageTitle() {
		return driver.getTitle();
	}
	
	public void getSearchBox(String name) {
		driver.findElement(searchBox).sendKeys(name);
	}
	public String getproductName() {
		return driver.findElement(productName).getText();
	}
	public void getprodQuantity(int quantity) {
		int i = quantity-1;
		while(i>0) {
			driver.findElement(prodQuantity).click();
			i--;
		}
		 
	}
	public void getAddToCart() {
		 driver.findElement(addToCart).click();
	}
	
	public void getTopDealsPage() {
		driver.findElement(topDeals).click();
	}
	
	
	
}
