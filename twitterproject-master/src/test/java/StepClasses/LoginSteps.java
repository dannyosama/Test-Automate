package StepClasses;

import Utilities.Parameter;
import Utilities.getEnv;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.yandex.qatools.allure.annotations.Step;


/**
 * Created by Danny.Krestianto on 24/02/2017.
 */
public class LoginSteps extends Parameter {

    public LoginSteps(WebDriver driver) {
        super(driver);
    }

    private getEnv getenv;
    private By homeLoginButton = By.linkText("Log in");
    private By fieldName = By.name("session[username_or_email]");
    private By fieldPass = By.name("session[password]");
    private By checkBox = By.name("remember_me");
    private By loginButton = By.xpath("//div[@class='LoginDialog-form']/form/input[1]");
    private By tweetTextBox = By.xpath(".//*[@id='tweet-box-home-timeline']");

    @Step("click Home Login Button")
    public void clickHomeLoginButton() {
        userClick(homeLoginButton);
    }

    @Step("fill Name")
    public void inputUsername() {
//        getenv = new getEnv();
        userSendText(fieldName, getenv.getUsername());
    }

    @Step("fill Pass")
    public void inputPasswd() {
//        getenv = new getEnv();
        userSendText(fieldPass, getenv.getPassword());
    }

    @Step("unchecked box")
    public void untickCheckBox() {
        userClick(checkBox);
    }

    @Step("login")
    public void clickLoginButton() {
        userClick(loginButton);
    }

    @Step("check if logged in")
    public void checkLoggedin() {
        isElementPresent(tweetTextBox);
    }

}
