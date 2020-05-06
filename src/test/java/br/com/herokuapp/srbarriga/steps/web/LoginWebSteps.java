package br.com.herokuapp.srbarriga.steps.web;

import br.com.herokuapp.srbarriga.web.funcionalities.LoginWebFunctionality;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginWebSteps {

    private LoginWebFunctionality loginWebFunctionality;

    public LoginWebSteps() {
        this.loginWebFunctionality = new LoginWebFunctionality();
    }

    @Given("^I fill the fields with registered data$")
    public void iFillTheFieldsWithRegisteredData() {
        this.loginWebFunctionality.insertEmail();
        this.loginWebFunctionality.insertPassword();
    }

    @When("^I click on 'Entrar'$")
    public void iClickOnEntrar() {
        this.loginWebFunctionality.clickLogin();
    }

    @Then("^see the message \"([^\"]*)\"$")
    public void seeTheMessage(String msg) {
        this.loginWebFunctionality.msgWelcome();
    }
}
