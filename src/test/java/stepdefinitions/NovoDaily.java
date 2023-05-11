package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.NovoDaily_ProductPage;
import pages.NovoDaily_searchboxResults;
import pages.NovodailyHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.*;

public class NovoDaily {
    NovodailyHomePage homePage = new NovodailyHomePage();
    NovoDaily_searchboxResults searchboxResults = new NovoDaily_searchboxResults();
    NovoDaily_ProductPage productPage = new NovoDaily_ProductPage();

   String homepageHandle = null;

    @When("The User click on the NovoDaily font logo")
    public void the_user_click_on_the_novo_daily_font_logo() {
        homePage.logoOfNovodaily.click();
    }
    @When("verify that the logo of NovoDaily is displayed on the homepage")
    public void verify_that_the_logo_of_novo_daily_is_displayed_on_the_homepage() {
        Assert.assertTrue(homePage.logoOfNovodaily.isDisplayed());
    }
    @Then("close the browser")
    public void close_the_browser() {

    }

    @And("accept the cookie")
    public void acceptTheCookie() {
        homePage.cookie.click();
    }

    @Given("The user navigate to novoDaily website")
    public void theUserNavigateToNovoDailyWebsite() {
        Driver.getDriver().get(ConfigReader.getProperty("novoDailyUrl"));
        homepageHandle = Driver.getDriver().getWindowHandle();
    }

    @Then("wait for the homepage to load for {int} seconds")
    public void waitForTheHomepageToLoadForSeconds(int arg0) {
        ReusableMethods.waitFor(arg0);
    }
    @When("hovers over a Produkte menu")
    public void hovers_over_a_produkte_menu() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(homePage.ProductDropdowns).perform();
    }
    @When("hovers over each tab within the product menu until the {string} tab is visible")
    public void hovers_over_each_tab_within_the_product_menu_until_the_tab_is_visible(String string) {
        Actions actions = new Actions(Driver.getDriver());
        List produktArray = List.of("Zur Kategorie Produkte","Genanalysen",
                "Blutanalysen", "Nahrungsergänzungsmittel", "Abos", "Bundles");
        List<String>ProduktMenu = new ArrayList<>(produktArray);

        List deineZieleArray = List.of("Fitter werden", "Beweglichkeit", "Stress reduzieren", "Gesünder leben","Straffen","Abnehmen");

        List<String>deineZieleMenu = new ArrayList<>(deineZieleArray);

        HashMap<String,List<String>> ArrayCategiesValue = new HashMap<>();
        ArrayCategiesValue.put("Bundles",ProduktMenu);
        ArrayCategiesValue.put("Abnehmen",deineZieleMenu);

        Set<Map.Entry<String,List<String>>>entrySetMenu = ArrayCategiesValue.entrySet();

        HashMap<String,List<WebElement>> categiesValue = new HashMap<>();
        categiesValue.put("Bundles",homePage.ProduktSubOptions);
        categiesValue.put("Abnehmen",homePage.DeineZieleOptions);

        Set<Map.Entry<String,List<WebElement>>>entrySet = categiesValue.entrySet();

        for (var eachMenu : entrySetMenu) { // deineZieleMenu(ArrayList)
            if (eachMenu.getKey().equals(string)){
                for (int i = 0; i < eachMenu.getValue().size(); i++) {
                    for (var eachCategoriesValue: entrySet) {
                        if (eachCategoriesValue.getKey().equals(string)){// homePage.DeineZieleOptions
                            for (var each1: eachCategoriesValue.getValue()) {
                                if (each1.getText().equals(eachMenu.getValue().get(i))){
                                    actions.moveToElement(each1).perform();
                                    ReusableMethods.waitFor(2);
                                }
                            }
                        }
                    }

                }
            }
        }


//        for (int i = 0; i < ProduktMenu.size(); i++) {
//            for (var each: homePage.ProduktSubOptions) {
//                if (each.getText().equals(produktArray.get(i))){
//                    actions.moveToElement(each).perform();
//                    ReusableMethods.waitFor(2);
//                }
//            }
//        }
    }
    @Then("click on the {string} tab to open it in a separate tab")
    public void click_on_the_tab_to_open_it_in_a_separate_tab(String categorie) {

        HashMap<String,List<WebElement>> categiesValue = new HashMap<>();
        categiesValue.put("Abnehmen",homePage.DeineZieleOptions);
        categiesValue.put("Bundles",homePage.ProduktSubOptions);
        categiesValue.put("Stress reduzieren",homePage.DeineZieleOptions);



        Set<Map.Entry<String,List<WebElement>>>entrySet = categiesValue.entrySet();

        for (var each: entrySet) {
            if (each.getKey().equals(categorie)){
                for (var each1: each.getValue()) {
                    if (each1.getText().equals(categorie)){
                        String clickOnLinkTab = Keys.chord(Keys.COMMAND,Keys.ENTER);
                        each1.sendKeys(clickOnLinkTab);
                    }
                }
            }
        }

//        for (var each: homePage.ProduktSubOptions) {
//            if (each.getText().equals(categorie)){
//                String clickOnLinkTab = Keys.chord(Keys.COMMAND,Keys.ENTER);
//                each.sendKeys(clickOnLinkTab);
//            }
//        }
    }
    @Then("verify that the {string} titel is displayed on the new tab")
    public void verify_that_the_titel_is_displayed_on_the_new_tab(String text) {

        Set<String> handles = Driver.getDriver().getWindowHandles();

        for (var each:handles) {
            if (!each.equals(homepageHandle)){
                Driver.getDriver().switchTo().window(each);

            }
        }
        ReusableMethods.waitFor(3);



        String expectedResult = text;

        HashMap<String,WebElement> categiesValue = new HashMap<>();
        categiesValue.put("Abnehmen",homePage.abnehmenText);
        categiesValue.put("Bundles",homePage.bundlesText);

        Set<Map.Entry<String,WebElement>>entrySet = categiesValue.entrySet();

        for (var each : entrySet) {
            if (each.getKey().equals(text)){
                String actualResult = each.getValue().getText();

                Assert.assertEquals(expectedResult,actualResult);
            }
        }


//        String actualResult = homePage.bundlesText.getText();
//
//        Assert.assertEquals(expectedResult,actualResult);

    }

    @When("hovers over the Deine Ziele menu")
    public void hoversOverTheDeineZieleMenu() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(homePage.DeineZieleDropdown).perform();
    }

    @Then("scroll down til {string} navigate-link is visible")
    public void scrollDownTilNavigateLinkIsVisible(String arg0) {

        Set<String> handles = Driver.getDriver().getWindowHandles();

        for (var each:handles) {
            if (!each.equals(homepageHandle)){
                Driver.getDriver().switchTo().window(each);

            }
        }
        ReusableMethods.waitFor(3);

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        js.executeScript("arguments[0].scrollIntoView();", homePage.abnahmenLinkText);

    }

    @And("click on the {string} navigate-link")
    public void clickOnTheNavigateLink(String Link_Text) {
        for (var each: homePage.subtitelLink) {
            if (each.getText().equals(Link_Text)){
                each.click();
                ReusableMethods.waitFor(2);
            }
        }
    }

    @And("verify that the {string} font is displayed")
    public void verifyThatTheFontIsDisplayed(String arg0) {
        Assert.assertTrue(homePage.OutdoorYogaText.isDisplayed());
    }
    @And("verify that the {string}, {string}, logo of product are displayed")
    public void verifyThatTheLogoOfProductAreDisplayed(String price, String number) {
        String expectedPrice = price;
        String actualPrice = searchboxResults.priceOfProduct.getText();

        Assert.assertTrue(actualPrice.contains(expectedPrice));

        String expectedNumber = number;
        String actualNumber =  searchboxResults.numberOfProduct.getText();

        Assert.assertTrue(actualNumber.contains(expectedNumber));



    }


    @And("verify that {string} contains any of the words written in the search box")
    public void verifyThatContainsAnyOfTheWordsWrittenInTheSearchBox(String name) {
        String expectedName = name;
        String actualName = searchboxResults.nameOfProduct.getText();

       Assert.assertTrue(actualName.contains(expectedName));

    }

    @When("click on search box and type any {string}")
    public void clickOnSearchBoxAndTypeAny(String ProductName) {
        homePage.searchBox.sendKeys(ProductName);

    }
}
