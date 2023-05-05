package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By search = By.xpath("//body[1]/div[1]/div[1]/div[1]/aside[1]/nav[1]/div[2]/div[1]/div[1]/input[1]");
    public String isSearchBoxVisible(){
        return  getTextFromElement(search);
    }
    By admin = By.xpath("//span[normalize-space()='Admin']");
    public String isAdminOptionVisible(){
        return getTextFromElement(admin);
    }
    By PIM = By.xpath("//body[1]/div[1]/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]/span[1]");
    public String isPIMOptionVisible(){
        return getTextFromElement(PIM);
    }
    By dashboard = By.xpath("//body[1]/div[1]/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[8]/a[1]/span[1]");
    public String isDashboardOptionVisible(){
        return getTextFromElement(dashboard);
    }
    By leave = By.xpath("//body[1]/div[1]/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[3]/a[1]/span[1]");
    public String isLeaveOptionVisible(){
        return getTextFromElement(leave);
    }
}
