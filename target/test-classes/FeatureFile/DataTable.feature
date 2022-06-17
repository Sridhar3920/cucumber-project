
@Login
Feature: To check Facebook Login page
Background:
Given To open the Facebook in chromeBrowser

@ValidData
Scenario: To check the valid input datas
When Enter the valid username and valid password
|sridhar3920@gmail.com|sriDHarss|
Then click a login button
Then to check successfully login or not

@InvalidUsername
Scenario: To check the invalid username and valid password
When Enter the invalid username
|sridhar@gmail.com|sriDHarss|
|sri@gmail.com|sriDHarss|
|SridE@gmail|sriDHarss|
Then click a login button
Then to check successfully login or not

@InvalidPassword
Scenario: To check the invalid password and valid username
When Enter the invalid password
|sridhar3920@gmail.com|124245425|
|sridhar@gmail.com|23456775|
|sridhar@gmail.com|fhsrf436@$|
Then click a login button
Then to check successfully login or not

  
