package base;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginTests extends BaseTests{
    BaseTests baseTests = new BaseTests();
    @Test
    public void testSuccessfulLogin(){
        baseTests.registrarSuccessfulLogin();

    }

}
