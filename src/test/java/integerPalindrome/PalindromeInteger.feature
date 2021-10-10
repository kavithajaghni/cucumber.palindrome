Feature:validate palindrome integer

  @tag1
  Scenario: check palindrome integer
    Given integer "121"
    When check for palandrome
    Then should pass
