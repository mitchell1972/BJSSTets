Feature: Quick View Diff Item

  Background: Login
    Given I am on the shopping website
    And And I click on the sign in link
    When I enter the following login details
      | Email Address | mitchell.agoma@gmail.com |
      | Password      | BJSSTest                 |
    Then I am on the my account page

  Scenario: View Item - Default Size

    When I click on T-Shirts
    And I am on the category page
    And I hover and click on quick view on a displayed item
    Then a detailed view of the item is displayed
    And the defaulf size is displayed
    And I click on Add to cart button
    Then the item is successfully added to the shopping cart