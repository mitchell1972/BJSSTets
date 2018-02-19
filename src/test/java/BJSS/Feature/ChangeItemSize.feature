Feature: Change Size

  Background: Login
    Given I am on the shopping website
    And And I click on the sign in link
    When I enter the following login details
      | Email Address | mitchell_agoma@yahoo.co.uk |
      | Password      | BJSSTest                   |
    Then I am on the my account page

    Scenario: Change Item Size
      When I click on T-Shirts
      And I am on the category page
      And I hover on a displayed item
      And I click on the more button
      When I click the size drop down list
      And Select Large
      Then the Size drop down menu is updated with the size selected
