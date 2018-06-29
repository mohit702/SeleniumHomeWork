import org.apache.bcel.generic.DREM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Welcome on 28/06/2018.
 */
public class Guru_99 {
    protected static WebDriver driver;

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src\\BrowserDriver\\chromedriver.exe");
        driver= new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/v4/");

        //driver.findElement(By.xpath("//input[contains(@id,'Company')]")).sendKeys("Aaja Phasaja");
        driver.findElement(By.xpath("//input[contains(@name,'uid')]")).sendKeys("mngr139997");
        //driver.findElement(By.id("uid")).sendKeys("mngr139997");
        driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("mUgUqut");

        driver.findElement(By.xpath("//input[contains(@name,'btnLogin')]")).click();

        driver.findElement(By.xpath("//a[contains(@href,'addcustomerpage.php')]")).click();

        driver.findElement(By.xpath("//input[contains(@name,'name')]")).sendKeys(" Miss Maya ");

        driver.findElement(By.xpath("//input[contains(@value,'f')]")).click();

        driver.findElement(By.xpath("//input[contains(@name,'dob')]")).sendKeys("20/02/2002");

        driver.findElement(By.xpath("//textarea[contains(@name,'addr')]")).sendKeys("786 London Road, " +
                " Harrow, "  +
                " HA0 0HH ");
        driver.findElement(By.xpath("//input[contains(@name,'city')]")).sendKeys("London");
        driver.findElement(By.xpath("//input[contains(@name,'state')]")).sendKeys("England");
        driver.findElement(By.xpath("//input[contains(@name,'pinno')]")).sendKeys("123456");
        driver.findElement(By.xpath("//input[contains(@name,'telephoneno')]")).sendKeys("07711223344");
        driver.findElement(By.xpath("//input[contains(@name,'emailid')]")).sendKeys("mohit@yopmail.com");
        driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("12345_6");
        driver.findElement(By.xpath("//input[contains(@value,'Submit')]")).click();
    }
}
