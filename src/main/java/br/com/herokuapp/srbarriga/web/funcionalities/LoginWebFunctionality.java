package br.com.herokuapp.srbarriga.web.funcionalities;

import br.com.herokuapp.srbarriga.commons.BaseTest;
import br.com.herokuapp.srbarriga.web.pages.LoginWebPage;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginWebFunctionality extends BaseTest {

    private LoginWebPage loginWebPage;

    public LoginWebFunctionality() {
        this.loginWebPage = new LoginWebPage(webDriver);
    }

    public void insertEmail() {
        webWait.until(ExpectedConditions.visibilityOf(this.loginWebPage.getInputEmail()));
        this.loginWebPage.getInputEmail().sendKeys(loginEmail);
    }

    public void insertPassword() {
        webWait.until(ExpectedConditions.visibilityOf(this.loginWebPage.getInputPassword()));
        this.loginWebPage.getInputPassword().sendKeys(loginPassword);
    }

    public void clickLogin() {
        webWait.until(ExpectedConditions.elementToBeClickable(this.loginWebPage.getBtnLogin()));
        this.loginWebPage.getBtnLogin().click();
    }

    public String msgWelcome() {
        webWait.until(ExpectedConditions.visibilityOf(this.loginWebPage.getMsgLogin()));
        return this.loginWebPage.getMsgLogin().getText();
    }
}
