package TestCasses;

import Utilities.SettingUp;
import StepClasses.LoginSteps;
import StepClasses.LogoutSteps;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.TestCaseId;
import ru.yandex.qatools.allure.annotations.Title;

/**
 * Created by Danny.Krestianto on 24/02/2017.
 */
@Features("Login Feature")
public class TestLoginLogout extends SettingUp {

    private LoginSteps inSteps;
    private LogoutSteps outSteps;

    @Stories("As a user I want to be able to login")
    @TestCaseId("TC_TWIT_001_001")
    @Title("Verify user is able to login")
    @Test(priority = 0)
    public void logIn () throws InterruptedException {
        inSteps = new LoginSteps(wd);
        inSteps.clickHomeLoginButton();
        inSteps.inputUsername();
        inSteps.inputPasswd();
        inSteps.untickCheckBox();
        inSteps.clickLoginButton();
        inSteps.checkLoggedin();
    }

    @Stories("As a user I want to be able to logout")
    @TestCaseId("TC_TWIT_001_002")
    @Title("Verify user is able to logout")
    @Test(priority = 1)
    public void logOut() {
        outSteps = new LogoutSteps(wd);
        outSteps.clickAvatarIcon();
        outSteps.clickLogoutLinkText();
        outSteps.checkLoggedOut();
    }
}
