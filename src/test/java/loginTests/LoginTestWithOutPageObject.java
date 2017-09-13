package loginTests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import parentTest.ParentTest;

import java.io.File;
import java.util.concurrent.TimeUnit;

/**
 * Created by Dmitriy on 04.09.2017.
 */
public class LoginTestWithOutPageObject extends ParentTest{

    @Test
    public void loginTestWithOutPageObject() {
        loginPage.openLoginPage();
        loginPage.loginUser("dim8035@gmail.com", "dimag262017");
        checkAC("LogIn was successful", loginPage.checkLoginTest("Your current level"), true);

    }
}
