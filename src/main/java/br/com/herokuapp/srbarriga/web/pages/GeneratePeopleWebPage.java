package br.com.herokuapp.srbarriga.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GeneratePeopleWebPage {

    public GeneratePeopleWebPage (WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//div[3]/div[1]/div[3]/label/span")
    private WebElement clickNo;

    @FindBy(id = "bt_gerar_pessoa")
    private WebElement btnGeneratePeople;

    @FindBy(xpath = "//*[@id='nome']/span[1]")
    private WebElement catchName;

    @FindBy(xpath = "//*[@id='email']/span[1]")
    private WebElement catchEmail;

    @FindBy(xpath = "//*[@id='senha']/span[1]")
    private WebElement catchPassword;

    public WebElement getClickNo() {
        return clickNo;
    }

    public WebElement getBtnGeneratePeople() {
        return btnGeneratePeople;
    }

    public WebElement getCatchName() {
        return catchName;
    }

    public WebElement getCatchEmail() {
        return catchEmail;
    }

    public WebElement getCatchPassword() {
        return catchPassword;
    }
}
