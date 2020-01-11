package com.ZeroBank19.pages;

import com.ZeroBank19.utilities.ConfigurationReader;
import com.ZeroBank19.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

    @FindBy(id = "user_login")
    public WebElement login;

    @FindBy(id = "user_password")
    public WebElement password;

    @FindBy(name = "submit")
    public WebElement signin;

    public void Login() {
        login.sendKeys(ConfigurationReader.get("username"));
        password.sendKeys(ConfigurationReader.get("password"));
        signin.click();
    }


    public LoginPage() {

        PageFactory.initElements(Driver.get(), this);
    }


}
