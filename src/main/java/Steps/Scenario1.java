package Steps;

import BasePage.InfoIcon;
import BasePage.WestpacLogin;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Scenario1 {

    WestpacLogin westpacLogin = new WestpacLogin();
    InfoIcon infoIcon = new InfoIcon();



    @Given("^I am on the Kiwi Saver Retirement Calculator$")
    public void iAmOnTheKiwiSaverRetirementCalculator() {
        westpacLogin.westpacLogin();
    }

    @When("^User Clicks information icon besides all fields in the calculator have got the information icon present$")
    public void userClicksInformationIconBesidesAllFieldsInTheCalculatorHaveGotTheInformationIconPresent() {
       infoIcon.infoIcon();

    }

    @Then("^I should see information about the corresponding textfields$")
    public void iShouldSeeInformationAboutTheCorrespondingTextfields() {
        infoIcon.infoIconMessage();
    }
}
