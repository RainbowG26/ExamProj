package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Dmitriy on 07.09.2017.
 */
public class LoginPage extends ParentPage {

    @FindBy(xpath = ".//a[@href='/login']")
    private WebElement clickOnLogin;

    @FindBy(name = "_username") //Аннотация которая ищет по указанному признаку, работает с елементами Page
    private WebElement loginInput; // Создаем обьект по тому что искали сверху

    @FindBy(id = "loginFormPassword")
    private WebElement inputPass;

    @FindBy(xpath = ".//button[@class='c-button c-button--primary u-fullWidth u-block apply-btn-loader']")
    private WebElement buttonSubmit;

    public LoginPage(WebDriver webDriver) { //Мы передадим webDriver там где мы создаем/тестов
        super(webDriver); //его мы передадим в родительский класс ParentPage

    }

    public void openLoginPage() {
        //Вызов метода open который открывает url
        open("https://www.blablacar.co.uk/");
    }

    public void clickOnLogin() {
        actionWithOurElements.clickOnElement(clickOnLogin);
    }

    /**
     * Method input login to input
     * @param login
     */
    public void enterLoginToInput(String login) {
        actionWithOurElements.enterText(loginInput, login);
        //       try {
        //           loginInput.sendKeys(login);
        //webDriver.findElement(By.xpath(".//input[@class='form-control' and @placeholder='Email']")).sendKeys(login);
        //          logger.info(login + " was inputed into Input Login");
        //     } catch (Exception e) {
        //         logger.error("Can not work with input");
        //         Assert.fail("Can not work with input");
    }

    /**
     * Method input Password to input
     * @param password
     */
    public void enterPasswordToInput(String password){ //метод который будет передавать пароль
        actionWithOurElements.enterText(inputPass, password);

    }

    /**
     * Method click submit button
     */
    public void clickOnSubmitButton() { //метод кликает на кнопку ничего передавать не будем
        actionWithOurElements.clickOnElement(buttonSubmit);
    }

    public boolean isElementWithTextPresent(String text) { //метод возвращает есть ли элемент на этой странице

        return actionWithOurElements.isElementPresent(".//h1[@class='title-lv1 margin-vertical size28 u-alignCenter']");
    }
}
