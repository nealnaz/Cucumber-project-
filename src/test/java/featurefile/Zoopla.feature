
Feature:  validate registration

  Scenario: validate register page with valid details
    Given Iam on home page
    When hover on Buy
    And click register
    And enter name
    And enter address
    Then validate register page



