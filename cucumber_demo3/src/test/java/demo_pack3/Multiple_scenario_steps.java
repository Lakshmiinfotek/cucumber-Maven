package demo_pack3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Multiple_scenario_steps {
	ChromeDriver driver;
	@Given("^user is on Google home page \"([^\"]*)\"$")
	public void user_is_on_Google_home_page(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\program files\\chromedriver.exe");
	    driver = new ChromeDriver();// passing the driver instance to create a new class
	    driver.get(arg1);//get the arg1
		
	}

	@Then("^user enters keyword \"([^\"]*)\"$")
	public void user_enters_keyword(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.name("q")).sendKeys(arg1);
	    
	}

	@Then("^user submits the page$")
	public void user_submits_the_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.name("btnK")).submit();
	   
	}

	@Then("^user waits for (\\d+) seconds for google$")
	public void user_waits_for_seconds_for_google(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		driver.close();
	    
	}

	@Given("^user is on GitHub home page \"([^\"]*)\"$")
	public void user_is_on_GitHub_home_page(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("Webdriver.chrome.driver","c:\\program files\\chromedriver.exe");
		driver = new ChromeDriver();
        driver.get(arg1);
	    
	}

	@Then("^user waits for (\\d+) seconds for github$")
	public void user_waits_for_seconds_for_github(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(1000);
	    driver.close();
	}

	@Given("^user is on Twitter home page \"([^\"]*)\"$")
	public void user_is_on_Twitter_home_page(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("Webdriver.chrome.driver","c:\\program files\\chromedriver.exe");
		driver = new ChromeDriver();
        driver.get(arg1);
	    
	}

	@Given("^user waits for (\\d+) seconds for twitter$")
	public void user_waits_for_seconds_for_twitter(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		
	    
	}



}
