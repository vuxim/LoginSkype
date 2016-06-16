
@tag
Feature: Login Skype

@tag1
Scenario: Check login with username and password is null
Given visit home page
When  click login
Then display message "You did not enter your Skype Name."

@tag2
Scenario: Check login with invalid email
Given visit home page
When input email "hoangmai"
	And input password "123456"
	And click login
Then display message "Signing in failed. Please double-check your Skype Name and re-enter your password."

@tag3
Scenario: Check login with invalid password
Given visit home page
When input email "hoahong"
	And input password "123456"
	And click login
Then display message "Signing in failed. Please double-check your Skype Name and re-enter your password."

#@tag4
#Scenario: Check login with email is wrong format
#Given visit home page
#When input email "vuhoangmai@gmail"
	#And input password "123456"
#Then display message "Oops! Your Skype Name isn't an email address. Were you trying to"

@tag4
Scenario: Check login with username and password is invalid
Given visit home page
When input email "hoangmai"
	And input password "12345"
	And click login
Then display message "Signing in failed. Please double-check your Skype Name and re-enter your password."


