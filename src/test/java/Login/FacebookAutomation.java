package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FacebookAutomation {
    private WebDriver driver;
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.manage().window().maximize();

        System.out.println(driver.getTitle());

        //Locate Username field
        driver.findElement(By.id("email")).sendKeys("aloladavid20@gmail.com");
        //Locate password field
        driver.findElement(By.id("pass")).sendKeys("PASSWORD2020");
        //Click on the Sign in button

        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]")).click();

    }
    //Close the browser after
    public static void main(String args[]){
        FacebookAutomation test = new FacebookAutomation();
        test.setUp();
    }

    public void setDriver(WebDriver driver){
        this.driver = driver;
        driver.quit();
    }
}
