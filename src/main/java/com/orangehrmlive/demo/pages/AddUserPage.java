package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class AddUserPage extends Utility {
    /*AddUserPage - User Role Drop Down, Employee Name, Username, Status Drop Down, Password, Confirm Password,
  Save and Cancle Button Locators and it's actions*/
    By userRoleSelect =By.xpath("//div[contains(text(),'Admin')]");
    public void clickOnUserRoleDropdown(){
        clickOnElement(userRoleSelect);
    }
    By cancelButton =By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]");
    public void clickOnCancelButton(){
        clickOnElement(cancelButton);
    }
    By adminUserRole = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/span[1]");
    public void selectAdmin(){
        clickOnElement(adminUserRole);
    }
    By employeeNameField= By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]");
    public void sendEmployeeName(String empName){
        sendTextToElement(employeeNameField,empName);
    }
    By employeeDropdown = By.xpath("//div[@role='option']");
    public void clickOnEmployeeNameOption(){
        mouseHoverToElementAndClick(employeeDropdown);
    }
    By userName =By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[1]/div[2]/input[1]");
    public void sendUserName(String username){
        sendTextToElement(userName,username);
    }
    By selectStatus =By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]");
    public void selectStatus(){
        clickOnElement(selectStatus);
    }
    By disableStatus = By.xpath("//span[normalize-space()='Disabled']");
    public void selectDisableInStatusDropdown(){
        clickOnElement(disableStatus);
    }
    By password = By.xpath("(//input[@type='password'])[1]");
    public void sendPassword(String password1){
        sendTextToElement(password,password1);
    }
    By confirmPassword = By.xpath("(//input[@type='password'])[2]");
    public void sendConfirmPassword(String confimpassword){
        sendTextToElement(confirmPassword,confimpassword);
    }
    By saveButton = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[2]");
    public void clickOnSaveButton(){
        clickOnElement(saveButton);
    }

}
