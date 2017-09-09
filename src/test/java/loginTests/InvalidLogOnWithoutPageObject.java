package loginTests;

import org.junit.Test;
import org.openqa.selenium.By;
import parentTest.ParentTest;

/**
 * Created by Dmitriy on 07.09.2017.
 */
public class InvalidLogOnWithoutPageObject extends ParentTest {

    //Конструктор - используй вебдрайвер обьект который обьявлен в родителе.
    public InvalidLogOnWithoutPageObject() {
    }

    @Test
    public void invalidLogOn() {
        loginPage.openLoginPage();
        //webDriver.get("http://v3.qalight.com.ua/");
        loginPage.clickOnLogin();
        loginPage.enterLoginToInput("dim8035@gmail.com");
        //webDriver.findElement(By.xpath(".//input[@class='form-control' and @placeholder='Email']")).sendKeys("Student");
        loginPage.enterPasswordToInput("1111");
        //webDriver.findElement(By.xpath(".//input[@class='form-control' and @placeholder='Password']")).sendKeys("9090");
        loginPage.clickOnSubmitButton();
        //webDriver.findElement(By.xpath(".//button[@class='btn btn-primary btn-block btn-flat' and @type='submit']")).click();
        loginPage.isElementWithTextPresent("Login");
        checkAC("Text 'Login' not found", webDriver.findElement(By.xpath(".//h1[text()='Login']")).isDisplayed(), true);
        //Assert метод assertTrue который проверяет правильность Actual result //метод isDisplayed ждет булевскую переменную True/False показывает и обращается к webDriver
        // !webDriver - инвертирует в обратную сторону True/False False/True //Дописываем сообщение перед webDriver.findElement только при False
        //Assert.assertTrue("Assert work!",webDriver.findElement(By.xpath(".//b[text()='Учет запчастей']")).isDisplayed());
    }
}
