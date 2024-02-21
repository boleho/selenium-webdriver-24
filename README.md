# selenium-webdriver-24

==================branch mailserv-multenv=====================

branch contain the same task as branch mailserv, but:

1. updated multi-browser test running

2. use credentials according to environment used (dev/qa)


Create 2 accounts on email service https://yopmail.com/en/

	acc_first24@yopmail.com

	acc_second24@yopmail.com

1. Create a message in the 1st account and send it to the 2nd one 
2. Checked the message in the 2nd account
----------------------------------
There are tests in the SendNewMessageTest*, CheckIncomeMessageTest* classes

CheckIncomeMessageTest* depends on the SendNewMessageTest*, 

Run tests - pom.xml or testng.xml or via *Test classes

Tests work ok - 15 Feb 2024 for Chrome v.121 and Edge v.102

Need to have right chromedriver.exe and msedgedriver.exe in folder \lib



