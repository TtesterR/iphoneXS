package ua.rozetka.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import ua.rozetka.ILocators;

public class AddPhoneToBasket extends PageObject {

    int waitTime = 10000;

    @Step ("the user is on the Rozetka home page")
    public void isTheHomePage(){
       getDriver().get("https://rozetka.com.ua/");
    }

    @Step ("the user looks up product")
    public void enterKeywords(String keyword) {
        $(ILocators.SEARCH_FIELD).type(keyword);
    }

    @Step ("the user choose product")
    public void clickOnButton() {
        $(ILocators.SEARCH_CLICK).click();
    }

    @Step ("the user changes the color of the phone to Space gray")
    public void clickOnSpaceGray() {
        waitFor(waitTime);
        $(ILocators.CLICK_ON_SPACE_GRAY).click();
    }

    @Step ("the user adds the phone to the basket")
    public void clickOnBasket() {
        waitFor(waitTime);
        $(ILocators.CLICK_ON_BASKET).click();
    }

    @Step ("they should see product to the basket")
    public void addToBasket() {
        String nameWindow = $("//h2[@class='cart-header ng-star-inserted']").getText();
        Assert.assertEquals(nameWindow, "Вы добавили товар в корзину");

    }
}