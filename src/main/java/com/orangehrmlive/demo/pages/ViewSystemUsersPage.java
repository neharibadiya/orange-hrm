package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ViewSystemUsersPage extends Utility {
    /*ViewSystemUsersPage - System Users Text, Username Field, User Roll dropDown, Employee Name Field,
  Status Drop Down, Search Button, Reset Button, Add Button and Delete Button locators and it's actions*/
    By systemUserText = By.xpath("//h5[normalize-space()='System Users']");
    public String getSystemUserText(){
        return getTextFromElement(systemUserText);
    }
    By employeeNameSystem = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/input[1]");
    public void sendEmployeeName(String empName){
        sendTextToElement(employeeNameSystem,empName);
    }
    By userNameSystem = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]");
    public void sendUserNameSystem(String username){
        sendTextToElement(userNameSystem,username);
    }
    By selectUserRoleSystem = By.xpath("(//div[@class='oxd-select-text-input'][normalize-space()='-- Select --'])[1]");
    public void clickOnSelectRoleSystemDropdown(){
        clickOnElement(selectUserRoleSystem);
    }
    By userRoleAdmin = By.xpath("(//span[contains(text(),'Admin')])[1]");
    public void clickOnAdminSystem(){
        clickOnElement(userRoleAdmin);
    }
    By statusSystem =By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]");
    public void clickOnStatusSystem(){
        clickOnElement(statusSystem);
    }
    By disableSystem = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[2]/div[3]/span[1]");
    public void clickOnDisableSystem(){
        clickOnElement(disableSystem);
    }
    By searchButton =By.xpath("//button[normalize-space()='Search']");
    public void clickOnSearchButton(){
        clickOnElement(searchButton);
    }
    By employeeDropdown = By.xpath("//div[@role='option']");
    public void clickOnEmployeeNameOption(){
        mouseHoverToElementAndClick(employeeDropdown);
    }
    By resetButton = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[2]/button[1]");
    public void clickOnResetButton(){
        clickOnElement(resetButton);
    }

}
