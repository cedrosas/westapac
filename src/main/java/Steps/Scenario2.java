package Steps;

import BasePage.KiwiUserCalculator;
import BasePage.WestpacLogin;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Scenario2  extends WestpacLogin{
    KiwiUserCalculator kiwiusercaculator = new KiwiUserCalculator();


    @Then("^Show user the Kiwi Saver Retirement Calculator$")
    public void show_user_the_Kiwi_Saver_Retirement_Calculator() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


    @When("^User whose Current is at the age of (\\d+) and (\\d+), Employed with (\\d+) Kiwisaver, (\\d+),(\\d+)PIR and High Risk profile$")
    public void user_whose_Current_is_at_the_age_of_and_Employed_with_Kiwisaver_PIR_and_High_Risk_profile(String Age, String Salary) throws Throwable {
        kiwiusercaculator.KiwiUserCalculator( Age, Salary);
        throw new PendingException();
    }


    @And("^User whose current aged A is Self-employed, has a PIR (\\d+),(\\d+), current KiwiSaver balance is (\\d+), voluntary contributes (\\d+) fortnightly and chooses medium risk profile with saving goals requirement of (\\d+) is able to calculate his projected balances at retirement$")
    public void userWhoseCurrentAgedAIsSelfEmployedHasAPIRCurrentKiwiSaverBalanceIsVoluntaryContributesFortnightlyAndChoosesMediumRiskProfileWithSavingGoalsRequirementOfIsAbleToCalculateHisProjectedBalancesAtRetirement(String Age, String Salary) {

    }
}
