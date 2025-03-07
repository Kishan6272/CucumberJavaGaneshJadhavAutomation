Feature: New User Registration View

  Scenario Outline: Validate new user is able to view after clicking on new Registration
    Given User navigates to the Login page
    When User entre valid "<username>" and "<password>"
    Then Close the browser
    Examples:
      | username        | password     |
      | standard_user   | secret_sauce |
      | locked_out_user | secret_sauce |
      |problem_user     | secret_sauce |
