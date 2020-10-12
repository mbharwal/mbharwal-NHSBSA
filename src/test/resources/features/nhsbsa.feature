Feature: Eligibility Checker
  As a person from Wales
  I need to know what help I can get with my NHS costs
  So that I can get the treatment I need

  Scenario Outline: Wales Eligibility Checker
    Given I am a person from Wales
    When I put my circumstances into the Checker tool with partner "<value>"
    Then I should get a  result of whether I will get help or not

    Examples:
    |value|
    |true|
