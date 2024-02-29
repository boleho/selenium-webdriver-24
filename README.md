# selenium-webdriver-24

==================branch mailserv-log=====================

branch has the same tasks and results as branch mailserv-multenv, but:

1. logging is added - D:\CODE\IDEA\selenium-webdriver-24\target\logs

2. If test is failed - screenshot is made - D:\CODE\IDEA\selenium-webdriver-24\target\screenshots

-----------------------------------------

we can use credentials according to environment used (qa/dev)

we can choose browser also (chrome/edge)

Run:

1. Jenkins - TASK FRAMEWORK MAILSERV

2. from command line: 

mvn -Dbrowser=chrome -Denvironment=qa clean test

mvn -Dbrowser=edge -Denvironment=qa clean test

mvn -Dbrowser=chrome -Denvironment=dev clean test

mvn -Dbrowser=edge -Denvironment=dev clean test

environment qa - acc_first24@yopmail.com (this choice both tests are run ok)

environment dev - acc_third24@yopmail.com (this choice the 2nd test failed - it's ok)

-------------------------------------------

Create 2 accounts on email service https://yopmail.com/en/

	acc_first24@yopmail.com

	acc_second24@yopmail.com

1. Create a message in the 1st account and send it to the 2nd one 
2. Checked the message in the 2nd account
----------------------------------

Tests work ok - 28 Feb 2024 for Chrome v.121 and Edge v.102

Need to have right chromedriver.exe and msedgedriver.exe in folder \lib



