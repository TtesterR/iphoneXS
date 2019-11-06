package ua.rozetka.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import java.util.List;
import java.util.stream.Collectors;

public class RunPage extends PageObject {

    final int waitTime = 5000;

    @FindBy(name = "search")
    protected WebElementFacade searchTerms;

    @Step
    public void isTheHomePage(){
       getDriver().get("https://rozetka.com.ua/");
    }

    @Step
    public void enterKeywords(String keyword) {
        searchTerms.type(keyword);
    }

    @Step
    public void clickOnName() {
        $("//span[contains(text(),'xs')]").click();
    }

    @Step
    public void clickOnGray() {
        waitABit(waitTime);
            $("//a[@href='https://rozetka.com.ua/66962847/p66962847/']").click();
    }

    @Step
    public void clickOnSpaceGray() {
        waitABit(waitTime);
            $("//a[@href='https://rozetka.com.ua/139623059/p139623059/']").click();
    }

    @Step
    public void clickOnBasket() {
        waitABit(waitTime);
        $("//span[@class='btn-link btn-link-green detail-buy-btn']").click();
    }

    @Step
    public List<String> addToBasket(String definition) {
        WebElementFacade definitionList = find(By.xpath("//div[@class='cart-content popup-content ng-star-inserted']"));
        return definitionList.findElements(By.xpath("//a[@class='purchase-title novisited']")).stream()
                .map(element -> element.getText() )
                .collect(Collectors.toList());
    }
}