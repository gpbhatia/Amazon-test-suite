package Com.Amazon;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static Com.Amazon.DriverManager.driver;
import static org.junit.Assert.assertTrue;



public class AmazonUKStepDefs {
    @Before
    public void openbrowser()
    {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver=new ChromeDriver();
        System.out.println("starting the browser");
        driver.get("https://www.amazon.co.uk/");
       // driver.manage().window().maximize();
    }
    // @After
    //public void closebrowser()
    //{
      //  driver.quit();
    //}


    @Given("^I'm in homepage$")
    public void i_m_in_homepage() throws Throwable {


    }

    @When("^I clicks on login button$")
    public void i_clicks_on_login_button() throws Throwable {
        driver.findElement(By.xpath("//span[text()='Hello. Sign in']")).click();

    }

    @When("^I enters data with name \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_enters_data_with_name_and(String Username, String Password) throws Throwable {
        driver.findElement(By.id("ap_email")).sendKeys(Username);
        driver.findElement(By.id("ap_password")).sendKeys(Password);
        driver.findElement(By.id("signInSubmit")).click();

    }

    @Then("^user should login successfully$")
    public void user_should_login_successfully()  {

      Boolean LogInCheck = driver.getPageSource().contains("Hi, macy");

      //  Boolean LogInCheck = driver.getPageSource().contains("abcd123");
      assertTrue(LogInCheck);
    }
   // @After
   // public void closebrowser()
   // {
   //     driver.quit();
    //}






    @Then("^user should see the Prime detail page successfully$")
    public void userShouldSeeThePrimeDetailPageSuccessfully()  {
        driver.findElement(By.id("primeDetailPage"));
    }

    @When("^I click on  Try Prime button$")
    public void iClickOnTryPrimeButton()  {
        driver.findElement(By.id("nav-link-prime")).click();
    }

    @When("^I click on  Your Lists button$")
    public void iClickOnYourListsButton()  {
        driver.findElement(By.id("nav-link-wishlist")).click();
      //  driver.findElement(By.xpath("//span[text()='Hello. Sign in']")).click();
    }

    @Then("^user should see Get started page successfully$")
    public void userShouldSeeGetStartedPageSuccessfully()   {
        driver.findElement(By.className("a-nowrap"));
    }
    @After
    public void closebrowser()
    {
      driver.quit();
    }
}
