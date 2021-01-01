package android.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SignUpPage {

    @FindBy(id = "btn_signup")
    private WebElement signUpBtn;


    @FindBy(xpath = "//android.view.View[@text='Email Address']")
    private WebElement enterEmail;

    @FindBy(xpath = "//android.widget.EditText[@text=\"Password (case sensitive)\"]")
    private WebElement enterPassword;

    @FindBy(xpath = "//android.widget.Button[@text=\"Sign Up\"]")
    private WebElement signUpSubmit;


    public void userClickOnSignUpBtn(){
        signUpBtn.click();
    }

    public void userEnterAnEmail(String email){
        enterEmail.sendKeys(email);
    }
    public void userEnterAPassword(String password){
        enterPassword.sendKeys(password);
    }

    public void userClickOnSignUpSubmitBtn(){
        signUpSubmit.click();
    }
}
