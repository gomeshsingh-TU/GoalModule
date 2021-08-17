package pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject {

    @FindBy(xpath = "//*[@placeholder='EmployeeNo']")
    private WebElementFacade employeeNumberInputTextBox;

    @FindBy(xpath = "//*[@placeholder='Email Address']")
    private WebElementFacade emailAddressInputTextBox;

    @FindBy(xpath = "//button[contains(text(),'SEND OTP')]")
    private WebElementFacade sendOTPButton;

    @FindBy(xpath = "//button[contains(text(),'Test Login')]")
    private WebElementFacade testLoginButton;

    @FindBy(xpath = "//div[@id='google-login']")
    private WebElementFacade signInWithPingButton;

    public void loginWithEmployeeNumber(String employeeNumber) {
        employeeNumberInputTextBox.sendKeys(employeeNumber);
        testLoginButton.click();
    }

}
