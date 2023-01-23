@Smoke
Feature: Login function test
#Description: Credential must be valid
#Background: given
@Positive @S29-10
Scenario: As a city bank Luma application user, login should success with valid credential
Given go to application URL
When Click the login button
And Put username
And Put password
And Click sign in button
Then Validation login status