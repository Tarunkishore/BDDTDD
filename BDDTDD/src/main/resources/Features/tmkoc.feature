@TMKOCFeature
Feature: TMKOC

@TMKOC
Scenario Outline: Tarak mehta ka ulta chasma
	  Given Launch Brave Browser
	  	And Search youtube and open sussessfully
	  When Search "<Episode>"
	  	And I wait Low
	  Then I click on "Youtube_Search"
#	  	And I wait High
#			And I scoll to view "Video_TMKOC_123"
#		Then I verify "Video_TMKOC_123" available on present page
#			And I scoll to view "Video_TMKOC_101"
#		Then I verify "Video_TMKOC_101" available on present page
#			And I scoll to view "Video_TMKOC_107"
#		Then I verify "Video_TMKOC_107" available on present page
#			And I scoll to view "Video_TMKOC_103"
#		Then I verify "Video_TMKOC_103" available on present page
#			And I scoll to view "Video_TMKOC_100"
#		Then I verify "Video_TMKOC_100" available on present page
	  	And Close the Brave browser
	  
	  Examples:
	  | Episode     |
	  | TMKOC EP101 |  