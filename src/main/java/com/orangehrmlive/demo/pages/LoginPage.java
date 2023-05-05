package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends Utility {
    /**
     * LoginPage - Store usename, password, Login Button, HR for All logo, and LOGIN Panel text Locators
     *   and create appropriate methods for it.
     */
    By storeUsername = By.xpath("//input[@placeholder='Username']");
    public void sendUserNameInUserNameField(String Username){
        sendTextToElement(storeUsername,Username);
    }
    //password in password field
    By addPasswordField = By.xpath("//input[@placeholder='Password']");
    public void sendPasswordInPasswordField(String password1){
        sendTextToElement(addPasswordField,password1);
    }
    //click on login button
    By clickOnLoginBtn = By.xpath("//button[normalize-space()='Login']");
    public void setClickOnLoginBtn(){
        clickOnElement(clickOnLoginBtn);
    }
    //HR for All logo
    By hrForAlllogo =By.xpath("(//img[@alt='orangehrm-logo'])[2]");
    public WebElement setHrForAllLogo(){
        WebElement logo = driver.findElement(hrForAlllogo);
        return logo;
    }

    //
    By loginPanelText =By.xpath("//div[@class='orangehrm-login-slot']");
    public WebElement getLoginPanelDisplayed(){
        WebElement loginPanel = driver.findElement(loginPanelText);
        return loginPanel;
    }

    //By dashboard = By.xpath("//h6[normalize-space()='Dashboard']");
    By profileLogo =By.xpath("//p[@class='oxd-userdropdown-name']");
    public void clickOnProfileLogo(){
        clickOnElement(profileLogo);}
    By logout = By.xpath("//a[normalize-space()='Logout']");
    public void mouseHoverOnAndClickOnLogout(){
        mouseHoverToElementAndClick(logout);
    }
}
