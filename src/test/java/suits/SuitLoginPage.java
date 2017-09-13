package suits;

import loginTests.LoginTestWithOutPageObject;
import loginTests.SuccessfulLogOutTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import searchTest.SearchTest;
import settings.ProfileInfo;

/**
 * Created by Dmitriy on 13.09.2017.
 */

@RunWith(Suite.class)

//Аннотация junit для перечесления тестов в этот набор Suit
@Suite.SuiteClasses(
        {
                LoginTestWithOutPageObject.class,
                SuccessfulLogOutTest.class,
                SearchTest.class,
                ProfileInfo.class
        }
)

public class SuitLoginPage {
}
