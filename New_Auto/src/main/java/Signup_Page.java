import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Signup_Page extends Page_Base{
    By name_field = By.xpath("//input[@data-qa='signup-name']");
    By email_field = By.cssSelector("input[data-qa='signup-email']");
    By signup_button = By.xpath("//button[@data-qa='signup-button']");
    By gender = By.id("id_gender2");
    By password = By.xpath("//input[@data-qa='password']");
    By day= By.xpath("//select[@data-qa='days']");
    By month= By.xpath("//select[@data-qa='months']");
    By year= By.xpath("//select[@data-qa='years']");
    public Signup_Page(WebDriver driver) {
        super(driver);
    }
    public void Enter_Name(){
        Enter_Text(name_field , "NadaaM");
    }
    public void Enter_Email(){
        Enter_Text(email_field , "Nadaaaa@Nadaa.commm");
    }
    public void sign_button(){
        Click_on_button(signup_button);
    }
    public void Gender(){Click_on_button(gender);}
    public void Password(){Enter_Text(password,"Nadaaaa");}
    public void Day(){select_by_value(day,"17");}
    public void Month(){select_by_index(month,9);}
    public void Year(){select_by_value(year,"1998");}

}
