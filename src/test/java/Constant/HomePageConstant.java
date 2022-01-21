package Constant;

import Util.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageConstant extends Util {


    public HomePageConstant(WebDriver driver) {
        super(driver);
    }

    public final By LoginHoover = By.cssSelector(".headerTop-content-loginLink.px-35.mr-10");

}
