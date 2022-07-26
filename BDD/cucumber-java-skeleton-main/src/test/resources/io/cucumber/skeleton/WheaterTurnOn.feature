Feature: Wheater

  Scenario: Wheater - Turn On Hourly Temperature Forecast Maps
    Given Open Google Chrome Browser
    And I select Hourly Forecast Maps
    When I choose the variable selection menu
    And I select Temperature
    And I click on the arrow pointing to the right
    Then I see the picture changing
