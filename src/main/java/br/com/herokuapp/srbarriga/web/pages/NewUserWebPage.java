package br.com.herokuapp.srbarriga.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewUserWebPage {

    public NewUserWebPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//a[@href='/cadastro']")
    private WebElement linkNewUser;

    @FindBy(id = "nome")
    private WebElement inputName;

    @FindBy(id = "email")
    private WebElement inputEmail2;

    @FindBy(id = "senha")
    private WebElement inputPassword2;

    @FindBy(xpath = "//input[@value='Cadastrar']")
    private WebElement btnRegister;

    @FindBy(xpath = "//div[@class='alert alert-success']")
    private WebElement msgRegister;

    public WebElement getLinkNewUser() {
        return linkNewUser;
    }

    public WebElement getInputName() {
        return inputName;
    }

    public WebElement getInputEmail2() {
        return inputEmail2;
    }

    public WebElement getInputPassword2() {
        return inputPassword2;
    }

    public WebElement getBtnRegister() {
        return btnRegister;
    }

    public WebElement getMsgRegister() {
        return msgRegister;
    }
}
