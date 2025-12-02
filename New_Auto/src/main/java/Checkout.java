import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkout extends Page_Base{
    public Checkout(WebDriver driver){
        super(driver);}
    By nameOnCard =By.xpath("//input[@name='name_on_card']");
    By cardNumber =By.xpath("//input[@name='card_number']");
    By cvc = By.xpath("//input[@name='cvc']");
    By expiryMonth = By.xpath("//input[@name='expiry_month']");
    By expiryYear = By.xpath("//input[@name='expiry_year']");
    By payButton = By.xpath("//button[@class='form-control btn btn-primary submit-button']");
    By continueButton= By.xpath("//a[@data-qa='continue-button']");
    By logout = By.xpath("//i[@class='fa fa-lock']");

    public void Nameoncard(){Enter_Text(nameOnCard, "Nada");}
    public void CardNumber(){Enter_Text(cardNumber, "123456789");}
    public void CVC(){Enter_Text(cvc,"123");}
    public void ExpiryMonth(){Enter_Text(expiryMonth,"12");}
    public void ExpiryYear(){Enter_Text(expiryYear,"2030");}
    public void PayButton(){Click_on_button(payButton);}
    public void Continue(){Click_on_button(continueButton);}
    public void LogOut(){Click_on_button(logout);}
}
