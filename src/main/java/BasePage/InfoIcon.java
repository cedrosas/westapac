package BasePage;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class InfoIcon extends WestpacLogin {

    public void infoIcon() {
        //String AgeMessage;
        WebElement calcuFrame = driver.findElement(By.xpath("//*[@id='calculator-embed']/iframe"));
        driver.switchTo().frame(calcuFrame);

        //WebElement DivActive =  driver.findElement(By.xpath("//div{@class='field-cell field-controls']"));
        driver.switchTo().activeElement().findElement(By.xpath("//div{@class='field-cell field-controls']"));


        WebElement icon = driver.findElement(By.xpath("//button[@class='icon-target icon-target-help-toggle icon-btn icon-btn-info ir ng-scope']"));
        //new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/div[1]/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/button"))).click();
        //new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector(".wpnib-field-current-age > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > button:nth-child(1) > i:nth-child(1)"))).click();
        //WebElement icon = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/button/i"));
        icon.click();
    }
    public void infoIconMessage (){
        String InfoMessageAge;

        WebElement infomessage = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/div[1]/div/div[1]/div/div/div/div[2]/div[1]/div[2]/div/p"));
        InfoMessageAge = infomessage.getAttribute("innerHTML");
        Assert.assertEquals("This calculator has an age limit of 64 years old as you need to be under the age of 65 to join KiwiSaver.",InfoMessageAge);
    }

}
