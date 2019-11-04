package ua.rozetka.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@DefaultUrl("https://rozetka.com.ua/")
public class RunPage extends PageObject {

    @FindBy(name = "search")
    private WebElementFacade searchTerms;

    public void enter_keywords(String keyword) {
        searchTerms.type(keyword);
    }

    public void click_name() {
        $("//span[contains(text(),'xs')]").click();
    }

    public boolean click_gray() {
        try {
            $("//a[@href='https://rozetka.com.ua/66962847/p66962847/']").click();
        } catch (NoSuchElementException e) {
            return false;
        }
        return true;
    }

    public boolean click_space_gray() {
        try {
            $("//a[@href='https://rozetka.com.ua/139623059/p139623059/']").click();
        } catch (NoSuchElementException e) {
            return false;
        }
        return true;
    }

    public void click_basket() {
        $("//form[@class='ng-untouched ng-pristine ng-valid ng-star-inserted']").click();
    }

    public List<String> getDefinitions() {
        WebElementFacade definitionList = find(By.xpath("//div[@class='cart-content popup-content ng-star-inserted']"));
        return definitionList.findElements(By.xpath("//a[@class='purchase-title novisited']")).stream()
                .map(element -> element.getText() )
                .collect(Collectors.toList());
    }
}