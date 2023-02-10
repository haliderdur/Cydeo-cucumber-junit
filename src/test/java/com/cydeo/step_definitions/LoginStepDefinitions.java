package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {

    @When("user enters valid librarian username")
    public void user_enters_valid_librarian_username() {
        System.out.println("user enters valid librarian username");
    }

    @When("user enters valid librarian password")
    public void user_enters_valid_librarian_password() {
        System.out.println("user enters valid librarian password");
    }

    @Then("user should see dashboard")
    public void user_should_see_dashboard() {
        System.out.println("user should see dashboard");
    }


    @When("user enters valid student username")
    public void user_enters_valid_student_username() {
        System.out.println("user enters valid student username");
    }

    @When("user enters valid student password")
    public void user_enters_valid_student_password() {
        System.out.println("user enters valid student password");
    }


    @When("user enters valid admin username")
    public void user_enters_valid_admin_username() {
        System.out.println("user enters valid admin username");
    }

    @When("user enters valid admin password")
    public void user_enters_valid_admin_password() {
        System.out.println("user enters valid admin password");
    }


    @Given("user is already on login page")
    public void userIsAlreadyOnLoginPage() {
        System.out.println("user is already on login page");
    }
}
