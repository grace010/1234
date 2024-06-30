import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class learnSelenium1 {

    @BeforeClass
    public void beforeClass(){

    }
   /* @Test
    public void test1_OpenLink(){
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

    }*/

    @Test
    public void test2_Upload_One_Image(){
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/upload");
        //sleepInSection(4);
        WebElement fileInput = driver.findElement(By.cssSelector("input[type=file]"));
        fileInput.sendKeys("C:\\Users\\ADMIN\\Desktop\\du an\\learnSeleniumAgain\\src\\main\\uploadFiles\\tim-mossholder-7ZNp0Buodlc-unsplash.jpg");
        driver.findElement(By.id("file-submit")).click();
    }
    @Test
    public void test3_Alert() {
    }



    public void sleepInSection(long timeInSection) {
        try {
            Thread.sleep(timeInSection * 1000);
        } catch (Exception e) {
            // TODO: handle exceptVerify_Default_Dropdown2.javaion
            e.printStackTrace();
        }
    }

}
