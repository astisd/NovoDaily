package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class NovoDaily_ProductPage {
    public NovoDaily_ProductPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//p[@class='delivery-information delivery-available']")
    public WebElement ProduktAavailableDeliveryTime;

    @FindBy(xpath = "//div[@class='product-detail-header-container']/h2")
    public WebElement ProduktName;

    @FindBy(xpath = "//div[@id='tns1-item0']/div/img")
    public WebElement pictureOfProduct;
}
