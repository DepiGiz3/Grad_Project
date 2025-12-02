import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_Credentials extends Page_Base{
    public Login_Credentials(WebDriver driver) {
        super(driver);
    }
    By username = By.xpath("//input[@data-qa='login-email']");
    By password = By.xpath("//input[@data-qa='login-password']");
    By login_button = By.xpath("//button[@data-qa='login-button']");
    public void Loginn(){ Enter_Text(username,"Nadaaaa@Nadaa.com");}
    public void Password(){Enter_Text(password,"Nadaaaa");}
    public void LoginButton(){Click_on_button(login_button);}
}
