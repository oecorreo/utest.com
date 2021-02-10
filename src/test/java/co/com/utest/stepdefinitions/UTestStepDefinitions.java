package co.com.utest.stepdefinitions;


import co.com.utest.model.UTestData;
import co.com.utest.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;


public class UTestStepDefinitions {

   @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that user wants to create an account in utest\\.com$")
    public void thatUserWantsToCreateAnAccountInUtestCom(List<UTestData> uTestData) throws Exception {
        OnStage.theActorCalled("Oscar").wasAbleTo(OpenUp.thePage(),
                (Join.onThePage()),
                (Personal.onThePage(uTestData.get(0).getFirstName(),uTestData.get(0).getLastName(),uTestData.get(0).getEmail(),uTestData.get(0).getMonth(),uTestData.get(0).getDay(),uTestData.get(0).getYear())));
    }


    @When("^he fills the account's information$")
    public void heFillsTheAccountSInformation(List<UTestData> uTestData) throws Exception {
        OnStage.theActorCalled("Oscar").wasAbleTo(
                (Address.onThePage()),
                (Devices.onThePage(uTestData.get(0).getComputer(),uTestData.get(0).getVersion(),uTestData.get(0).getLanguage(),uTestData.get(0).getMobile(),uTestData.get(0).getModel(),uTestData.get(0).getOs()))
                );

    }

    @Then("^he creates the new account$")
    public void heCreatesTheNewAccount(List<UTestData> uTestData) throws Exception {
        OnStage.theActorCalled("Oscar").wasAbleTo(
                (Last.onThePage(uTestData.get(0).getPassword(),uTestData.get(0).getConfirmPassword(),uTestData.get(0).getInformed(),uTestData.get(0).getTerms(),uTestData.get(0).getPrivacy()))
        );

    }
}
