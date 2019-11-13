package ua.rozetka.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import ua.rozetka.pages.AddPhoneToBasket;
import ua.rozetka.pages.CheckCategories;
import java.util.List;


public class AddSteps {

    @Steps
    AddPhoneToBasket iphone;
    @Steps
    CheckCategories checkCategories;

        @Given("the user is on the Rozetka home page")
            public void givenTheUserIsOnTheRozetkaHomePage(){
            iphone.isTheHomePage();
        }

        @When("the user looks up product \"([^\"]*)\"$")
            public void whenTheUserLooksUupProduct(String word){
                iphone.enterKeywords(word);
        }

        @And("^the user click on the button search$")
            public void theUserChooseProduct() {
                iphone.clickOnButton();
        }

        @And("^the user changes the color of the phone to Space gray$")
            public void theUserChangesTheColorOfThePhoneToSpaceGray() {
                iphone.clickOnSpaceGray();
        }

        @And("^The user adds the phone to the basket$")
            public void theUserAddsThePhoneToTheBasket() {
                iphone.clickOnBasket();
        }

        @Then("they should see product to the basket$")
            public void thenTheyShouldSeeProduct() {
                iphone.addToBasket();
        }

        @Then("^logo in header is displayed$")
            public void logoInHeaderIsDisplayed() {
                Assert.assertTrue("False", checkCategories.logoIsDisplayed());
        }

        @When("^the user click on the \"([^\"]*)\"$")
            public void theUserClickOnThe(String arg0) {
                checkCategories.clickOnCategories();
        }

        @Then("^user should see ad categories$")
        public void userShouldSeeAdCategories (List<String> getExpectedCategories) {
            Assert.assertEquals(getExpectedCategories, checkCategories.categoriesCheck());
        }
}
