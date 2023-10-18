package stepdefinitions;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	@Given("the user is on login page")
	public void user_login()
	{
		//assertTrue(true);
		
		System.out.println("this is login page");
	}
	
	@When("user enters username and password")
	public void user_enter_user_password()
	{
		System.out.println("user_enter_user_password");
	}
	@And("clicks on login button")
	public void click_login()
	{
		System.out.println("clicks on login button");
	}
	
	@Then("user is navigated to home screen")
	public void verify_login()
	{
		System.out.println("user is navigated to home screen");
		//assertTrue(false);
	}

}
