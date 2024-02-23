package autotest.mailserv.driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class DriverSingleton {
    private static WebDriver driver;
    private DriverSingleton(){}
    public static WebDriver getDriver(){
        if (null == driver){
            if (System.getProperty("browser").equals("edge")) {
                System.setProperty("webdriver.edge.driver", "./lib/msedgedriver.exe");
                driver = new EdgeDriver();
            } else {
                System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
                driver = new ChromeDriver();
            }
            driver.manage().window().maximize();
            //driver.manage().window().setSize(new Dimension(480, 640)); // mobile screen
        }
        return driver;
    }
    public static void closeDriver(){
        driver.quit();
        driver = null;
    }
}
