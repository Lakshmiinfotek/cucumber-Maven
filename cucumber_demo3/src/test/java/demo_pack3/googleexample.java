package demo_pack3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class googleexample {
	
	ChromeDriver driver;
	 @Given("^I am on google page \"([^\"]*)\"$")
	public void i_am_on_google_page(String arg1)  {
	    // Write code here that turns the phrase above into concrete actions
		 System.setProperty("webdriver.chrome.driver", "C:\\program files\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.get(arg1);
	   
	}

	@When("^I search = \"([^\"]*)\"$")
	public void i_search(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys(arg1);
	    
	}

	@When("^I click on google search button$")
	public void i_click_on_google_search_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.name("btnK")).submit();
	}


}


