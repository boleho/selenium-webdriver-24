# selenium-webdriver-24

==================branch mailserv-driveman=====================

branch has the same tasks and results as branch mailserv-log, but WebDriverManager used

used:

WebDriverManager.chromedriver().setup();

instead of:

System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");

no need /lib/chromedriver.exe

import io.github.bonigarcia.wdm.WebDriverManager;



