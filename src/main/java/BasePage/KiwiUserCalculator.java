package BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class KiwiUserCalculator extends WestpacLogin {

    public void KiwiUserCalculator(String Age, String Salary) {
        Actions CalcAction = new Actions(driver);
        WebElement calcuFrame = driver.findElement(By.xpath("//*[@id='calculator-embed']/iframe"));
        driver.switchTo().frame(calcuFrame);

        //WebElement DivActive =  driver.findElement(By.xpath("//div{@class='field-cell field-controls']"));
        // driver.switchTo().activeElement().findElement(By.xpath("//div{@class='field-cell field-controls']"));


            WebElement CurrentAge = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/div[1]/div/div[1]/div/div/div/div[2]/div[1]/div[1]/div/div[1]/div/div[1]/div/div/input"));
            CurrentAge.sendKeys(Age);


            WebElement EmpDropdown = driver.findElement(By.xpath("//i[@class-well='ir dropdown-arrow']"));
            EmpDropdown.click();
            //CalcAction.moveToElement(EmpDropdown).click().perform();


            WebElement Employed = driver.findElement(By.xpath("//li[@class='option-item ng-scope ng-isolate-scope first-non-empty-option-item']"));
            Employed.click();

            WebElement SalaryText = driver.findElement(By.xpath("//input[@class='ng-pristine ng-valid']"));
            SalaryText.sendKeys(Salary);

            WebElement KiwiRadio1 = driver.findElement(By.xpath("//input[@id='radio-option-06E']"));
            KiwiRadio1.click();

            WebElement inputPIR = driver.findElement(By.xpath("//span[contains(.,'Select')]"));
            inputPIR.click();

            WebElement pir = driver.findElement(By.xpath("//span[contains(.,'17.5')]"));
            pir.click();

            WebElement riskprofile = driver.findElement(By.xpath("//input[@id='radio-option-021']"));
            riskprofile.click();


            WebElement btnRetirementProjection = driver.findElement(By.xpath("//button[@class='btn btn-regular btn-results-reveal btn-has-chevron']"));
            btnRetirementProjection.click();


    }

    public void KiwiUserCalculator1()
    {
        Actions CalcAction = new Actions(driver);
        WebElement calcuFrame = driver.findElement(By.xpath("//*[@id='calculator-embed']/iframe"));
        driver.switchTo().frame(calcuFrame);

        //WebElement DivActive =  driver.findElement(By.xpath("//div{@class='field-cell field-controls']"));
        // driver.switchTo().activeElement().findElement(By.xpath("//div{@class='field-cell field-controls']"));


        WebElement CurrentAge = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/div[1]/div/div[1]/div/div/div/div[2]/div[1]/div[1]/div/div[1]/div/div[1]/div/div/input"));
        CurrentAge.sendKeys("45");

        WebElement EmpDropdown = driver.findElement(By.xpath("//i[@class-well='ir dropdown-arrow']"));
        EmpDropdown.click();

        WebElement Employed = driver.findElement(By.xpath("//li[@class='option-item ng-scope ng-isolate-scope last-option-item selected']"));
        Employed.click();

        WebElement pir = driver.findElement(By.xpath("//span[contains(.,'10.5')]"));
        pir.click();

        WebElement KiwiBalance = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/div[1]/div/div[5]/div/div/div/div[2]/div[1]/div[1]/div/div/div[1]/div/div/input"));
        KiwiBalance.sendKeys("100000");

        WebElement Vcontributions = driver.findElement(By.xpath("//*[@id=\"widget\"]/div/div[1]/div/div[1]/div/div[6]/div/div/div/div[2]/div[1]/div[1]/div/div/div[1]/div[1]/div/input"));
        Vcontributions.sendKeys("90");

        WebElement payment = driver.findElement(By.xpath("//*[@id=\"widget\"]/div/div[1]/div/div[1]/div/div[6]/div/div/div/div[2]/div[1]/div[1]/div/div/div[1]/div[2]/div/div[1]"));
        payment.click();

        WebElement paymentWhen = driver.findElement(By.xpath("//li[contains(.,'Forthnightly')]"));
        paymentWhen.click();

        WebElement riskprofile = driver.findElement(By.xpath("//input[@id='radio-option-01Y']"));
        riskprofile.click();

        WebElement GoalRetirement = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/div[1]/div/div[5]/div/div/div/div[2]/div[1]/div[1]/div/div/div[1]/div/div/input"));
        GoalRetirement.sendKeys("290000");


        WebElement btnRetirementProjection = driver.findElement(By.xpath("//button[@class='btn btn-regular btn-results-reveal btn-has-chevron']"));
        btnRetirementProjection.click();

    }

    public void KiwiUserCalculator2(String Age, String Salary) {
        Actions CalcAction = new Actions(driver);
        WebElement calcuFrame = driver.findElement(By.xpath("//*[@id='calculator-embed']/iframe"));
        driver.switchTo().frame(calcuFrame);

        //WebElement DivActive =  driver.findElement(By.xpath("//div{@class='field-cell field-controls']"));
        // driver.switchTo().activeElement().findElement(By.xpath("//div{@class='field-cell field-controls']"));


        WebElement CurrentAge = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/div[1]/div/div[1]/div/div/div/div[2]/div[1]/div[1]/div/div[1]/div/div[1]/div/div/input"));
        CurrentAge.sendKeys("55");

        WebElement EmpDropdown = driver.findElement(By.xpath("//i[@class-well='ir dropdown-arrow']"));
        EmpDropdown.click();

        WebElement Employed = driver.findElement(By.xpath("//li[@class='option-item ng-scope ng-isolate-scope last-option-item selected']"));
        Employed.click();

        WebElement pir = driver.findElement(By.xpath("//span[contains(.,'10.5')]"));
        pir.click();

        WebElement KiwiBalance = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/div[1]/div/div[5]/div/div/div/div[2]/div[1]/div[1]/div/div/div[1]/div/div/input"));
        KiwiBalance.sendKeys("140000");

        WebElement Vcontributions = driver.findElement(By.xpath("//*[@id=\"widget\"]/div/div[1]/div/div[1]/div/div[6]/div/div/div/div[2]/div[1]/div[1]/div/div/div[1]/div[1]/div/input"));
        Vcontributions.sendKeys("10");

        WebElement payment = driver.findElement(By.xpath("//*[@id=\"widget\"]/div/div[1]/div/div[1]/div/div[6]/div/div/div/div[2]/div[1]/div[1]/div/div/div[1]/div[2]/div/div[1]"));
        payment.click();

        WebElement paymentWhen = driver.findElement(By.xpath("//li[contains(.,'Anually')]"));
        paymentWhen.click();

        WebElement riskprofile = driver.findElement(By.xpath("//input[@id='radio-option-01Y']"));
        riskprofile.click();

        WebElement GoalRetirement = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/div[1]/div/div[5]/div/div/div/div[2]/div[1]/div[1]/div/div/div[1]/div/div/input"));
        GoalRetirement.sendKeys("200000");


        WebElement btnRetirementProjection = driver.findElement(By.xpath("//button[@class='btn btn-regular btn-results-reveal btn-has-chevron']"));
        btnRetirementProjection.click();
    }
}
