package searchTest;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import parentTest.ParentTest;

/**
 * Created by Dmitriy on 12.09.2017.
 */
public class SearchTest extends ParentTest {

    WebDriverWait webDriverWait15;

    @Test
    public void searchTest() {
        loginPage.openLoginPage();
        loginPage.loginUser("dim8035@gmail.com", "dimag262017");
        homePage.clickOnButtonfindARide();
        webDriver.findElement(By.xpath(".//input[@title='From']")).sendKeys("London");
        webDriverWait15 = new WebDriverWait(webDriver, 10);
        webDriver.findElement(By.xpath(".//input[@title='To']")).sendKeys("Manchester");
        webDriver.findElement(By.xpath(".//button[@class='btn reverse tip']")).click();
        webDriver.findElement(By.xpath(".//button[@class='btn reverse tip']")).click();
        webDriver.findElement(By.xpath(".//input[@title='Date']")).click();
        webDriver.findElement(By.xpath(".//a[contains(text(), '15')]")).click();
        webDriver.findElement(By.xpath(".//input[@type='submit']")).isDisplayed();
        webDriver.findElement(By.xpath(".//input[@type='submit']")).click();
        webDriver.findElement(By.xpath(".//h1[@class='trip-search-title-count']")).isDisplayed();
    }

}
