@ReceiveResultTest
Feature: Test the functionality of Receive Result Feature

  Background: User go to Recceive Result Screen
    When User Tap on App
    And User Tap On Fragment
    And User Tap on Recieve Result

  Scenario Outline: Test the functionality of recieveing result Corky!
    When User Tap on GET RESULT button
    When User Tap on Corky button
    Then Result Should be visible on Receive Result Screen with "<msg>"

    Examples: 
      | msg              |
      | (okay -1) Corky! |

  Scenario Outline: Test the functionality of recieveing result Violet!
    When User Tap on GET RESULT button
    When User Tap on Violet button
    Then Result Should be visible on Receive Result Screen with "<msg>"

    Examples: 
      | msg               |
      | (okay -1) Violet! |
