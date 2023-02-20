package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class GoogleStepDefinitions {

    GoogleSearchPage googleSearchKid = new GoogleSearchPage();

    @When("user types apple and clicks enter")
    public void user_types_and_clicks_enter2() {
        googleSearchKid.searchBox.sendKeys("apple" + Keys.ENTER);

    }

    @When("user types {string} and clicks enter")
    public void user_types_and_clicks_enter(String searchKeyword) {
        googleSearchKid.searchBox.sendKeys(searchKeyword + Keys.ENTER);
    }

    @Then("user sees {string} in the title")
    public void user_sees_in_the_title(String searchKeyword) {
        String expectedTitle = searchKeyword + " - Google Search";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals("Title is not as expected!", expectedTitle, actualTitle);
    }

    @Then("user sees apple in the title")
    public void user_sees_apple_in_the_title() {
        String expectedTitle = "apple - Google Search";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals("Title is not as expected!", expectedTitle, actualTitle);
    }

    @When("user is on the Google search page")
    public void user_is_on_the_google_search_page() {

        Driver.getDriver().get("https://www.google.com");
    }

    @Then("user should see the title is Google")
    public void user_should_see_the_title_is_google() {

        String expectedTitle = "Google";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);

    }

    @And("user accepts cookies")
    public void user_accepts_cookies() {
        googleSearchKid.acceptCookiesButton.click();

    }

}
