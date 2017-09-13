package loginTests;

import org.junit.Test;
import parentTest.ParentTest;

/**
 * Created by Dmitriy on 12.09.2017.
 */
public class SuccessfulLogOutTest extends ParentTest{

    @Test
    public void successfulLogOut() {
        loginPage.openLoginPage();
        loginPage.loginUser("dim8035@gmail.com", "dimag262017");
        homePage.clickOnMenuSettings();
        homePage.clickOnSubMenuLogout();
        checkAC("Logout was not successful", loginPage.checkTextInLoginForm("Log in"), true);
    }
}