Feature: Reset functionality
  I want to use this template for my feature file

  Scenario Outline: verificatin of reset button
    Given user opens browser and launch application
    When user enters "<username>" and "<password>"
    Then user clicks on reset button
Examples: 
|username | password |
|asdad		|sdsdf			|
|fdsfsfwer|sdsdfsdfdfs|
|sdfdsfwe	|sdfsefwecsd|


Scenario:
Given user opens browser and launch application
When user enters "<username>" and "<password>"
Then user clicks on login button