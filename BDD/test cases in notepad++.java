*** Test Cases ***
Feature: Wheater

Scenario: Wheater - Select Category
	Given I am on wheater website
	When I select Today's Weather Maps
	Then I see Today's Weather Maps website
	
Scenario: Wheater - Back To The Main Website
	Given I am on Today's Weather Maps website
	When I select home in the blue selection bar
	Then I see main website
	
Scenario: Wheater - Turn On Hourly Temperature Forecast Maps
	Given I select Hourly Forecast Maps
	When I choose the variable selection menu
	And I select 2m Temperature
	Then I click on the arrow pointing to the right
	And I see the picture changing