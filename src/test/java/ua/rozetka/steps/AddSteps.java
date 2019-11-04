package ua.rozetka.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import ua.rozetka.steps.serenity.UserSteps;


public class AddSteps {

    @Steps
    UserSteps iphone;

        @Given("the user is on the Rozetka home page")
            public void givenTheUserIsOnTheRozetkaHomePage(){
            iphone.is_the_home_page();
        }

        @When("the user looks up product \"([^\"]*)\"$")
            public void whenTheUserLooksUupProduct(String word){
                iphone.looks_for(word);
        }

        @And("^the user choose product \"([^\"]*)\"$")
            public void theUserChooseProduct(String arg0) {
                iphone.click_name();
        }

        @And("^the user choose product iphoneXS with Grey color$")
            public void theUserChooseProductIphoneXSWithGreyColor() {
                iphone.click_gray();
        }

        @And("^the user changes the color of the phone to Space gray$")
            public void theUserChangesTheColorOfThePhoneToSpaceGray() {
                iphone.click_space_gray();
        }

        @And("^The user adds the phone to the basket$")
            public void theUserAddsThePhoneToTheBasket() {
                iphone.click_basket();

        }

        @Then("they should see product \"([^\"]*)\" to the basket$")
            public void thenTheyShouldSeeProduct (String definition){
                iphone.add_to_basket(definition);
        }


}
