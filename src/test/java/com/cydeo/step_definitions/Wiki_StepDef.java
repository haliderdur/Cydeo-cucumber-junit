package com.cydeo.step_definitions;

import com.cydeo.pages.WikipediaPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Wiki_StepDef {

    WikipediaPage wikiPageBoy = new WikipediaPage();

    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get("https://www.wikipedia.org/");
    }

    @When("User types {string} in the wiki search box")
    public void user_types_in_the_wiki_search_box(String searchKeyword) {
        wikiPageBoy.wikiSearchBox.sendKeys(searchKeyword);
    }

    @When("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        wikiPageBoy.searchButton.click();
    }

    @Then("User sees {string} is in the wiki title")
    public void user_sees_is_in_the_wiki_title(String searchKeyword) {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue("Title is not as expected!", actualTitle.contains(searchKeyword));
    }

    @Then("User sees {string} is in the main page")
    public void user_sees_is_in_the_main_page(String searchKeyword) {
        Assert.assertTrue(wikiPageBoy.mainHeader.isDisplayed());
        Assert.assertTrue(wikiPageBoy.mainHeader.getText().equals(searchKeyword));
    }
}
