package pageObjetcs;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	public class OffersPageObject {

	public WebDriver driver;

		public OffersPageObject(WebDriver driver) {
			this.driver=driver;
		}
		
		private By searchBox = By.xpath("//input[@type='search']");
		private	By productName = By.cssSelector("tr td:nth-child(1)");
		
		public void getSearchBox(String name) {
			driver.findElement(searchBox).sendKeys(name);
		}
		public String getproductName() {
			return driver.findElement(productName).getText();
		}
	

}
