package StepDefinitions;

import PageObjectModel.loginto;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Map;

import static Utils.CommonUtils.login;

public class StepDefinitionGuru99 {

    public static WebDriver driver;
    loginto obj=new loginto(driver);

    static Logger log = LogManager.getLogger(StepDefinitionGuru99.class);

    @Then("User lands on Guru99 Demo Site and  Guru99 Bank is displayed")
    public void user_lands_on_guru99_demo_site_and_guru99_demo99_is_displayed() {
        WebElement someText = driver.findElement(By.xpath("/html/body/div[2]/h2"));
        Assert.assertTrue(someText.isDisplayed());
        Utils.CommonUtils.getScreenshot(driver, "Guru99");
        log.info("Guru99 Bank is displayed");
    }
    @Given("^User on the login home page$")
    public void user_on_the_login_home_page() throws Throwable {
        String text=driver.findElement(By.xpath("//h2")).getText();
        Utils.CommonUtils.getScreenshot(driver,"userhomepage");
        log.info(text+ " is present");

    }
    @When("^User enters username and password and then click on the loggin button$")
    public void user_enters_username_and_password_and_then_click_on_the_loggin_button(Map<String,String> data) throws Throwable {


     obj.inputUsername(data.get("UserID"));
     obj.inputPassword(data.get("Password"));
     Utils.CommonUtils.getScreenshot(driver,"usertyped");
     obj.clickbutton();


       // driver.findElement(By.xpath("//input[@type='text']")).sendKeys(data.get("UserID"));
      //  driver.findElement(By.xpath("//input[@type='password']")).sendKeys(data.get("Password"));
       // driver.findElement(By.xpath("//input[@type='submit']")).click();
    }
    @Then("^user able to see Manger Id : mngr346090 page$")
    public void user_able_to_see_manger_id_mngr346090_page() throws Throwable {
        Utils.CommonUtils.getScreenshot(driver,"userloggedin");
        String text1=driver.findElement(By.xpath("//td[text()='Manger Id : mngr346090']")).getText();
        log.info(text1);
    }
    @Given("User is on the Managerhomepage")
    public void user_is_on_the_managerhomepage() {
        login(driver);
        String managerHomePage=driver.findElement(By.xpath("//td[text()='Manger Id : mngr346090']")).getText();
        Utils.CommonUtils.getScreenshot(driver,"user is on the managerhomepage");
        log.info(managerHomePage+ " is present");
    }

    @When("click on New Customer button")
    public void click_on_new_customer_button() {
     //   newCustomer.setClickNewCustomer();

       // WebElement newCustomerbutton= driver.findElement(By.xpath("//a[@href='addcustomerpage.php']"));
      //  newCustomerbutton.click();
    }


    @Then("User on the New Customer Entry page and user can see Add New Customer text")
    public void user_on_the_new_customer_entry_page_and_user_can_see_add_new_customer_text() {
        String actualtext=driver.findElement(By.xpath("//p[@class='heading3']")).getText();
        String expectedtext="Add New Customer";
        if(actualtext.equals(expectedtext)){
            log.info("user is on the right page");
        }else{
            log.error("user on the wrong page");
        }
    }
    @Given("User is on the Add New Customer page")
    public void user_is_on_the_add_new_customer_page() {
        login(driver);
        WebElement newCustomerbutton= driver.findElement(By.xpath("//a[@href='addcustomerpage.php']"));
        newCustomerbutton.click();
        String AddCustomerPage=driver.findElement(By.xpath("//p[text()='Add New Customer']")).getText();
        Utils.CommonUtils.getScreenshot(driver,"user is on the  Add Customer Page");
        log.info(AddCustomerPage+ " is present");
    }
    @When("User fill out all the information for new customer and submit the informations")
    public void user_fill_out_all_the_information_for_new_customer_and_submit_the_informations(Map<String,String> data) {
        driver.findElement(By.xpath("//input[@name='name']")).sendKeys(data.get("Customer Name"));
        if(data.get("Gender").equalsIgnoreCase("Female")){
            driver.findElement(By.xpath("//input[@value='f']")).click();
        }else{
            driver.findElement(By.xpath("//input[@value='m']")).click();
        }
        driver.findElement(By.xpath("//input[@type='date']")).sendKeys(data.get("Date of Birth"));
        driver.findElement(By.xpath("//textarea[@rows='5']")).sendKeys(data.get("Address"));
        driver.findElement(By.xpath("//input[@type='text'and@name='city']")).sendKeys(data.get("City"));
        driver.findElement(By.xpath("//input[@type='text'and@name='state']")).sendKeys(data.get("State"));
        driver.findElement(By.name("pinno")).sendKeys(data.get("PIN"));
        driver.findElement(By.xpath("//input[@type='text'and@name='telephoneno']")).sendKeys(data.get("Mobile Number"));
        driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys(data.get("E-mail"));
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(data.get("Password"));
        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }
    @Then("verifying the new customer added")
    public void verifying_the_new_customer_added() {

        String RegisteredPage=driver.findElement(By.xpath("//p[@class='heading3']")).getText();
        Utils.CommonUtils.getScreenshot(driver,"user is on the  Registered Page");
        log.info(RegisteredPage+ " is present");
    }
}