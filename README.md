evri_project_taf
The automation project created for testing of some parts of
functionality evri.com web site (https://www.evri.com).
using Project Object.
the following credentials used for test
Email Address: John.Walter@bbvhcypp.mailosaur.net
Password: Userforexam123


 My homepage "Log In button" Test cases

  Scenario: verify as a user that error messages appear if you click Login button without credential
    Given Browser is open
    And I go to home page
    When I log in without credentials
    Then error messages appear: Email cannot be blank and Password cannot be blank

  Scenario: verify that user can successfully login with valid credentials
    Given Browser is open
    And I go to home page
    And I enter valid credentials
    And close browser
