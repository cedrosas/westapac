Feature: Scenario2

Scenario Outline: user want that the KiwiSaver Retirement Calculator users are able to calculate what their KiwiSaver projected balance would be at retirement
Given I am on the Kiwi Saver Retirement Calculator
When User whose Current is at the age of <Age> and <Salary>, Employed with 4 Kiwisaver, 17,5PIR and High Risk profile
And  User whose current aged A is Self-employed, has a PIR 10,5, current KiwiSaver balance is 100000, voluntary contributes 90 fortnightly and chooses medium risk profile with saving goals requirement of 290000 is able to calculate his projected balances at retirement
Then Show user the Kiwi Saver Retirement Calculator

Examples:
| Age | Salary |
| 30  |   82000|
