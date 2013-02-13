
Scenario: acceptance test scenario

Given the find owner page is loaded
When the find owners button is clicked
Then all the owners should be displayed

Given all the owners are being displayed
When an owner link is clicked
Then the owner page should be displayed