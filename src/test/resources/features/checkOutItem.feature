@Web
  Feature: Checkout Item

    @CheckoutItem
    Scenario: Checkout Item
      Given user inpt "standard_user" and "secret_sauce"
      And user click login
      Then user can Loggedin
      And user click add cart
      Then user can see the shopping cart being added
      And user click continue button
      And user inpt "firstname" and "lastname" and "34567"
      Then user can see checkout overview
      And user click finish button
      Then user can see checkout