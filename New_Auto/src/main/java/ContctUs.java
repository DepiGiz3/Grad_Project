import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContctUs extends Page_Base {
    public ContctUs(WebDriver driver) {
        super(driver);
    }
    By envelop = By.xpath("//i[@class='fa fa-envelope']");
    By name = By.xpath("//input[@name='name']");
    By email = By.xpath("//input[@data-qa='email']");
    By subject = By.xpath("//input[@data-qa='subject']");
    By message = By.xpath("//textarea[@data-qa='message']");
    By submit=By.xpath("//input[@data-qa='submit-button']");

    public void contactUs(){
        Click_on_button(envelop);
        Enter_Text(name,"Nada");
        Enter_Text(email,"Nada@Mada.com");
        Enter_Text(subject,"suggasagus");
        Enter_Text(message,"Test");
        Click_on_button(submit);
    }
}
