Feature:  this feature will allow the user to create new account

  Background:
     Given user click at register button

    Scenario Outline: user can create a new valid account
      And  user select gender
      And  user enter first"<first>" and last name"<last>"
      And  user enter email
      And  user enter DOB
      And  user click the chick box Newsletter and enter information
      And  user enter password and confirmed password
      And  user click on the Register button
      Then  new account created successfully
      Examples:
        |first| last|
       |ahmed|mohamed|
       |nada | ahmed|
# positive scenario
  Scenario: user can create a new valid account
    And  user select gender
    And  user enter first and last name
    And  user enter wrong email
    And  user enter DOB
    And  user click the chick box Newsletter and enter information
    And  user enter password and not match confirmed password
    And  user click on the Register button
    Then  new account  not created successfully