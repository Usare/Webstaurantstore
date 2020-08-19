package com.webstaurantstore.steps;

import com.webstaurantstore.pages.Lastpage;
import com.webstaurantstore.pages.Mainpage;
import com.webstaurantstore.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class WebTestSteps {

    Mainpage main = new Mainpage();
    Lastpage lastp= new Lastpage();

    @Given("User navigates to webstaurantstore")
    public void user_navigates_to_webstaurantstore() {
        Driver.getDriver().get("https://www.webstaurantstore.com/");
    }

    @When("Search for stainless work table")
    public void search_for_stainless_work_table() {

        main.searchBox.sendKeys("stainless work table");
        main.searchButton.click();

    }

    @Then("Check the search result ensuring every product item has the word Table its title")
    public void check_the_search_result_ensuring_every_product_item_has_the_word_Table_its_title() {

        List<WebElement> list = Driver.getDriver().findElements(By.xpath("//div[@class=\"ag-item gtm-product\"]\n"));
        for (WebElement each : list) {
            Assert.assertTrue(each.getText().contains("Table"));
        }
    }

    @Then("Add the last of found items to Cart")
    public void add_the_last_of_found_items_to_Cart() throws InterruptedException {


        Thread.sleep(2000);

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        Thread.sleep(8000);

        js.executeScript("arguments[0].scrollIntoView(true)", lastp.lastpage);

        Thread.sleep(5000);

        lastp.lastpage.click();
        Thread.sleep(2000);
        lastp.lastitem.click();
        Thread.sleep(2000);

        String expected="1";
        String actual= lastp.cartItem.getText();
        Assert.assertEquals(actual, expected);

        Thread.sleep(4000);
    }

    @Then("Empty Cart")
    public void empty_Cart() throws InterruptedException {

        Thread.sleep(8000);

        lastp.cartbutton.click();

        Thread.sleep(8000);

        lastp.emptyCart.click();

        Thread.sleep(4000);

        lastp.emptyCartFinal.click();

        Thread.sleep(4000);

        String expected="Your cart is empty.";
        String actual= lastp.cartIsEmpty.getText();

        Assert.assertEquals(actual, expected);

    }

}
