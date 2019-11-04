package ua.rozetka.steps.serenity;

import net.thucydides.core.annotations.Step;
import ua.rozetka.pages.RunPage;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class UserSteps {

    protected RunPage runPage;

    @Step
    public void is_the_home_page(){
        runPage.open();
    }

    @Step
    public void looks_for (String keyword) {
        runPage.enter_keywords(keyword);
    }

    @Step
    public void click_name(){
        runPage.click_name();
    }

    @Step
    public void click_gray(){
        boolean e = runPage.click_gray();
    }

    @Step
    public void click_space_gray(){
        boolean e = runPage.click_space_gray();
    }

    @Step
    public void click_basket(){
        runPage.click_basket();
    }

    @Step
    public void add_to_basket(String button){
        assertThat(runPage.getDefinitions(), hasItem(containsString(button)));

    }
    /*@Step
    public void looks_for(String term){
        word(term);
        click_name();
        click_gray();
        click_space_gray();
        click_basket();
    }*/
}
