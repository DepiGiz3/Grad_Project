import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Test_Base {
    WebDriver driver;
    @BeforeMethod
    public void before(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://automationexercise.com//");
    }
    @AfterMethod
    public void after() throws InterruptedException {
      Thread.sleep(6000);
       driver.quit();
    }
}
