package ua.rozetka.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import ua.rozetka.ILocators;
import java.util.List;
import java.util.stream.Collectors;


public class CheckCategories extends PageObject implements ILocators {

    int waitTime = 3000;

    @Step
    public boolean logoIsDisplayed() {
        return $("//a[@class='header__logo']").isDisplayed();
    }

    @Step
    public void clickOnCategories() {
        $(CLICK_ON_CATEGORIES).click();
        waitFor(waitTime);
    }

    @Step
    public List<String> categoriesCheck() {
        return findAll(CHECK_CATEGORIES).stream().
                map(WebElementFacade::getText).
                collect(Collectors.toList());

    }
}
