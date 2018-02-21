Feature: Update basket

  Background: Login
    Given I am on the shopping website
    And And I click on the sign in link
    When I enter the following login details
      | Email Address | mitchell.agoma@gmail.com |
      | Password      | BJSSTest                 |
    Then I am on the my account page

  Scenario: Add item to basket
    When I click on T-Shirts
    And I am on the category page
    And I hover and click on quick view on a displayed item
    And I click on Add to cart button
    Then the item is successfully added to the shopping cart
