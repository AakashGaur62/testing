@VisibilityScreenTest
Feature: Test the Functionality of Visibility Screen

  Background: Going to Visibility Screen
    When User Tap on Views
    And User Scroll Up the Screen
    And User Tap on Visibility Option

  Scenario: Element is Invisible or not after Tap on INVIS button
    When Views B is Visible
    And User Tap on INVIS button
    Then Views B Should be Invisible

  Scenario: Element should be Visible After Tap on VIS button
    When Views B is Visible
    And User Tap on INVIS button
    Then Views B Should be Invisible
    When User Tap on Vis button
    Then Views B should be visible
