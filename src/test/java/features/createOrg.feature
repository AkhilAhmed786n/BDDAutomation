Feature: Create Organisation in vtiger

Scenario Outline: Create Organisation
	Given Launch Browser
		And open the  URL "http://localhost:8888"
		When login page is displayed
		Then enter UserName "admin"
		And enter Password "admin"
		Then click on login button
		And verify the homepage title
		Then click on organisation link
		Then just wait
		And click on CreateOrg img
		Then enter OrgName "<orgName>"
		And enter PhnNum "<phoneNumber>"
		Then save the organisation
		And logout from the application
		Then close the browser
		
		Examples:
		| orgName | phoneNumber |
		| Tyss9 | 89851 |
		| Tyss10 | 88831 |
		| Tyss11 | 77801 |
		| Tyss12 | 36591 |
