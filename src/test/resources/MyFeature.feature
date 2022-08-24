Feature: My homepage "Log In button" Test

  Scenario: verify as a user that error messages appear if you click Login button without credential
    Given Browser is open
    And I go to home page
    When I log in without credentials
    Then error messages appear: Email cannot be blank and Password cannot be blank
#    Then Click Log In button on the top menu panel
#    When Log in window appears
#    And click Log in button without entered credentials

  Scenario: verify that user can successfully login with valid credentials
    Given Browser is open
    And I go to home page
    And I enter valid credentials
    And close browser
