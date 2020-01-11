package com.ZeroBank19.pages;

import com.ZeroBank19.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class AccountSummaryPage extends BasePage{


    @FindBy(css= "[class='board-header']")
    public List<WebElement> TableTitles;

    @FindBy(xpath = "(//div[@class='board-content']/table/thead)[3]/tr/th")
    public List<WebElement>creditAccountTitles;

    @FindBy(xpath = "//a[contains(text(), 'Brokerage')]")
    public WebElement brokerageLink;

    @FindBy(xpath = "//a[contains(text(), 'Savings')]")
    public WebElement savingsLink;

    @FindBy(xpath = "//a[contains(text(), 'Checking')]")
    public WebElement checkingAccountLink;

    @FindBy(xpath = "//a[contains(text(), 'Credit')]")
    public WebElement creditCardLink;

    @FindBy(xpath = "//a[contains(text(), 'Loan')]")
    public WebElement LoanLink;

    public List<String> getAccountText() {
        List<String>actualAccountTypes = new ArrayList<>();

        for (WebElement each:TableTitles) {

            actualAccountTypes.add(each.getText());

        }



        return actualAccountTypes;
    }

    public AccountSummaryPage() {
        PageFactory.initElements(Driver.get(),this);

    }

}
