package StepDefinition;

import io.cucumber.java.en.*;

public class CucumberReport {
	
	@Given("User is on Welcome Page")
	public void user_is_on_welcome_page() {
		 System.out.println("User on welcome page");
	}

	@When("User clicks on Login button")
	public void user_clicks_on_login_button() {
		 System.out.println(" User clicks on Login button");
	}

	@Then("Welcome page should be displayed")
	public void welcome_page_should_be_displayed() {
	    System.out.println("Welcome page should be displayed");
	}


}
