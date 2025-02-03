@SmokeTest
Feature: TMKOC

@smoke
Scenario Outline: Tarak mehta ka ulta chasma
	  Given Launch Brave Browser
	  	And Search youtube and open sussessfully
	  When Search "<Episode>"
	  	And I wait Low
	  Then I click on "Youtube_Search"
	  	And I wait High
			And I scoll to view "Video_TMKOC_123"
		Then I verify "Video_TMKOC_123" available on present page
			And I scoll to view "Video_TMKOC_101"
		Then I verify "Video_TMKOC_101" available on present page
			And I scoll to view "Video_TMKOC_107"
		Then I verify "Video_TMKOC_107" available on present page
			And I scoll to view "Video_TMKOC_103"
		Then I verify "Video_TMKOC_103" available on present page
			And I scoll to view "Video_TMKOC_100"
		Then I verify "Video_TMKOC_100" available on present page
	  	And Close the Brave browser
	  
	  Examples:
	  | Episode     |
	  | TMKOC EP101 |
	  
@smoke
Scenario Outline: upload resume in naukari
		Given Launch Brave Browser
			And I wait Low
		When Search naukari and open sussessfully
			And I wait Low
		Then I enter "<username>" and "<password>"
			And I wait Low
		Then I click on "Naukari_Login"
			And I wait Low
			And I scoll to view "Naukari_ViewProfile_AboutUs"
			And I wait Low
			And I scoll to view "Naukari_ViewProfile"
			And I wait Low
		Then I click on "Naukari_ViewProfile"
			And I wait Low
		Then I click on "Naukari_Update_resume"
		Then I upload Resume on Naukari
			And I switch to frame
		Then I click on "Naukari_UpdateResume_Resume"
		Then I verify "Naukari_UpdateResume_Resume" available on present page
			And I scoll to view "Resume_Headline_text"
			And I wait Low
			And I scoll to view "Personal_details_header"
			And I wait Low
		Then I verify "Personal_details_header" available on present page
			And I wait Low
			And I scoll to view "Naukari_Update_resume"
			And I wait Low
		Then I verify "Naukari_Update_resume" available on present page
			And I wait Low
			And I scoll to view "Personal_details_header"
			And I wait Low
		Then I verify "Personal_details_header" available on present page
			And I wait Low
	  	And Close the Brave browser
		
    Examples: 
      | username                  | password  |
      | kishoretarunuem@gmail.com | Qwe123Asd |
       
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
      
      
      
      
      
      
      
      
      
      