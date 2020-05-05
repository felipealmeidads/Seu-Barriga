package br.com.herokuapp.srbarriga.steps.web;

import br.com.herokuapp.srbarriga.web.funcionalities.NewUserWebFunctionality;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewUserWebSteps {

    private NewUserWebFunctionality newUserWebFunctionality;

    public NewUserWebSteps() {
        this.newUserWebFunctionality = new NewUserWebFunctionality();
    }

    @Given("^that user creation access$")
    public void thatUserCreationAccess() {
        this.newUserWebFunctionality.newUser();
    }

    @And("^I fill the fields with valid data$")
    public void iFillTheFieldsWithValidData() {
        this.newUserWebFunctionality.registerName();
        this.newUserWebFunctionality.registerEmail();
        this.newUserWebFunctionality.registerPassword();
    }

    @When("^I click on 'CADASTRAR'$")
    public void iClickOnCADASTRAR() {
        this.newUserWebFunctionality.clickRegister();
    }


    @Then("^I see the message \"([^\"]*)\"$")
    public void iSeeTheMessage(String msg) {
        this.newUserWebFunctionality.messageRegister();
    }

}
