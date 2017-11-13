package Com.Amazon;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import static Com.Amazon.DriverManager.driver;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AmazonSearchStepdefs {
    @Before
    public void openbrowser() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("starting the browser");
        driver.get("https://www.amazon.co.uk/");
        // driver.manage().window().maximize();
    }


    @Given("^user is in home page$")
    public void user_is_in_home_page() {

    }

    @When("^user clicks on searchbar$")
    public void userClicksOnSearchbar() {
        driver.findElement(By.id("twotabsearchtextbox")).click();
    }

    @When("^user enters \"([^\"]*)\"$")
    public void user_enters(String product) {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(product);
        driver.findElement(By.xpath("//input[@class='nav-input']")).click();
    }

    @Then("^user should see the product detail page successfully$")
    public void user_should_see_the_product_detail_page_successfully() {
        boolean product_detail_page;
        if (driver.getPageSource().contains(
                "laptop")) product_detail_page = true;
        else product_detail_page = false;
        assertTrue( product_detail_page);

    }


    @After
    public void closebrowser() {
        driver.quit();
    }

}



