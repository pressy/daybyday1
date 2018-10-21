package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login {

    @FindBy(how =How.ID,using = "email")
    private WebElement email;


    @FindBy(how =How.NAME,using = "password")
    private WebElement password;
    {
    }


    public void enterEmail()
    {
        email.sendKeys("tolanikekani@gmail.com");
    }

    public void enterpassword()

    {
        password.sendKeys("0000000a");
        {
        }
    }


}


