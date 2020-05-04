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
        this.newUserWebPage.getInputName().sendKeys();

    }

}
