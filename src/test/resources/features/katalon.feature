@Web1
  Feature: Login

    Scenario Outline: Login Katalon
      When user click Appointment Button
      And user inputs "<username>" and "<password>"
      And user click login Button
      Then user succesfully Loggedin

      Examples:
        | username | password           |
        | John Doe | ThisIsNotAPassword |
