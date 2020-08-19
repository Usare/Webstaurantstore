package com.webstaurantstore.pages;

import com.webstaurantstore.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Lastpage {
    @FindBy(xpath="//button[contains(text(),'9')]")
    public WebElement lastpage;
    @FindBy(xpath="//div[60]//div[4]//form[1]//div[1]//div[1]//input[2]")
    public WebElement lastitem;
    @FindBy(xpath="//*[@id='cartItemCountSpan']")
    public WebElement cartbutton;
    @FindBy(xpath="//span[@id='cartItemCountSpan']")
    public WebElement cartItem;
    @FindBy(xpath="//a[@class='emptyCartButton btn btn-mini btn-ui pull-right']")
    public WebElement emptyCart;
    @FindBy(xpath="//button[@class='btn btn-primary']")
    public WebElement emptyCartFinal;
    @FindBy(xpath="//p[contains(text(),'Your cart is empty.')]")
    public WebElement cartIsEmpty;

    public Lastpage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

}
