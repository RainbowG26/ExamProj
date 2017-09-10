package settings;

import org.junit.Test;
import parentTest.ParentTest;

/**
 * Created by Dmitriy on 09.09.2017.
 */
public class ProfileInfo extends ParentTest {
    @Test
    public void profileInfo() { //Метод работает с страницой Словари Запчасти
        loginPage.loginUser("dim8035@gmail.com", "dimag262017");
        profilePage.checkTitle("Dashboard | BlaBlaCar.co.uk");
        homePage.clickOnMenuSettings();
        homePage.clickOnSubMenuProfile();
        profilePage.checkTitleH1PresentOnPagewithText("Your personal information");
        profilePage.clearFirstNameElement();
        profilePage.enterFirstName("Dima");
        profilePage.clearLastNameElement();
        profilePage.enterLastName("Pris");
        profilePage.clearEmail();
        profilePage.enterEmail("Dim8035@gmail.com");
        profilePage.clickPhoneNumber1();
        profilePage.selectPhoneNumberByValue("PL");
        profilePage.clearPhoneNumber2();
        profilePage.enterPhoneNumber2("730285423");
        profilePage.clickBirthYear();
        profilePage.selectBirthYearByValue("1994");
        profilePage.clickButtonSubmit();
        profilePage.checkTitleH1PresentOnPagewithText("Your personal information");
        checkAC("Can not find text in list", profilePage.isTextInList("Your personal information"),
                true);
    }
}

