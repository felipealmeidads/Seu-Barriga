package br.com.herokuapp.srbarriga.commons;

import br.com.herokuapp.srbarriga.configuration.WebApplication;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {

    protected static WebDriver webDriver;
    protected static WebDriverWait webWait;
    protected static String devsName, devsEmail, devsPassword;

    public static String getDevsEmail() {
        return devsEmail;
    }

    public static void setDevsEmail(String devsEmail) {
        BaseTest.devsEmail = devsEmail;
    }

    public static String getDevsPassword() {
        return devsPassword;
    }

    public static void setDevsPassword(String devsPassword) {
        BaseTest.devsPassword = devsPassword;
    }

    public static String getDevsName() {
        return devsName;
    }

    public static void setDevsName(String devsName) {
        BaseTest.devsName = devsName;
    }

    protected void initializeWebApplication(WebApplication webApplication, boolean trueFalse) {
        webDriver = webApplication.getDriver();
        webDriver.manage().window().maximize();
        if(trueFalse) {
            webDriver.get(PropertiesManager.getPropertiesValue("URL_SRBARRIGA"));
        }
        else if (!trueFalse) {
            webDriver.get(PropertiesManager.getPropertiesValue("URL_4DEVS"));
        }
        webWait = new WebDriverWait(webDriver, 80);
    }

    protected static void closeWeb() {
        webDriver.quit();
    }
}
