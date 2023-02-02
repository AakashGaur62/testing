@ThemeScreenTest
Feature: Test the Functionality of Theme

  Background: Going to Theme Screen
    When User Tap on Views
    And Tap on Controls

  Scenario: Testing the functionality of Light Theme
    When User Tap on Light Theme
    Then Light Theme is Visible

  Scenario: Testing the functionality of Dark Theme
    When User Tap on Dark Theme
    Then Dark Theme is Visible

  Scenario: Testing the functionality of Holo Light Theme
    When User Tap on Holo Light Theme
    Then Holo Light Theme is Visible

  Scenario: Testing the functionality of Holo Dark Theme
    When User Tap on Holo Dark  Theme
    Then Holo Dark Theme is Visible

  Scenario: Testing the functionality of Custom Theme
    When User Tap on Custom Theme
    Then Custom Theme is Visible

  Scenario: Testing the functionality of Holo or Old Theme
    When User Tap on Holo or Old Theme
    Then Holo or Old Theme is Visible
