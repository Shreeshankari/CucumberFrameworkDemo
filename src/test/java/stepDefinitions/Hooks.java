package stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Utility.TestContextSetup;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Hooks {
	TestContextSetup testContextSetup;
	public Hooks(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
	}
	@After
	public void AfterScenario() throws IOException {
		// closing browser
		testContextSetup.testBase.WebDriverManager().quit();
	}
	
	@AfterStep
	public void getScreenshot(Scenario scenario) throws IOException{
		// closing browser
		if(scenario.isFailed()) {
		WebDriver driver = testContextSetup.testBase.WebDriverManager();
	File sourcePath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	byte[] fileContent = FileUtils.readFileToByteArray(sourcePath);
	scenario.attach(fileContent, "image/png", "image");
		}
	}
	
}
