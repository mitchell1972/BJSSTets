Feature: Account Login and Logout

  Scenario: Login
    Given I am on the shopping website
    And And I click on the sign in link
    When I enter the following login details
      | Email Address | mitchell_agoma@yahoo.co.uk |
      | Password      | BJSSTest                   |
    Then I am on the my account page