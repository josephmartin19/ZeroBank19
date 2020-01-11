package com.ZeroBank19.StepDeffinations;

import com.ZeroBank19.pages.LoginPage;
import com.ZeroBank19.utilities.BrowserUtils;
import com.ZeroBank19.utilities.ConfigurationReader;
import com.ZeroBank19.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefination {

    LoginPage loginPage = new LoginPage();

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        String expectedTitle = "Zero - Log in";
        String actualTitle = Driver.get().getTitle();

        Assert.assertEquals(expectedTitle,actualTitle);

    }

    @When("the user enters valid credentials")
    public void the_user_enters_valid_credentials() {
        loginPage.login.sendKeys(ConfigurationReader.get("username"));
       loginPage.password.sendKeys(ConfigurationReader.get("password"));

    }

    @When("click on signin button")
    public void click_on_signin_button() {
        loginPage.signin.click();

    }



    @Then("the page title should be {string}")
    public void the_page_title_should_be(String expectedTitle) {
        BrowserUtils.waitFor(3);
        String actualTitle = Driver.get().getTitle();
        BrowserUtils.waitFor(3);
        Assert.assertEquals(expectedTitle,actualTitle);

    }






}
