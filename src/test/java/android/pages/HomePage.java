package android.pages;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage{
    @FindBy(id = "com.espn.score_center:id/btn_sign_up_later")
    private WebElement signUpLaterBtn;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"search\"]")
    private WebElement tapOnSearchBar;

    @FindBy(xpath = "//android.widget.Button[text='Use email instead']")
    private WebElement useEmailInstead;

    @FindBy(xpath = "(//android.widget.EditText[@package='com.twitter.android.lite'])[2]")
    private WebElement emailField;

    @FindBy(id = "search_src_text")
    private WebElement searchForSomething;


    public void userClickOnSignUpLater(){
        signUpLaterBtn.click();
    }

    public void userClickOnSearchBar(){
        tapOnSearchBar.click();
    }
    public void userEnterSomethingToSearchFor(String search){
        searchForSomething.sendKeys(search, Keys.ENTER);
    }
}
