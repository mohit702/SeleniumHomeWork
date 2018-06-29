import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Welcome on 27/06/2018.
 */
public class Demo_Nop_Commerce {

    protected static WebDriver driver;

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src\\BrowserDriver\\chromedriver.exe");
        driver= new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://demo.nopcommerce.com/");
        driver.findElement(By.linkText("Register")).click();

        driver.findElement(By.id("gender-male")).click();

        driver.findElement(By.id("FirstName")).sendKeys("Mohit");
        driver.findElement(By.id("LastName")).sendKeys("Shah");
        Select select = new Select(driver.findElement(By.name("DateOfBirthDay")));
        select.selectByVisibleText("14");
        Select select1 = new Select(driver.findElement(By.xpath("//select[contains(@name,'DateOfBirthMonth')]")));
        select1.selectByVisibleText("October");
        Select select2 = new Select(driver.findElement(By.xpath("//select[contains(@name,'DateOfBirthYear')]")));
        select2.selectByVisibleText("1982");

        driver.findElement(By.id("Email")).sendKeys("johnsmall_11@hotmail.com");

        driver.findElement(By.xpath("//input[contains(@id,'Company')]")).sendKeys("Aaja Phasaja");

        driver.findElement(By.id("Newsletter")).click();


        //driver.findElement(By.id("Password")).sendKeys("1223m23");
        driver.findElement(By.xpath("//input[contains(@id,'Password')]")).sendKeys("123m456");

        //driver.findElement(By.id("ConfirmPassword")).sendKeys("1223m23");
        driver.findElement(By.xpath("//input[contains(@id,'ConfirmPassword')]")).sendKeys("123m456");

        //driver.findElement(By.name("register-button")).click();
        driver.findElement(By.xpath("//input[contains(@name,'register-button')]")).click();

        driver.close();

    }

}
