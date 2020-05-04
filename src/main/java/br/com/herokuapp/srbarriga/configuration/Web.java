package br.com.herokuapp.srbarriga.configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public enum Web implements WebApplication{

    CHROME_WINDOWS {
        @Override
        public WebDriver getDriver() {
            System.setProperty("webdriver.chrome.driver", "chromedriver80/chromedriver.exe");
            Map<String, Object> prefs = new HashMap<String, Object>();
            prefs.put("profile.default_content_setting_values.notifications", 2);
            ChromeOptions opt = new ChromeOptions();
            opt.setExperimentalOption("prefs", prefs);
            return new ChromeDriver((opt));
        }
    }
}
