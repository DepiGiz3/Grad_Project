import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Add_to_cart extends Page_Base{
    public Add_to_cart(WebDriver driver) {
        super(driver);
    }
//    By viewProduct = By.xpath("//a[@href='/product_details/1']");
    By addToCart = By.xpath("//a[@data-product-id='1' and contains(@class, 'add-to-cart')]");
    By successs= By.xpath("//a[@href='/view_cart']");
    By checkout = By.xpath("//a[@class='btn btn-default check_out']");
    By placeOrder = By.xpath("//a[@class='btn btn-default check_out']");

   // public void View_Product(){Click_on_button(viewProduct);}
    public void AddToCart(){Click_on_button(addToCart);}
    public void Button(){Click_on_button(successs);}
    public void Checkout(){Click_on_button(checkout);}
    public void PlaceOrder(){Click_on_button(placeOrder);}
}
