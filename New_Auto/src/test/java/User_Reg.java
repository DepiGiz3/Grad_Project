     import org.openqa.selenium.devtools.v122.autofill.model.Address;
     import org.testng.annotations.Test;

public class User_Reg extends Test_Base{
    @Test
    public void signup(){
        Signup_Page signup = new Signup_Page(driver);
        Home_Page home = new Home_Page(driver);
        Address_information ADD = new Address_information(driver);
        home.signup_login();
        signup.Enter_Name();
        signup.Enter_Email();
        signup.sign_button();
        signup.Password();
        signup.Gender();
        signup.Day();
        signup.Month();
        signup.Year();
        ADD.Firstname();
        ADD.Lastname();
        ADD.Company();
        ADD.Address();
        ADD.Address2();
        ADD.Country();
        ADD.State();
        ADD.City();
        ADD.ZipCode();
        ADD.Mobile();
        ADD.CreateAccount();
        ADD.Continue();
    }

}
