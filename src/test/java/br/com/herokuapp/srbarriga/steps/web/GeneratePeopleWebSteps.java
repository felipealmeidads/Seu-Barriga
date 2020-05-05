package br.com.herokuapp.srbarriga.steps.web;

import br.com.herokuapp.srbarriga.web.funcionalities.GeneratePeopleWebFunctionality;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GeneratePeopleWebSteps {

    private GeneratePeopleWebFunctionality generatePeopleWebFunctionality;

    public GeneratePeopleWebSteps() {
        this.generatePeopleWebFunctionality = new GeneratePeopleWebFunctionality();
    }

    @Given("^what a milestone for not generating scores$")
    public void whatAMilestoneForNotGeneratingScores() {
        this.generatePeopleWebFunctionality.noGeneratePoint();
    }

    @When("^click the button 'GERAR PESSOA'$")
    public void clickTheButtonGERARPESSOA() {
        this.generatePeopleWebFunctionality.clickBtnGeneratePeople();
    }

    @Then("^I collect all the necessary data$")
    public void iCollectAllTheNecessaryData() {
        this.generatePeopleWebFunctionality.collectName();
        this.generatePeopleWebFunctionality.collectEmail();
        this.generatePeopleWebFunctionality.collectPassword();
    }
}