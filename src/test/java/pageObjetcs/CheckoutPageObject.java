package pageObjetcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class CheckoutPageObject {

public WebDriver driver;

	public CheckoutPageObject(WebDriver driver) {
		this.driver=driver;
	}
	
	
	private By cartIcon = By.cssSelector("img[alt='Cart']");
	private	By proceedCheckout = By.xpath("//button[text()='PROCEED TO CHECKOUT']");
	private By SelectedProductName = By.cssSelector(".product-name");
	private By promobtn = By.cssSelector(".promoBtn");
	private	By placeOrder = By.xpath("//button[text()='Place Order']");
	
	
	
	public void getcartIcon() {
		driver.findElement(cartIcon).click();
	}
	public void getproceedCheckout() {
		 driver.findElement(proceedCheckout).click();
	}
	public String getSelectedProductName() {
		return driver.findElement(SelectedProductName).getText();
	}
	public boolean getpromobtn() {
		return driver.findElement(promobtn).isDisplayed();
	}
	
	public boolean getplaceOrder() {
		return driver.findElement(placeOrder).isDisplayed();
	}
	
	
	
}
