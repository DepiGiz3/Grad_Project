import org.testng.annotations.Test;

public class User_Reg extends Test_Base{
    @Test
    public void signup(){
        Signup_Page signup = new Signup_Page(driver);
        Home_Page home = new Home_Page(driver);
        Address_information ADD = new Address_information(driver);
        Add_to_cart cat =new Add_to_cart(driver);
        home.signup_login();
        Login_Credentials login=new Login_Credentials(driver);
        Checkout check= new Checkout(driver);
        ContctUs contact= new ContctUs(driver);
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
        login.Loginn();
        login.Password();
        login.LoginButton();
        cat.AddToCart();
        cat.Button();
        cat.Checkout();
        cat.PlaceOrder();
        check.Nameoncard();
        check.CardNumber();
        check.CVC();
        check.ExpiryMonth();
        check.ExpiryYear();
        check.PayButton();
        check.Continue();
        check.LogOut();
        contact.contactUs();
    }

}
