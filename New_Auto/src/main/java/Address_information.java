import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import javax.xml.stream.events.EntityReference;

public class Address_information extends Page_Base{
    public Address_information(WebDriver driver){
        super(driver);
    }
    By firstName = By.xpath("//input[@data-qa='first_name']");
    By lastName = By.xpath("//input[@data-qa='last_name']");
    By company = By.xpath("//input[@data-qa='company']");
    By address = By.xpath("//input[@data-qa='address']");
    By address2 = By.xpath("//input[@data-qa='address2']");
    By country = By.xpath("//select[@data-qa='country']");
    By state =By.xpath("//input[@data-qa='state']");
    By city = By.xpath("//input[@data-qa='city']");
    By zipcode= By.xpath("//input[@data-qa='zipcode']");
    By mobile = By.xpath("//input[@data-qa='mobile_number']");
    By creatAccount = By.xpath("//button[@data-qa='create-account']");
    By continu = By.xpath("//a[@data-qa='continue-button']");
    public void Firstname(){ Enter_Text(firstName,"Nada");}
    public void Lastname(){Enter_Text(lastName,"Ahmed");}
    public void Company(){Enter_Text(company,"Depii");}
    public void Address(){Enter_Text(address,"abc");}
    public void Address2(){Enter_Text(address2,"DEF");}
    public void Country(){select_by_value(country,"Canada");}
    public void State(){Enter_Text(state,"Canada");}
    public void City(){Enter_Text(city,"ABC");}
    public void ZipCode(){Enter_Text(zipcode,"123");}
    public void Mobile(){Enter_Text(mobile,"0123456789");}
    public void CreateAccount(){Click_on_button(creatAccount);}
    public void Continue(){Click_on_button(continu);}
}
