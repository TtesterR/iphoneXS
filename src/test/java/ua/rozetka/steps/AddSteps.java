package ua.rozetka.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import ua.rozetka.pages.RunPage;


public class AddSteps {

    @Steps
    RunPage iphone;

        @Given("the user is on the Rozetka home page")
            public void givenTheUserIsOnTheRozetkaHomePage(){
            iphone.isTheHomePage();
        }

        @When("the user looks up product \"([^\"]*)\"$")
            public void whenTheUserLooksUupProduct(String word){
                iphone.enterKeywords(word);
        }

        @And("^the user choose product \"([^\"]*)\"$")
            public void theUserChooseProduct(String arg0) {
                iphone.clickOnName();
        }

        /*@And("^the user choose product iphoneXS with Grey color$")
            public void theUserChooseProductIphoneXSWithGreyColor() {
                iphone.clickOnGray();
        }*/

        @And("^the user changes the color of the phone to Space gray$")
            public void theUserChangesTheColorOfThePhoneToSpaceGray() {
                iphone.clickOnSpaceGray();
        }

        @And("^The user adds the phone to the basket$")
            public void theUserAddsThePhoneToTheBasket() {
                iphone.clickOnBasket();
        }

        @Then("they should see product \"([^\"]*)\" to the basket$")
            public void thenTheyShouldSeeProduct (String definition){
                iphone.addToBasket(definition);
        }
}
