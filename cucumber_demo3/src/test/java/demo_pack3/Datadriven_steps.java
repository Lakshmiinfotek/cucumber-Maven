package demo_pack3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Datadriven_steps {
	ChromeDriver driver;
	/**
	 * @param arg1
	 * @throws Throwable
	 */
	@Given("^I am on the demo site login \"([^\"]*)\"$")
	public void i_am_on_the_demo_site_login(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\program files\\chromedriver.exe");
	    driver = new ChromeDriver();// passing the driver instance to create a new class
	    
	    driver.get(arg1);//get the arg1
	    
	    
	}

	@When("^I enter userName = \"([^\"]*)\" and password = \"([^\"]*)\"$")
	public void i_enter_userName_and_password(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement Username = 
				 driver.findElement(By.name("Email"));
	     WebElement Password = 
	    		 driver.findElement(By.name("Password"));
	     
	     Username.clear();
	     Password.clear();
	     Username.sendKeys(arg1);// passing the string values 	
	     Password.sendKeys(arg2);//passing the send arg2 value
	     
	   
	}

	@When("^I click login button$")
	public void i_click_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement SubmitBtn = 
				driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button"));
				 // find the element of submit button
				 SubmitBtn.click();// click the submit button
	   
	}

	@Then("^text to display \"([^\"]*)\" text$")
	public void text_to_display_text(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String actualValue=driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/h1")).getText();
	Assert.assertEquals(actualValue,arg1);
	    
	}


}
