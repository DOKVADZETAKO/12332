package FB;

import Pages.RegPage;
import Utils.ChromeRunner;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static DataObject.RegisterPageData.*;

public class RegisterPageTests{
    WebDriver driver;
    @BeforeMethod
    public void setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://www.facebook.com/");
        Thread.sleep(2000);
    }

    @Test
    public void testLogin() throws InterruptedException {
        RegPage home = new RegPage(driver);
        home
                .GotoCreateAccount()
                .FillFirstName(firstName)
                .FillLastName(lastName);

    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }

}










