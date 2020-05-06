package br.com.herokuapp.srbarriga.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginWebPage {

    public LoginWebPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(id = "email")
    private WebElement inputEmail;

    @FindBy(id = "senha")
    private WebElement inputPassword;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    private WebElement btnLogin;

    @FindBy(xpath = "//div[@class='alert alert-success']")
    private WebElement msgLogin;

    public WebElement getInputEmail() {
        return inputEmail;
    }

    public WebElement getInputPassword() {
        return inputPassword;
    }

    public WebElement getBtnLogin() {
        return btnLogin;
    }

    public WebElement getMsgLogin() {
        return msgLogin;
    }
}
