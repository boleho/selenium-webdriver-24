# selenium-webdriver-24

Task - practising Selenium Webdriver, TestNG, Page Object

Patterns used - Page Object, UserRepository, Singleton, Static Factory

Task consist of 2 parts:

1. Testing email service https://yopmail.com/en/ - branch mailserv, mailserv-multenv

2. Testing www.opencart.com site - branch opencart 

================== branch main ==================

documentation only

Last developed branch - mailserv-log

More details is in the Readme-files of the specific branches

Project is finished on 29 Feb 2024

==================branch mailserv =====================

Create 2 accounts on email service https://yopmail.com/en/

acc_first24@yopmail.com

acc_second24@yopmail.com

Create a message in the 1st account and send it to the 2nd one

Checked the message in the 2nd account

There are tests in the SendNewMessageTest*, CheckIncomeMessageTest* classes

CheckIncomeMessageTest* depends on the SendNewMessageTest*,

Run tests - pom.xml or testng.xml or via *Test classes

Tests work ok - 15 Feb 2024 for Chrome v.121 and Edge v.102

Need to have right chromedriver.exe and msedgedriver.exe in folder \lib

==================branch mailserv-multenv=====================

branch has the same tasks and results as branch mailserv, but run via scripts

we can use credentials according to environment used (qa/dev)

we can choose browser also (chrome/edge)

Run from command line:

mvn -Dbrowser=chrome -Denvironment=qa clean test

mvn -Dbrowser=edge -Denvironment=qa clean test

mvn -Dbrowser=chrome -Denvironment=dev clean test

mvn -Dbrowser=edge -Denvironment=dev clean test

environment qa - acc_first24@yopmail.com (this choice both tests are run ok)

environment dev - acc_third24@yopmail.com (this choice the 2nd test failed - it's ok)

Tests work ok - 27 Feb 2024 for Chrome v.121 and Edge v.102

Need to have right chromedriver.exe and msedgedriver.exe in folder \lib

==================branch mailserv-log=====================

branch has the same tasks and results as branch mailserv-multenv, but:

1. logging is added - D:\CODE\IDEA\selenium-webdriver-24\target\logs

2. If test is failed - screenshot is made - D:\CODE\IDEA\selenium-webdriver-24\target\screenshots 

Tests work ok - 29 Feb 2024 for Chrome v.121 and Edge v.102

Run:

1. Jenkins - TASK FRAMEWORK MAILSERV

2. from command line: 

mvn -Dbrowser=chrome -Denvironment=qa clean test

mvn -Dbrowser=edge -Denvironment=qa clean test

mvn -Dbrowser=chrome -Denvironment=dev clean test

mvn -Dbrowser=edge -Denvironment=dev clean test

environment qa - acc_first24@yopmail.com (this choice both tests are run ok)

environment dev - acc_third24@yopmail.com (this choice the 2nd test failed - it's ok)

==================branch opencart =====================

www.opencart.com site testing 

There are tests in the SmokeTest.java class

Run tests - pom.xml or testng.xml or SmokeTest class

Tests work ok - 13 Feb 2024 for Chrome v.121

Need to have right chromedriver.exe in folder \lib

==================branch mailserv-driveman=====================

branch has the same tasks and results as branch mailserv-log, but WebDriverManager used

used:

WebDriverManager.chromedriver().setup();

instead of:

System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");

no need /lib/chromedriver.exe

import io.github.bonigarcia.wdm.WebDriverManager;






