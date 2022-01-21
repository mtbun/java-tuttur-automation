package Constant;

import Util.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageConstant extends Util {


    public LoginPageConstant(WebDriver driver) {
        super(driver);
    }

    public final By usernameArea = By.name("username");
    public final By passwordArea = By.name("password");
    public final By loginButton = By.cssSelector(".medium.primary.loginForm-button");


}
