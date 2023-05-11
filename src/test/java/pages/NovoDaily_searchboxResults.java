package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class NovoDaily_searchboxResults {
    public NovoDaily_searchboxResults() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "[class='col-auto search-suggest-product-price']")
    public WebElement priceOfProduct;

    @FindBy(css = "[class='col search-suggest-product-name']")
    public WebElement nameOfProduct;

    @FindBy(xpath = "//div[contains(@class,'-suggest-total-count')]")
    public WebElement numberOfProduct;

    @FindBy(css = "[class='search-suggest-product-image']")
    public WebElement logoOfProduct;
}
