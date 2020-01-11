package com.ZeroBank19.StepDeffinations;

import com.ZeroBank19.pages.AccountSummaryPage;
import com.ZeroBank19.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class AccountSummaryStepDeffinations {

    AccountSummaryPage accountSummaryPage = new AccountSummaryPage();

    LoginPage loginPage = new LoginPage();

    @Given("the user logged in")
    public void the_user_logged_in() {
        loginPage.Login();


    }

    @Then("the user should see the fallowing account types")
    public void the_user_should_see_the_fallowing_account_types(List<String>expectedAccountType) {
        List<String>actualAccountTypes = accountSummaryPage.getAccountText();
        Assert.assertEquals(expectedAccountType,actualAccountTypes);




    }

}
