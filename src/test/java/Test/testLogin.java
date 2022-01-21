package Test;

import Base.BaseTest;
import Page.HomePage;
import Page.LoginPage;
import org.junit.Test;

public class testLogin extends BaseTest {

    /*
    Case 1.0
    Başarılı Login
     */
    @Test
    public void LoginCase(){
        new HomePage(driver).getLoginModal()
                .setUsername("metebunyamin")
                .setPassword("Qwerty53")
                .clickLogin();

    }

    /*
    Case 1.1
    Başarısız login without username
     */
    @Test
    public void LoginCase2(){
        new HomePage(driver).getLoginModal()
                .setUsername("")
                .setPassword("Qwerty53")
                .clickLogin();
    }


}
