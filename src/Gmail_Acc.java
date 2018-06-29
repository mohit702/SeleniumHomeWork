import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Welcome on 29/06/2018.
 */
public class Gmail_Acc {
    protected static WebDriver driver;


    public static void main(String args[])
    {


        System.setProperty("webdriver.chrome.driver","src\\BrowserDriver\\chromedriver.exe");
        driver= new ChromeDriver();


        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.google.com/gmail/about/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("CREATE AN ACCOUNT"));
        driver.get("https://accounts.google.com/SignUp?service=mail&continue=http%3A%2F%2Fmail.google.com%2Fmail%2F%3Fpc%3Dcarousel-about-en");


        driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys("Romeo");
        driver.findElement(By.xpath("//*[@id='lastName']")).sendKeys("Jugnu");
        driver.findElement(By.xpath("//*[@id='username']")).sendKeys("Aaja.Phasaja1@gmail.com");
        driver.findElement(By.xpath("//*[@name='Passwd']")).sendKeys("Bachhe_ki_Jaan_loge_Kya*");
        driver.findElement(By.xpath("//*[@name='ConfirmPasswd']")).sendKeys("Bachhe_ki_Jaan_loge_Kya*");

        driver.findElement(By.xpath("//*[@id=\"accountDetailsNext\"]/content/span")).click();



    }

}
