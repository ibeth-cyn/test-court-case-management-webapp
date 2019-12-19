package base;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;

public class BaseTests {
    private WebDriver driver;

    public String homeUrl = "http://localhost:8080/welcome.co";

    @Test
    public void registrarSuccessfulLogin(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(homeUrl);
        driver.manage().window().fullscreen();
        WebElement loginLink = driver.findElement(By.cssSelector("a[href='/login.co']"));
        loginLink.click();

        WebElement email = driver.findElement(By.name("email"));
        WebElement password = driver.findElement(By.name("password"));

        email.sendKeys("registrar@lagoshighcourt.ng");
        password.sendKeys("#ntakNdi1906");

        WebElement loginButton = driver.findElement(By.tagName("button"));
        loginButton.click();

    }

    public static void main(String args[]){
        BaseTests tests = new BaseTests();
        tests.registrarSuccessfulLogin();
    }
}
