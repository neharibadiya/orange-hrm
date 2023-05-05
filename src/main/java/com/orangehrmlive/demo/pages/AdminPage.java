package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class AdminPage extends Utility {
    /*AdminPage - UserManagement, Job, Organization Tabs Locators and it's actions */
    By admin = By.xpath("//span[normalize-space()='Admin']");
    public void clickOnAdminButton(){
        clickOnElement(admin);
    }
    By userManagementText = By.xpath("//h6[normalize-space()='User Management']");
    public String getUserManagementText(){
        return getTextFromElement(userManagementText);
    }
    By addButton = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");
    public void clickOnAddButton(){
        clickOnElement(addButton);
    }
    By addUserText = By.xpath("//h6[normalize-space()='Add User']");
    public String getAddUserText(){
        return getTextFromElement(addUserText);
    }
    By saveMessage =By.xpath("//div[@class='oxd-toast oxd-toast--success oxd-toast-container--toast']");
    public String verifySaveSuccessfully(){
        return getTextFromElement(saveMessage);
    }
    By recordSelectCheckbox =By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]/i[1]");
    public void clickCheckBoxToSelectRecord(){
        clickOnElement(recordSelectCheckbox);
    }
    By recordFoundText=By.xpath("//span[normalize-space()='(38) Records Found']");
    public String verifyRecordFound(){
        return getTextFromElement(recordFoundText);

    }
    By usernameInTheList =By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]");
    public String getUsernameInSearchList(){
        return getTextFromElement(usernameInTheList);
    }
    By yesDeleteButton = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']");
    public void clickOnYesDeleteButton(){
        clickOnElement(yesDeleteButton);

    }
    By deleteSuccessfullyText = By.xpath("//div[@class='oxd-toast oxd-toast--success oxd-toast-container--toast']");
    public String getDeleteSuccessfullyText() {
        return getTextFromElement(deleteSuccessfullyText);

    }
    By noRecordFoundText =By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/span[1]");
    public String getNoRecordFoundText(){
        return getTextFromElement(noRecordFoundText);

    }
}
