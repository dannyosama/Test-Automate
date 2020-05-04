package StepClasses;

import Utilities.Parameter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by genta on 16/03/17.
 */
public class LogoutSteps extends Parameter {

    private By avatar_icon = By.xpath("//a[@id='user-dropdown-toggle']");
    private By logout_link_txt = By.xpath(".//*[@id='signout-button']/button");
    private By download_app_txt = By.xpath(".//*[@id='page-container']/div/div[1]/h1");

    public LogoutSteps(WebDriver driver) {
        super(driver);
    }

    public void clickAvatarIcon() {
        userClick(avatar_icon);
    }

    public void clickLogoutLinkText() {
        userClick(logout_link_txt);
    }

    public void checkLoggedOut() {
        isElementPresent(download_app_txt);
    }

}
