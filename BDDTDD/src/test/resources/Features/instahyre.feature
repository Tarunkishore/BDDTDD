@instahyre
Feature: Istahyre

@smoke1
Scenario Outline: upload resume in instahyre
    Given Launch Brave Browser
    When Search Instahyre and open sussessfully
    Then I enter "<username>" and "<password>" of instahyre
    And I wait Low
    Then I click on login button
    Then I click on Profile Tab in header
    And I wait High
    And I scoll to view "instahyre_Resume"
    And I update resume for instahyre
    And I scoll to view "Job_Preferences"
    And I scoll to view "Diversity_info"
    And I wait High
    And Close the Brave browser

    Examples: 
      | username                  | password  |
      | kishoretarunuem@gmail.com | Qwe123Asd |