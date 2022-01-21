package Page;

import Constant.HomePageConstant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends HomePageConstant {


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public LoginPage getLoginModal(){
        driver.findElement(LoginHoover).click();
        return new LoginPage(driver);
    }

}
