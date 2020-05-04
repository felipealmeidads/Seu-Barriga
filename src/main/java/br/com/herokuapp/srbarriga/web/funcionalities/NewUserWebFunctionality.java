package br.com.herokuapp.srbarriga.web.funcionalities;

import br.com.herokuapp.srbarriga.commons.BaseTest;
import br.com.herokuapp.srbarriga.web.pages.NewUserWebPage;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class NewUserWebFunctionality extends BaseTest {

    private NewUserWebPage newUserWebPage;

    public NewUserWebFunctionality() {
        this.newUserWebPage = new NewUserWebPage(webDriver);
    }

    public void newUser() {
        webWait.until(ExpectedConditions.elementToBeClickable(this.newUserWebPage.getLinkNewUser()));
        this.newUserWebPage.getLinkNewUser().click();
    }

    public void registerName() {
        webWait.until(ExpectedConditions.visibilityOf(this.newUserWebPage.getInputName()));
        this.newUserWebPage.getInputName().sendKeys(getDevsName());
    }

    public void registerEmail() {
        webWait.until(ExpectedConditions.visibilityOf(this.newUserWebPage.getInputEmail2()));
        this.newUserWebPage.getInputEmail2().sendKeys(getDevsEmail());
    }

    public void registerPassword() {
        webWait.until(ExpectedConditions.visibilityOf(this.newUserWebPage.getInputPassword2()));
        this.newUserWebPage.getInputPassword2().sendKeys(getDevsPassword());
    }

    public void clickRegister() {
        webWait.until(ExpectedConditions.elementToBeClickable(this.newUserWebPage.getBtnRegister()));
        this.newUserWebPage.getBtnRegister().click();
    }

}
