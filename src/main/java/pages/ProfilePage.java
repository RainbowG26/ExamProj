package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Dmitriy on 09.09.2017.
 */

public class ProfilePage extends ParentPage {

    @FindBy(id = "profile_general_firstname")
    private WebElement editFirstName;

    @FindBy(id = "profile_general_lastname")
    private WebElement editLastName;

    @FindBy(id = "profile_general_email")
    private WebElement editEmail;

    @FindBy(id = "profile_general_phone_regionCode")
    private WebElement editPhoneNumber1;

    @FindBy(id = "profile_general_phone_regionCode")
    private WebElement editPhoneCod;

    @FindBy(id ="profile_general_phone_rawInput")
    private WebElement editPhoneNumber2;

    @FindBy(id ="profile_general_birthYear")
    private WebElement editBirthYear;

    @FindBy(xpath = ".//button[@class='btn-validation btn-large apply-btn-loader']")
    private WebElement clickButtonSave;


    public ProfilePage(WebDriver webDriver) {
        super(webDriver);
    }


    public void enterFirstName(String firstName) {//метод которий передаст елемент и текст куда ввести
        actionWithOurElements.enterText(editFirstName, firstName);
    }

    public void enterLastName(String LastName) {//метод которий передаст елемент и текст куда ввести
        actionWithOurElements.enterText(editLastName, LastName);
    }

    public void enterEmail(String Email) {
        actionWithOurElements.enterText(editEmail, Email);
    }

    public void clickPhoneNumber1() {
        actionWithOurElements.clickOnElement(editPhoneNumber1);
    }

    public void selectPhoneNumberByValue(String nameValue) {
        actionWithOurElements.selectValueInDropDownByValue(editPhoneCod, nameValue);
    }

    public void enterPhoneNumber2(String PhoneNumber2){
        actionWithOurElements.enterText(editPhoneNumber2, PhoneNumber2);
    }

    public void clickBirthYear(){
        actionWithOurElements.clickOnElement(editBirthYear);
    }

    public void selectBirthYearByValue(String nameValue){
        actionWithOurElements.selectValueInDropDownByValue(editBirthYear, nameValue);
    }

    public void clickButtonSubmit(){
        actionWithOurElements.clickOnElement(clickButtonSave);
    }

    public void clearFirstNameElement() {
        actionWithOurElements.clearTextElement(editFirstName);
    }

    public void clearLastNameElement() {
        actionWithOurElements.clearTextElement(editLastName);
    }

    public void clearEmail() {
        actionWithOurElements.clearTextElement(editEmail);
    }

    public void clearPhoneNumber2(){
        actionWithOurElements.clearTextElement(editPhoneNumber2);
    }

    public boolean isTextInList(String textOfProfile) { //.//*/h1[contains(text(),'Your personal information')]
        return actionWithOurElements.isElementPresent(".//*/h1[contains(text(),'" + textOfProfile + "')]");
    }
}

