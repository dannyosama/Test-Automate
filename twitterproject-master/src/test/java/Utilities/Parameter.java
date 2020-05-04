package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Danny.Krestianto on 23/02/2017.
 */
public class Parameter extends SettingUp {

    protected WebDriverWait wait;

    public Parameter(WebDriver driver) {
        this.wd = driver;
    }


    protected void userWaitforElement(By byparameter) {
        wait = new WebDriverWait(wd, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(byparameter));
    }

    protected void userClick(By byparameter) {
        userWaitforElement(byparameter);
        wd.findElement(byparameter).click();
    }

    protected void userSendText(By byparameter, String text) {
        userWaitforElement(byparameter);
        userClick(byparameter);
        wd.findElement(byparameter).clear();
        wd.findElement(byparameter).sendKeys(text);
    }

    protected boolean isElementPresent(By by) {
        try {
            if (wd.findElement(by).isDisplayed()){
                return true;
            }else{
                return false;
            }
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}