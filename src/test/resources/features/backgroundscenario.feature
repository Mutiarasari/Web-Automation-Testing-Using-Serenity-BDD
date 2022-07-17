@Web
  Feature: Scenario with Background

    Background: Login
      Given user inputss "standard_user" and "secret_sauce"
      And user click button login
      Then user can logedin

