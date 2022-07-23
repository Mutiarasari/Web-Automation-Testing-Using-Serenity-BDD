@Web
  Feature: Scenario with Background

    Background: Login
      And user input "standard_user" and "secret_sauce"
      And user click login button
      Then user success login

      @NavigateToFacebook
      Scenario: NavigateToFacebook
        And user scroll to buttom page
        And user click facebook
        And user move to tab
        Then user can validate url tittle
