package com.cydeo.step_definitions;

import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class WebTable_StepDef  {

    WebTableLoginPage webTableLoginPage = new WebTableLoginPage();

    @Given("user is on login page of webTable app")
    public void user_is_on_login_page_of_web_table_app() {
        String url = ConfigurationReader.getProperty("webTableURL");
        Driver.getDriver().get(url);
    }

    @When("user enters username {string}")
    public void user_enters_username(String username) {
        webTableLoginPage.inputUsername.sendKeys(username);

    }

    @When("user enters password {string}")
    public void user_enters_password(String password) {
        webTableLoginPage.inputPassword.sendKeys(password);

    }

    @When("user clicks login button")
    public void user_clicks_login_button() {
        webTableLoginPage.loginButton.click();

    }

    @Then("user should see URL contains orders")
    public void user_should_see_url_contains_orders() {
        BrowserUtils.verifyURLContains("orders");

    }

    @When("user enters username {string} password {string} and logins")
    public void user_enters_username_password_and_logins(String username, String password) {
        webTableLoginPage.login(username, password);

    }

    @When("User enters below credentials")
    public void user_enters_below_credentials(Map<String, String> credentials) {

        webTableLoginPage.inputUsername.sendKeys(credentials.get("username"));
        webTableLoginPage.inputPassword.sendKeys(credentials.get("password"));
        webTableLoginPage.loginButton.click();

        // webTableLoginPage.login(credentials.get("username"), credentials.get("password"));

    }


}
