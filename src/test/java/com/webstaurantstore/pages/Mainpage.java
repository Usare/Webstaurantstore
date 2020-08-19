package com.webstaurantstore.pages;

import com.webstaurantstore.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mainpage {
    @FindBy(xpath="//input[@id='searchval']")
    public WebElement searchBox;
    @FindBy(xpath="//form[@id='searchForm']//button")
    public WebElement searchButton;
    @FindBy(xpath="//h1[contains(text(),'Search Results for:')]")
    public WebElement title;


    public Mainpage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }
}




