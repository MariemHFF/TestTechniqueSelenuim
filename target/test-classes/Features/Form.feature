Feature: Fill the Form

  Scenario Outline: Fill the form
    Given user is on the form page
    When user enters <Firstname> and <Lastname>
    And user fills <Country> and <Email>
    And user add <Telephone>
    And clicks on Send button
    Then A confirmation message will appear

    Examples: 
      | Firstname | Lastname | Country | Telephone | Email                  |
      | Mariem    | Haffar   | Tunisia |  21345723 | Mariemhaffar@gmail.com |
