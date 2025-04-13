package pageObjetcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class makemytripPageObjects {

public WebDriver driver;

	public makemytripPageObjects(WebDriver driver) {
		this.driver=driver;
	}
	
	
	private By hotelsOptions = By.xpath("//a[@class = 'headerIcons makeFlex hrtlCenter column active']");
	private	By hotelLandinGpAGE = By.xpath("//div[@class='makeFlex hrtlCenter prependTop5 appendBottom50']");
	private By prodQuantity = By.cssSelector(".increment");
	private By addToCart = By.cssSelector(".product-action button");
	private By topDeals = By.linkText("Top Deals");
	
	public String getLandingPageTitle() {
		return driver.getTitle();
	}
	
	public String getLandingPagehOTEL() {
		return driver.findElement(hotelLandinGpAGE).getText();
	}
	
	public void getHotelOptions() {
		driver.findElement(hotelsOptions).click();
	}
//	public String getproductName() {
//		return driver.findElement(productName).getText();
//	}
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
