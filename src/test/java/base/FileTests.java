package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileTests {

    private WebDriver driver;

    public String fileCaseUrl = "http://localhost:8080/welcome.co";

    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(fileCaseUrl);
        driver.manage().window().fullscreen();
    }

    public static void main(String args[]){
        FileTests tests = new FileTests();
        tests.setUp();
    }
}
