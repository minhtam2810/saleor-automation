package com.getsaleor.demo.pages;

import com.getsaleor.demo.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Common;
import utilities.ElementAction;

public class LoginPage extends BasePage {
    public LoginPage(){
        System.out.println("You are now on Login Page");
    }
    /*
    ELEMENTS
     */
    @FindBy(id = "id_username")
    private WebElement txtUsername;

    @FindBy(id = "id_password")
    private WebElement txtPassword;

    @FindBy(xpath = "//button[contains(@class, 'primary')]")
    private WebElement btnLogin;

    @FindBy(css = "div.alert-danger")
    private WebElement errorMessage;

    @FindBy(linkText = "Forgot password?")
    private WebElement linkForgotPassword;


    /*
    PUBLIC ACTIONS
     */
    public LoginPage clearUsername(){
        ElementAction.clear(txtUsername, "Username");
        return this;
    }
    public LoginPage clearPassword(){
        ElementAction.clear(txtPassword, "Password");
        return this;
    }
    public LoginPage typeUsername(String username){
        ElementAction.type(txtUsername, "Username", username);
        return this;
    }
    public LoginPage typePassword(String password){
        ElementAction.type(txtPassword, "Password", password);
        return this;
    }
    public LoginPage clickLoginBtn(){
        ElementAction.click(btnLogin, "Log in");
        return this;
    }
    public String getErrorMessage(){
        return Common.getTextNode(errorMessage);
    }

    public LoginPage clickForgotPassword(){
        if(linkForgotPassword != null){
            ElementAction.click(linkForgotPassword, "Forgot password");
        }
        return this;
    }

}