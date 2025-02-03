@foundit
Feature: Title of your feature
  I want to use this template for my feature file

@smoke1
Scenario Outline: upload resume in foundit
    Given Launch Brave Browser
    When Search foundit and open sussessfully
    Then I click on foundit Login button
    And click on Login Via Password
    Then I enter "<username>" and "<password>" of foundit
    And I wait Low
    Then I click on Profile Tab in foundit header
    And I wait High
    And I click on replace resume
    And I wait High
    And Close the Brave browser

    Examples: 
      | username                  | password  |
      | kishoretarunuem@gmail.com | Qwe123Asd |