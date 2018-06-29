import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Welcome on 27/06/2018.
 */
public class Mercury {

    protected static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src\\BrowserDriver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://newtours.demoaut.com/mercuryregister.php?osCsid=649bc8cf2ce17ae2d091bce2b50775af");

        driver.findElement(By.name("firstName")).sendKeys(" Tees Maar ");
        driver.findElement(By.name("lastName")).sendKeys(" Khan ");
        driver.findElement(By.name("phone")).sendKeys(" 420 ");
        driver.findElement(By.id("userName")).sendKeys(" Pappu@cantdancesala.com ");
        driver.findElement(By.name("address1")).sendKeys(" 786 London Road ");
        driver.findElement(By.name("address2")).sendKeys(" Harrow ");
        driver.findElement(By.name("city")).sendKeys(" London ");
        driver.findElement(By.name("state")).sendKeys(" England ");
        driver.findElement(By.name("postalCode")).sendKeys(" HAI IAH");
        Select select = new Select(driver.findElement(By.name("country")));
        select.selectByVisibleText("UNITED KINGDOM ");

        driver.findElement(By.name("email")).sendKeys("Shree 420");
        driver.findElement(By.name("password")).sendKeys("1234");

        //wrong password entry to show
        driver.findElement(By.name("confirmPassword")).sendKeys("123");



    }

}
