package br.com.herokuapp.srbarriga.web.funcionalities;

import br.com.herokuapp.srbarriga.commons.BaseTest;
import br.com.herokuapp.srbarriga.web.pages.GeneratePeopleWebPage;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GeneratePeopleWebFunctionality extends BaseTest {

    private GeneratePeopleWebPage generatePeopleWebPage;

    public GeneratePeopleWebFunctionality() {
        this.generatePeopleWebPage = new GeneratePeopleWebPage(webDriver);
    }

//    public void noGeneratePoint() {
//        webWait.until(ExpectedConditions.elementToBeClickable(this.generatePeopleWebPage.getClickNo()));
//        this.generatePeopleWebPage.getClickNo().click();
//    }

    public void clickBtnGeneratePeople() {
        webWait.until(ExpectedConditions.elementToBeClickable(this.generatePeopleWebPage.getBtnGeneratePeople()));
        this.generatePeopleWebPage.getBtnGeneratePeople().click();
    }

    public void collectName() {
        webWait.until(ExpectedConditions.visibilityOf(this.generatePeopleWebPage.getCatchName()));
        setDevsName(this.generatePeopleWebPage.getCatchName().getText());
    }

    public void collectEmail() {
        webWait.until(ExpectedConditions.visibilityOf(this.generatePeopleWebPage.getCatchEmail()));
        setDevsEmail(this.generatePeopleWebPage.getCatchEmail().getText());
    }

    public void collectPassword() {
        webWait.until(ExpectedConditions.visibilityOf(this.generatePeopleWebPage.getCatchPassword()));
        setDevsPassword(this.generatePeopleWebPage.getCatchPassword().getText());
    }
}
