package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginto {
    WebDriver driver;
    public loginto(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//input[@type='text']")
    private static WebElement username;
    public static void inputUsername(String id){

        username.sendKeys("mngr346090");
    }

    @FindBy(xpath = "//input[@type='password']")
    private static WebElement password;
    public static void inputPassword(String pas){

        password.sendKeys("asUsugu");
    }

    @FindBy(xpath = "//input[@type='submit']")
    public static WebElement click;
    public static void clickbutton(){
        click.click();
    }
}