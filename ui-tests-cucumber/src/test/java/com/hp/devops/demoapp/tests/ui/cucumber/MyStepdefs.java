package com.hp.devops.demoapp.tests.ui.cucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyStepdefs {
    @Given("^precondition$")
    public void precondition() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new cucumber.api.PendingException();
    }

    @When("^I run a test$")
    public void iRunATest() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }



    @When("^second test$")
    public void secondTest() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(false);
    }
}
