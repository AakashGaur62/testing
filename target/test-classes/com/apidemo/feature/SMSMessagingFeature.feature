@SMSMessagingTest
Feature: Test the functionality of SMS feature

  Background: Step to going to SMS Messaging Screen
    When User Tap on OS
    And User Tap SMS Messaging

  Scenario Outline: Test the functionality of SMS Feature with Valid recipient
    When User enable the sms checkbox
    When User Enter the Recipient "<recipient>"
    And User Enter the Message "<message>"
    And User Tap on send button
    Then Message status should be "<valid_status>"

    Examples: 
      | recipient | message                | valid_status  |
      | Null      | msg for testing pupose | Message sent! |

  Scenario Outline: Test the functionality of SMS Feature with Invalid recipient
    When User enable the sms checkbox
    When User Enter the Recipient "<recipient>"
    And User Enter the Message "<message>"
    And User Tap on send button
    Then Message status should be "<valid_status>"

    Examples: 
      | recipient | message                | valid_status     |
      | Aakash    | msg for testing pupose | Error: Null PDU. |
