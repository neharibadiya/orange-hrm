package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.DashboardPage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    @Test
    //1. verifyUserShouldLoginSuccessFully()
    public void verifyUserShouldLoginSuccessFully(){
        //   Enter username
        loginPage.sendUserNameInUserNameField("Admin");
        //   Enter password
        loginPage.sendPasswordInPasswordField("admin123");
        //   Click on Login Button
        loginPage.setClickOnLoginBtn();
        //   Verify "Dashboard" Message
        Assert.assertEquals(dashboardPage.getDashboardText(),"Dashboard","Dashboard title not appeared");
    }
    @Test
//   2. VerifyThatTheLogoDisplayOnLoginPage()
    public void  VerifyThatTheLogoDisplayOnLoginPage()  {
        //Launch the application
        //Verify Logo is Displayed
        Assert.assertTrue(loginPage.setHrForAllLogo().isDisplayed(),"Logo Not Displayed");
    }
    @Test
    //3. VerifyUserShouldLogOutSuccessFully()
    public void VerifyUserShouldLogOutSuccessFully()throws InterruptedException{
        //   Login To The application
        verifyUserShouldLoginSuccessFully();
        //   Click on User Profile logo
        loginPage.clickOnProfileLogo();
        //   Mouse hover on "Logout" and click
        loginPage.mouseHoverOnAndClickOnLogout();
        Thread.sleep(2000);
        //   Verify the text "Login Panel" is displayed
        Assert.assertTrue(loginPage.getLoginPanelDisplayed().isDisplayed(),"Login page not displayed");
    }

}
