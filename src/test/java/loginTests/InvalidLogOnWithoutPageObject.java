package loginTests;

import org.junit.Test;
import org.openqa.selenium.By;
import parentTest.ParentTest;

/**
 * Created by Dmitriy on 07.09.2017.
 */
public class InvalidLogOnWithoutPageObject extends ParentTest {

    @Test
    public void invalidLogOn() {
        loginPage.openLoginPage();
        loginPage.clickOnLogin();
        loginPage.enterLoginToInput("dim8035@gmail.com");
        loginPage.enterPasswordToInput("1111");
        loginPage.clickOnSubmitButton();
        loginPage.isElementWithTextPresent("Login");
        checkAC("Text 'Login' not found", webDriver.findElement(By.xpath(".//h1[text()='Login']")).isDisplayed(), true);
    }
}
