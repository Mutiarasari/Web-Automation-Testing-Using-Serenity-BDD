@Web
  Feature: Success Login
    Background:
      And user input "standard_user" and "secret_sauce"
      And user click login button
      Then user success login

#      @Dropdown1
#      Scenario Outline: Search
#      When user click filter "<value>"
#        Examples:
#          | value |
#          | az    |
#          | za    |
#          | lohi  |
#          | hilo  |

      @Dropdown
      Scenario: Search
        When user click filter az
        And user add cart on filter az
        And user click filter za
        And user add cart on filter za
        And user click filter lohi
        And user add cart on filter lohi
        And user click filter hilo
        And user add cart on filter hilo
        And user click Cart button
        And user remove first object
        And user remove second object
        And user remove third object
        And user remove last object
        And user click continue
        Then user back to shopping list


