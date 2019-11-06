package ua.rozetka.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import ua.rozetka.ILocators;
import java.util.List;
import java.util.stream.Collectors;

public class LogicAdd extends PageObject {

    int waitTime = 3000;

    @Step
    public void isTheHomePage(){
       getDriver().get("https://rozetka.com.ua/");
    }

    @Step
    public void enterKeywords(String keyword) {
        $(ILocators.SEARCH_FIELD).type(keyword);
    }

    @Step
    public void clickOnName() {
        $(ILocators.SEARCH_CLICK).click();
    }

    /*@Step
    public void clickOnGray() {
            $("//a[@href='https://rozetka.com.ua/66962847/p66962847/']").click();
    }*/

    @Step
    public void clickOnSpaceGray() {
        waitABit(waitTime);
        $(ILocators.CLICK_ON_SPACE_GRAY).click();
    }

    @Step
    public void clickOnBasket() {
        waitABit(waitTime);
        $(ILocators.CLICK_ON_BASKET).click();
    }

    @Step
    public List<String> addToBasket(String definition) {
        WebElementFacade definitionList = find(By.xpath("//div[@class='cart-content popup-content ng-star-inserted']"));
        return definitionList.findElements(By.xpath("//a[@class='purchase-title novisited']")).stream()
                .map(element -> element.getText() )
                .collect(Collectors.toList());
    }
}