package com.epam.stepDefinitions;

import io.cucumber.java.en.*;

public class MyStepdefs {
    @Given("User launched the pixabay website")
    public void userLaunchedThePixabayWebsite() {
        System.out.println("step1");
    }

    @When("User entered correct credential")
    public void userEnteredCorrectCredential() {
        System.out.println("step2");
    }

    @Then("User is able to login to pixabay website")
    public void userIsAbleToLoginToPixabayWebsite() {
        System.out.println("step3");
    }

    @Given("User is loged in pixabay website")
    public void userIsLogedInPixabayWebsite() {
        System.out.println("step4");
    }

    @When("User clicked on logout button on home page")
    public void userClickedOnLogoutButtonOnHomePage() {
        System.out.println("step5");
    }

    @Then("User is successfully logout of the pixabay website")
    public void userIsSuccessfullyLogoutOfThePixabayWebsite() {
        System.out.println("step6");
    }

    @Given("User launched amazon website")
    public void userLaunchedAmazonWebsite() {
        System.out.println("user able to navigate to amazon website");
    }

    @When("User select item to buy")
    public void userSelectItemToBuy() {
        System.out.println("user selected the desired item");
    }

    @And("User added the item in cart")
    public void userAddedTheItemInCart() {
        System.out.println("user added the item to cart");
    }

    @And("User placed the order")
    public void userPlacedTheOrder() {
        System.out.println("user paid the amount & placed the order");
    }

    @Then("User will be able to see arrival date on place order page")
    public void userWillBeAbleToSeeArrivalDateOnPlaceOrderPage() {
        System.out.println("Tantaive arrival date is visible to user");
    }

    @But("user is also eligible to place duplicate order")
    public void userIsAlsoEligibleToPlaceDuplicateOrder() {
        System.out.println("user also able to place duplicate order");
    }
}
