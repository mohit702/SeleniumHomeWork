import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Welcome on 27/06/2018.
 */
public class PhpTravels {
    protected static WebDriver driver;

    public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver","src\\BrowserDriver\\chromedriver.exe");
            ChromeDriver driver = new ChromeDriver();

            driver.manage().window().maximize();
            driver.get("https://www.phptravels.net/register");

            driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[3]/input")).sendKeys(" Mohit ");
            driver.findElement(By.name("lastname")).sendKeys(" Shah ");
            driver.findElement(By.name("phone")).sendKeys(" 0702 ");
            driver.findElement(By.name("email")).sendKeys("mohit9@yopmail.com");
            driver.findElement(By.name("password")).sendKeys("123456");
            driver.findElement(By.name("confirmpassword")).sendKeys("123456");
            driver.findElement(By.xpath("//*[@id='headersignupform']/div[9]/button")).click();

            String expectedMsg = "Hi, Mohit Shah";
            String actualMsg = driver.findElement(By.xpath("//h3[text()='Hi, Mohit Shah']")).getText();
    if (actualMsg.equals(expectedMsg)){

        System.out.println("this test case is pass" +expectedMsg);


    }





    }


}
