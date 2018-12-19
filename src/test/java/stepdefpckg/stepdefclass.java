package stepdefpckg;


import Actionpkg.Actionclass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefclass {

    Actionclass act=new Actionclass();
    @Given("^Iam on home page$")
    public void iam_on_home_page()  {
        // Write code here that turns the phrase above into concrete actions
       act.iam_on_home_page();
    }

    @When("^hover on sign in$")
    public void hover_on_sign_in() {
        // Write code here that turns the phrase above into concrete actions
       act.hover_on_sign_in();
    }

    @When("^enter email address$")
    public void enter_email_address()  {
        // Write code here that turns the phrase above into concrete actions
       act.enter_email_address();
    }

    @When("^enter password$")
    public void enter_password() {
        // Write code here that turns the phrase above into concrete actions
       act.enter_password();
    }

    @When("^click signin button$")
    public void click_signin_button()  {
        // Write code here that turns the phrase above into concrete actions
        act.click_signin_button();
    }

    @Then("^validate zoopla web page$")
    public void validate_zoopla_web_page()  {
        // Write code here that turns the phrase above into concrete actions
       act.validate_zoopla_web_page();
    }


}

