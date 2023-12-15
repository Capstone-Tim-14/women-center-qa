package starter.login;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class loginAdmin extends PageObject {
    private By emailField(){return By.xpath("/html/body/div/div/div/div/div/form/div[1]/div/input");}
    private By passwordField(){return By.xpath("/html/body/div/div/div/div/div/form/div[2]/div/input");}
    private By button(){return By.xpath("/html/body/div/div/div/div/div/form/div[3]/button");}
    private By validasilogin(){return By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div[1]/h3");}
    private By emailFailed(){return By.xpath("/html/body/div/div/div/div/h3");}
    @Step
    public void openVite(){
        open();
    }
    @Step
    public void inputemail(String email){
        $(emailField()).type(email);
    }
    @Step
    public void inputpassword(String pass){
        $(passwordField()).type(pass);
    }
    @Step
    public void clickbuttonlogin(){
        $(button()).click();
    }
    @Step
    public void validasiloginsuccess(String successLogin){
        try {
            WebElement resultMessage = find(validasilogin());

            if (resultMessage != null) {
                String messageText = resultMessage.getText();

                if (!messageText.equalsIgnoreCase(successLogin)) {
                    throw new AssertionError("Validation failed! Actual result '" + messageText +
                            "' does not match expected result '" + successLogin + "'");
                }
            } else {
                throw new AssertionError("Validation failed! Result message element not found.");
            }
        } catch (NoSuchElementException e) {
            throw new AssertionError("Validation failed! Result message element not found.", e);
        }
    }
    public void failedLoginBecauseInvalidEmail(){
        $(emailFailed()).isDisabled();
    }
    public void failedLoginBecauseInvalidPassword(){
        $(emailFailed()).isDisabled();
    }
    public void failedLoginBecauseNotFillEmailPassword() {
        $(emailFailed()).isDisabled();
    }
}