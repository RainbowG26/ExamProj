package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Dmitriy on 09.09.2017.
 */
public class HomePage extends ParentPage {

    @FindBy(xpath = ".//a[@class='Header-navigationText dropdown-toggle']")
    WebElement rightAvatar;

    @FindBy(xpath = ".//a[@class='Header-navigationText dropdown-toggle']")
    private WebElement menuSettings;

    @FindBy(xpath = ".//a[@class='profile']")
    private WebElement subMenuProfile;

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }


    public boolean isAvatarPresent() {
        return actionWithOurElements.isElementPresent(rightAvatar);
    }

    public void clickOnMenuSettings() {

        actionWithOurElements.clickOnElement(menuSettings);
    }

    public void clickOnSubMenuProfile() {

        actionWithOurElements.clickOnElement(subMenuProfile);
    }
}
