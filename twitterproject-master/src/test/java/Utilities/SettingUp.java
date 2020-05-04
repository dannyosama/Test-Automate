package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

/**
 * Created by Danny.Krestianto on 9/02/2017.
 */
public class SettingUp {

    protected WebDriver wd;

    @BeforeClass
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "Resources/chromedriver");
        wd = new ChromeDriver();

        wd.get("https://twitter.com/");

        wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//            wd.manage().window().maximize();

    }
    @AfterClass
    public void teardown(){
        wd.quit();
    }

}
