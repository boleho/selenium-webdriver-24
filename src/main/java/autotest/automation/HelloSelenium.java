package autotest.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloSelenium {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().window().setSize(new Dimension(480, 640)); // mobile screen
        driver.get("https://www.opencart.com/");
        System.out.println("++=++working le ++==++");
        Thread.sleep(3000);

        driver.quit();
    }
}
