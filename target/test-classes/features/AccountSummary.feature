@account_summary
Feature: Accout summary

  @acct_summary_page-title
  Scenario: Account summary page should have the title Zero - Account Summary
    Given : the user logged in
    Then the page title should be "Zero - Account Summary"

  @account_types
  Scenario: Account summary page should have cash Account, Investment Accounts, Credit Accounts, Loan Accounts.
    Given the user logged in
    Then the user should see the fallowing account types

      | Cash Accounts       |
      | Investment Accounts |
      | Credit Accounts     |
      | Loan Accounts       |


