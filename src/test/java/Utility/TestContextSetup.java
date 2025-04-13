package Utility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjetcs.PageObjectManager;

public class TestContextSetup {
	public WebDriver driver;
	public String landingPageProductName;
	public String cartPageProductName;
	public PageObjectManager pgmgr;
	public TestBase testBase;
	public GenericUtils genericUtils;
	
	public TestContextSetup() throws IOException {
		testBase = new TestBase();
		pgmgr = new PageObjectManager(testBase.WebDriverManager());
		genericUtils = new GenericUtils(testBase.WebDriverManager());
		
	}
}
