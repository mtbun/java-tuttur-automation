package Base;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public  class BaseTest {

    public WebDriver driver;

    @Before
    public  void setUp(){
        System.out.println("beforeall");
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.tuttur.com");

    }

    @After
    public void tearDown(){
        //driver.quit();

    }


}
