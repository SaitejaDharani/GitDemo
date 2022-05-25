Feature: Application Login

Scenario: Home page default login
Given User should be on landing page
When User login in application with valid credentials username "abcnew" and  password "hig23423"
Then  User should redirect to home page
And dashboard is displayed "true"

Scenario: Invalid login
Given User should be on landing page
When User login in application with valid credentials username "test" and  password "pas32442323"
Then  User should redirect to home page
And dashboard is displayed "false"