package Page;

import Constant.LoginPageConstant;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends LoginPageConstant {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage setUsername(String usernameAsString){

        clickElement(usernameArea);
        getElement(usernameArea).sendKeys(usernameAsString);
        return this;
    }

    public LoginPage setPassword(String passwordAsString){

        clickElement(passwordArea);
        getElement(passwordArea).sendKeys(passwordAsString);
        return this;
    }

    public LoginPage clickLogin(){
        clickElement(loginButton);
        return this;
    }

}
