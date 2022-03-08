Feature: search for Samsung mobile and TV 

Background:
   Given open the browser 
	When open url 
	
@samsungtest
Scenario: Searching for Samsung mobile 
#	Given open the browser 
#	When open url 
	Then search for Samsung Mobile 
	Then close browser 

@redmitv	
Scenario: Searching for Redmi Tv 
#	Given open the browser 
#	When open url 
	Then search for Redmi TV 
	Then close browser 
	
	@OppoPhn
	Scenario: Searching for Oppo Phn
#	Given open the browser 
#	When open url 
	Then search for Oppo Phn
	Then close browser 
    