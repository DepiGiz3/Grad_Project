import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home_Page extends Page_Base{
    By signup_loginbutton = By.className("fa-lock");
    public Home_Page(WebDriver driver) {
        super(driver);
    }
    public void signup_login(){
        Click_on_button(signup_loginbutton);
    }
}
