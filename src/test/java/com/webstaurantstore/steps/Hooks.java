package com.webstaurantstore.steps;

import com.webstaurantstore.utils.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.time.LocalTime;

    public class Hooks {

        @Before
        public void setups() {
            System.out.println("Test started at " + LocalTime.now());

        }

        @After
        public void teardown() {

            System.out.println("Test finished at " + LocalTime.now());
            Driver.getDriver().quit();

        }
    }

