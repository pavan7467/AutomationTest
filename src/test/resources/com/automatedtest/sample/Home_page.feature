Feature: Home page

  Scenario: Check page display
    Given user launches chrome browser
    When user opens a url "http://automationpractice.com"
    Then user sees "Sign in" should be displayed
    When user clicks "Sign in"
    Then user gets "Create an Account" page
    And user enters below details from "filePAth"
