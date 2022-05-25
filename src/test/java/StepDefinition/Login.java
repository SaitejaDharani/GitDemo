package StepDefinition;



import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;



public class Login {

    @Given("^User should be on landing page$")
    public void user_should_be_on_landing_page() throws Throwable {
     System.out.println("Landed on login page");
    }


    @When("^User login in application with valid credentials username \"([^\"]*)\" and  password \"([^\"]*)\"$")
    public void user_login_in_application_with_valid_credentials_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
        
        System.out.println(strArg1);
        System.out.println(strArg2);
    }

    @Then("^User should redirect to home page$")
    public void user_should_redirect_to_home_page() throws Throwable {
    	System.out.println("landed on home page");
    }

    @And("^dashboard is displayed \"([^\"]*)\"$")
    public void dashboard_is_displayed_something(String strArg1) throws Throwable {
    	System.out.println(strArg1); 
    }

}
