package ua.rozetka;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/AddProductToTheBasket.feature")
public class DefinitionTestSuite {}

//a[contains(text(),'Apple iPhone Xs 256GB Space Gray (MT9H2)')]