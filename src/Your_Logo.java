import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Welcome on 28/06/2018.
 */
public class Your_Logo {

    protected static WebDriver driver;

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src\\BrowserDriver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php?controller=authentication");

        //email_create

        driver.findElement(By.id("email_create")).sendKeys("mohit@yopmail.com");
        driver.findElement(By.name("SubmitCreate")).click();

        //driver.findElement(By.xpath("//input[contains(@id,'id_gender1')]")).click();
        //driver.findElement(By.xpath("//input[contains(@value,'1')]")).click();
        //driver.findElement(By.xpath("//*[@id=\"id_gender2\"]")).click();

        driver.findElement(By.xpath("//*[@id='customer_firstname']")).sendKeys("mohit");

        //driver.findElement(By.xpath("//input[contains(@id,'customer_firstname')]")).sendKeys("MOHIT");
        //driver.findElement(By.id("customer_firstname")).sendKeys("Mohit");
        //driver.findElement(By.id("customer_lastname")).sendKeys("Shah");
        //driver.findElement(By.id("passwd")).sendKeys("1234");
    }
}
