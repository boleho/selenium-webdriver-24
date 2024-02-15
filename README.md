# selenium-webdriver-24

Task - practising Selenium Webdriver, TestNG, Page Object

Patterns used - Page Object, UserRepository, Singleton, Static Factory

Task consist of 2 parts:

1. Testing email service https://yopmail.com/en/ - branch mailserv 

2. Testing www.opencart.com site - branch opencart 

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

==================branch opencart =====================

www.opencart.com site testing 

There are tests in the SmokeTest.java class

Run tests - pom.xml or testng.xml or SmokeTest class

Tests work ok - 13 Feb 2024 for Chrome v.121

Need to have right chromedriver.exe in folder \lib

==================branch epstud==================

practising Selenium Webdriver according to materials from EPAM on-line course Selenium Webdriver

more details in branch epstud readme-file


================== branch main ==================

project JAVA-MAVEN from GitHub Bogdanom.

!!! doesn't work 30 Jan 24. 

error - session not created: This version of ChromeDriver only supports Chrome version 114 Current browser version is 121.

notation -  using WebDriverManager.chromedriver().setup() from io.github.bonigarcia.wdm.WebDriverManager



