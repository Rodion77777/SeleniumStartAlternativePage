package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class LoginForm {

    private EventFiringWebDriver eventDriver;

    public LoginForm (EventFiringWebDriver eventDriver) {
        this.eventDriver = eventDriver;
    }

    public void inputLogin (String email) {
        eventDriver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(email);
    }

    public void inputPassword (String password) {
        eventDriver.findElement(By.xpath("//*[contains(@id, 'passwd')]")).sendKeys(password);
    }

    public void clickLoginButton () {
        eventDriver.findElement(By.xpath("//*[contains(@id, 'SubmitLogin')]")).click();
    }
}
