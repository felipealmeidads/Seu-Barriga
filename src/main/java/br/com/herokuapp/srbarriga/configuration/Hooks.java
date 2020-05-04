package br.com.herokuapp.srbarriga.configuration;

import br.com.herokuapp.srbarriga.commons.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseTest {

    @Before(value = "@srbarrigaWeb")
    public void beforeSrBarrigaWeb() {
        initializeWebApplication(Web.CHROME_WINDOWS, true);
    }

    @Before(value = "@4devsWeb")
    public void beforeDevsWeb() {
        initializeWebApplication(Web.CHROME_WINDOWS, false);
    }

    @After(value = "@srbarrigaWeb")
    public void afterSrBarrigaWeb() {
        closeWeb();
    }

    @After(value = "@4devsWeb")
    public void afterDevsWeb() {
        closeWeb();
    }
}
