Scenario: test scenario

Given the home page is loaded
When find pet owner is clicked
Then the pet owner page should be displayed

Given the find owner page is loaded
When the find owners button is clicked
Then all the owners should be displayed

Given all the owners are being displayed
When an owner link is clicked
Then the owner page should be displayed