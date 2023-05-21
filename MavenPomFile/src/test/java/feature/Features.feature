@Gmail_login 
Feature: Gmail login 
As a gmail user i should able to login to gmail. 

Background: login page 
Given gmail login URL 
Then it should navigate to login page 

@Regression @Valid_login 
Scenario: Valid login 
When I give "valid Mail" and Click next button in mail id page
And I give "valid password" and click Next button in password page 
Then it should take to inbox

@InValid_login 
Scenario: Invalid login 
When I give "invalid Mailid" and Click next button in mail id page
When I give "invalid password" and click Next button in password page 
Then it should say invalid 