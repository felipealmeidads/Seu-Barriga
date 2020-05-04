package br.com.herokuapp.srbarriga.web.funcionalities;

import br.com.herokuapp.srbarriga.commons.BaseTest;
import br.com.herokuapp.srbarriga.web.pages.LoginWebPage;

public class LoginWebFunctionality extends BaseTest {

    private LoginWebPage loginWebPage;

    public LoginWebFunctionality() {
        this.loginWebPage = new LoginWebPage(webDriver);
    }
}
