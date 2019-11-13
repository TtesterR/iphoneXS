package ua.rozetka.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import ua.rozetka.ILocators;
import java.util.List;
import java.util.stream.Collectors;


public class CheckCategories extends PageObject implements ILocators {

    int waitTime = 3000;
    private static By CHECK_CATEGORIES = By.xpath("//span[@class='menu-toggler__text']/descendant-or-self::*[@class='menu-categories_item']");

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
    public List<String> categoriesCheck(By by) {
        return findAll(by).stream().
                map(WebElementFacade::getText)
                .collect(Collectors.toList());
    }
}
