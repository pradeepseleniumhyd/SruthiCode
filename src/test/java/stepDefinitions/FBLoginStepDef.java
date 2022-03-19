package stepDefinitions;

import java.util.List;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FBLoginStepDef {
	
	
	@Before
	public void browser()
	{
		System.out.println("****************************");
	}
	
	@After
	public void browserclose()
	{
		System.out.println("****************************");
	}
	
	
	@Given("user opens the browser")
	public void user_opens_the_browser() {
		System.out.println("browser code");
		}
	@When("user enters the url")
	public void user_enters_the_url() {
		System.out.println("url is entered");
	}
	@Then("user verifies the current url and title of the page")
	public void user_verifies_the_current_url_and_title_of_the_page() {
		System.out.println("verifies the current url and title");
		}
	@When("user enters username and password in textbox")
	public void user_enters_username_and_password_in_textbox() {
		System.out.println("username and password textbox");
		//Assert.assertEquals("Sruthi", "sruthi");
		
	}
	@When("user clicks on signin button")
	public void user_clicks_on_signin_button() {
		System.out.println("Singin button");
	}
	@Then("user verifies Home page is displayed")
	public void user_verifies_home_page_is_displayed() {
		System.out.println("HomePage is displayed");
	}

	@Then("user checks login page")
	public void userlogin()
	{
		
	}
	
	@Given("user navigates to url")
	public void user_navigates_to_url() {
		}
	@When("user enters username and password")
	public void user_enters_username_and_password() {
	}
	@Then("user navigates to home page")
	public void user_navigates_to_home_page() {
	}



	@When("user clicks on logout button")
	public void user_clicks_on_logout_button() {
		}
	@Then("user navigates to login page")
	public void user_navigates_to_login_page() {
	}


	@Then("Loginpage is displayed")
	public void loginpage_is_displayed() {
	}
	@When("user enters {string} and {string}")
	public void user_enters_and(String username, String password) {
		System.out.println(username);
		System.out.println(password);
	}
	

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		}
	@When("user performs click on {string}")
	public void user_performs_click_on(String linkname) {
			System.out.println(linkname);
	}


	
	@When("user enters the value username and password")
	public void user_enters_the_value_username_and_password(io.cucumber.datatable.DataTable dataTable) {
	    List<List<String>> data = dataTable.asLists(String.class);
	    System.out.println(data.get(0).get(0));
	   System.out.println(data.get(0).get(1));
	   System.out.println(data.get(1).get(0));
	   System.out.println(data.get(1).get(1));
	    
	}







	
}
