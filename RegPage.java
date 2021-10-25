package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegPage {
    WebDriver driver;

    public RegPage(WebDriver driver) {
        this.driver = driver;
    }

    By CreateAccBTn = By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/div/div[1]/form/div[5]/a");//(By.xpath("//*[text()='Create New Account']")),
    By firstNameInput = By.name("firstname");
    By lastNameInput = By.name("lastname");

    public RegPage GotoCreateAccount() throws InterruptedException {
        driver.findElement(CreateAccBTn).click();
        Thread.sleep(2000);
        return this;
    }

    public RegPage FillFirstName(String firstName) {
        driver.findElement(firstNameInput).sendKeys(firstName);
        return this;
    }

    public RegPage FillLastName(String lastName) {
        driver.findElement(lastNameInput).sendKeys(lastName);
        return this;
    }
}
