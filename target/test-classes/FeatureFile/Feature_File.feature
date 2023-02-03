Feature: Checking the Hotel Booking Functionality in Adactin application
@SmokeTest
Scenario Outline: Checking Login Functionality
Given user Should Launch The Url 
When user Should Enter "<username>" In Username Field 
And user Should Enter "<password>" In Password Field
Then user Should Click LoginButton To Navigate To Search Hotel Page 

Examples:
|username|password|
|Muhil|Muhil123|
|Muhilarasan|Muhil@03|

@SanityTest
Scenario: Checking Hotel Search Functionality 
When user Should Select Location From Location Dropdown
And user Will Select Hotel From Hotel Dropdown
And user Will Select Room Type From Room Type Dropdown
And user Should Select Number Of Rooms From Number Of Rooms Dropdown
And user Should Enter The Check In Date In Check In Date Field
And user Should Enter The Check Out Date In Check Out Date Field
And user Should Select Adults Per Room In Adults Per Room Dropdown
And user will Select Children Per Room In Children Per Room Dropdown
Then user Should Click SearchButton To Navigate To Select Hotel Page

Scenario: Checking Hotel Select Functionality
When user Must Select The Hotel Using RadioButton
Then user Must Click ContinueButton To Navigate To Book Hotel page

Scenario: Checking Book Hotel Functionality
When user Must Enter First Name In First Name Field
And user Must Enter Last Name In Last Name Field
And user Must Enter Address In Billing Address Field
And user Must Enter Credit Card Number In Credit Card Number Field
And user Must Select Credit Card Type In Credit Card Type Dropdown
And user Must Select Expiry Month In Expiry Date Field Using Expiry Month Dropdown
And user Must Select Expiry Year In Expiry Date Field Using Expiry Year Dropdown
And user Must Enter Cvv Number In Cvv Number Field
Then user Must Click BookNowButton To Navigate To Booking Confirmation Page

Scenario: Checking Booking Confirmation Functionality
When screenshot Will Be Taken
Then user Should Click My ItineraryButton To Navigate To Booked Itinerary Page

Scenario: Checking Booked Itinerary Functionality
When screenshot Will Be Taken In Booked Itinerary Page