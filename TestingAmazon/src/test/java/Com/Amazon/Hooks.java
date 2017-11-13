package Com.Amazon;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks extends DriverManager {



    @Before
    public  void setUP()
    {
       openbrowser();
    }


    @After
    public void tearDown()
    {
        closebrowser();
    }

}
