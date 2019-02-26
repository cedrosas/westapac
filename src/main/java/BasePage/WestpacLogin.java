package BasePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WestpacLogin {
    String Westpac = "https://www.westpac.co.nz";
    public static WebDriver driver;
    public void westpacLogin()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\SampleCucumber\\src\\main\\resources\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(Westpac);

        Actions action = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, 30);

        WebElement KiwiSaverMenu = driver.findElement(By.xpath("//*[@id=\"ubermenu-section-link-kiwisaver-ps\"]"));
        KiwiSaverMenu.click();
        //action.moveToElement(KiwiSaverMenu).perform();


        WebElement KiwiCalculator = driver.findElement(By.xpath("//*[@id=\"sidenav-responsive-children-title-4825-ps\"]/span"));
        KiwiCalculator.click();


        WebElement getStarted = driver.findElement(By.xpath("//a[@href='/kiwisaver/calculators/kiwisaver-calculator/']"));
        getStarted.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }





}
