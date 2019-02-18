import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class Login {
    WebDriver driver;


    @Given("^I am on the Login Page$")
    public void iAmOnTheLoginPage() {
        System.setProperty("webdriver.chrome.driver", "C:\\SampleCucumber\\src\\main\\resources\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testing-ground.scraping.pro/login");
    }


    @When("^I fill in User Name with admin$")
    public void iFillInUserNameWithUsername() {
        driver.findElement(By.xpath("//*[@id=\"usr\"]")).sendKeys("admin");

    }

    @And("^I fill in Password with (\\d+)$")
    public void i_fill_in_Password_with(int arg1)  {
        driver.findElement(By.xpath("//*[@id=\"pwd\"]")).sendKeys("12345");

    }

    @And("^I press Login$")
    public void iPressLogin() {
        driver.findElement(By.xpath("//*[@id=\"case_login\"]/form/input[3]")).click();

    }

    @Then("^I should be on the users home page$")
    public void iShouldBeOnTheUsersHomePage() {

    }

    @And("^I should see \"([^\"]*)\"$")
    public void iShouldSee(String arg0) {
        String title;
        title = driver.findElement(By.xpath("//*[@id=\"title\"]")).getAttribute("innerHTML");
        Assert.assertEquals("WEB SCRAPER TESTING GROUND",title);
        System.out.println(title);

    }

}


