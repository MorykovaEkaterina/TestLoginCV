import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @Test
    public void testLogin(By locator){
        click(By.xpath("//button[contains(text(),'Log In')]"));
        fillLoginForm("cat@gmail.com", "12345678");
    }
}
