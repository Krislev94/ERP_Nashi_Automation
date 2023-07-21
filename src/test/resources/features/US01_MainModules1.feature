@wip
Feature: Default

	#*{color:#de350b}_US:_{color}*
	#
	#As a user I should be able to see the error message after entering the invalid credentials. 
	#
	#{color:#de350b}*_AC:_*{color}
	#
	#2. Verify the "Wrong login/password" error message should be displayed after entering invalid password.

	Scenario: US01-AC02-TC04 Verify the error message is displayed after entering invalid password..
		Given user is on the login page
		And user enters email "posmanager55@info.com "
		Then user enters invalid password "posmanager55"
		And user hits Enter button on the keyboard
		Then user sees "Wrong login/password"	

	#{color:#de350b}_*US:*_{color}
	#
	#As a user I should be able to see the "Please fill in this field"message after leaving at least one blank field.  
	#
	#{color:#de350b}_*AC:*_{color}
	#
	#3. Verify that the user gets the "Please fill in this field." message for at least one blank field.
	@B29G32-273
	Scenario: US01-AC03-TC06 Verify user gets the "Please fill in this field." message for at least one blank field. 
		Given user is on the login page
		And user leaves email and password inputs empty and clicks login
		Then user sees at least one "Please fill in this field" message	

	#{color:#FF0000}_*US:*_{color}
	#
	#As a user I should be able to see the error message after entering the invalid credentials. 
	#
	#{color:#FF0000}_*AC:*_{color}
	#
	#2. Verify the "Wrong login/password" error message should be displayed after entering the invalid credentials
	#
	# 
	@B29G32-226
	Scenario: US01-AC02-TC03 Verify the error message is displayed after entering the invalid credentials.
		Given user is on the login page
		And user enters invalid email "posmanager@info.com "
		Then user enters password "posmanager"
		And user hits Enter button on the keyboard
		Then user sees "Wrong login/password"	

	#{color:#ff0000}_*US:*_{color}
	#
	#As a user,  I should be able to log in.
	#
	#{color:#ff0000}_*AC:*_{color}
	#
	#AC_1 - Verify that the user can log in with valid credentials by clicking on the "Login" button.
	#
	# 
	@B29G32-224
	Scenario Outline: US01-AC01-TC01 Verify the user can log in with valid credentials either by clicking on the "Login" button. 
		Given user is on the login page
		Then user enters email "<email>"
		Then user enters password "<password>"
		And user clicks login button
		Then user sees account name as "<name>"

		Examples:
		| email                 | password   | name         |
		| posmanager55@info.com | posmanager | POSManager55 |
		| posmanager67@info.com | posmanager | POSManager67 |
		| posmanager89@info.com | posmanager | POSManager89 |
		
		Examples:
		| email                      | password        | name              |
		| eventscrmmanager66@info.com | eventscrmmanager | EventsCRMManager66 |
		| eventscrmmanager69@info.com | eventscrmmanager | EventsCRMManager69 |
		| eventscrmmanager71@info.com | eventscrmmanager | EventsCRMManager71 |


	#*_US:_*
	#
	#As a user I should be able to see the error message after entering the invalid credentials. 
	#
	#*_AC:_*
	#
	#2. Verify the "Wrong login/password" error message should be displayed after entering the invalid credentials
	#
	# 
	@B29G32-272
	Scenario: US01-AC02-TC05 Verify the error message is displayed after entering the invalid credentials.
		Given user is on the login page
		And user enters invalid email "posmanager@info.com "
		Then user enters invalid password "posmanager55"
		And user hits Enter button on the keyboard
		Then user sees "Wrong login/password"	

	#{color:#de350b}*_US:_*{color}
	#
	#As a user I should be able to see the "Please fill in this field"message after leaving at least one blank field.  
	#
	#{color:#de350b}*_AC:_*{color}
	#
	#3. Verify that the user gets the "Please fill in this field." message for at least one blank field.
	@B29G32-274
	Scenario: US01-AC03-TC07 Verify user gets the "Please fill in this field." message for at least one blank field.
		Given user is on the login page
		And user leaves email input empty
		And user enters password "posmanager" and clicks login
		Then user sees at least one "Please fill in this field" message	

	#{color:#de350b}_*US:*_{color}
	#
	#As a user I should be able to log in.
	#
	#{color:#de350b}_*AC:*_{color} 
	#
	#AC_1-Verify that user can log in with valid credentials by hitting "Enter" button on keyboard. 
	@B29G32-270
	Scenario Outline: US01-AC01-TC02 Verify the user can log in with valid credentials either by hitting "Enter" button. 
		Given user is on the login page
		Then user enters email "<email>"
		Then user enters password "<password>"
		And user hits Enter button on the keyboard
		Then user sees account name as "<name>"
		
		Examples:
		| email                 | password   | name         |
		| posmanager55@info.com | posmanager | POSManager55 |
		| posmanager67@info.com | posmanager | POSManager67 |
		| posmanager89@info.com | posmanager | POSManager89 |
		
		Examples:
		| email                      | password        | name              |
		| eventscrmmanager66@info.com | eventscrmmanager | EventsCRMManager66 |
		| eventscrmmanager69@info.com | eventscrmmanager | EventsCRMManager69 |
		| eventscrmmanager71@info.com | eventscrmmanager | EventsCRMManager71 |