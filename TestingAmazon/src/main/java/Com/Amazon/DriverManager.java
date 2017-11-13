package Com.Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

    public static WebDriver driver;

    public void openbrowser()
    {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver=new ChromeDriver();
        System.out.println("starting the browser");
        driver.get("https://www.amazon.co.uk/");
        driver.manage().window().maximize();
    }

    public void closebrowser()
    {
        driver.quit();
    }

}
