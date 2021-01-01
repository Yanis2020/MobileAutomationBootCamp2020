package android.tests;

import android.pages.HomePage;
import android.pages.SignUpPage;
import com.pntespnuatomation.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegressionTests extends TestBase {
    HomePage homePage;
    SignUpPage signUpPage;

    @BeforeMethod
    public void setUpObject(){
        homePage = PageFactory.initElements(getDriver(), HomePage.class);
        signUpPage = PageFactory.initElements(getDriver(),SignUpPage.class);
    }
    @Test(enabled = false)
    public void userBeingAbleToClickOnSIgnUpLaterBtn(){
        homePage.userClickOnSignUpLater();
        sleepFor(2);
        homePage.userClickOnSearchBar();
        sleepFor(2);
        homePage.userEnterSomethingToSearchFor("UEFA Champions league");
        sleepFor(2);
    }

    @Test
    public void userAbleToSignUp(){
        signUpPage.userClickOnSignUpBtn();
        sleepFor(2);
        signUpPage.userEnterAnEmail("Tester2020@gmail.com");
        sleepFor(2);
        signUpPage.userEnterAPassword("TexasSaysHiYall");
        sleepFor(2);
        signUpPage.userClickOnSignUpSubmitBtn();
        sleepFor(3);

    }

}
