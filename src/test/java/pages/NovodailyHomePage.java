package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class NovodailyHomePage {
    public NovodailyHomePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "#uc-btn-accept-banner")
    public WebElement cookie;

    @FindBy(css = "#uc-btn-deny-banner")
    public WebElement cookieDeny;

    @FindBy(css = "[class='header-logo-picture']")
    public WebElement logoOfNovodaily;

    @FindBy(xpath = "(//span[text()='Produkte'])[1]")
    public WebElement ProductDropdowns;

    @FindBy(xpath = "(//span[text()='Deine Ziele'])[1]")
    public WebElement DeineZieleDropdown;


    @FindBy(xpath = "//div[@class='col-3 navigation-flyout-col']/a")
    public List<WebElement> ProduktSubOptions;

    @FindBy(xpath = "//div[@class='col-4 navigation-flyout-col']/a")
    public List<WebElement>DeineZieleOptions;

    @FindBy(xpath = "//h2[text()='Bundles']")
    public WebElement bundlesText;

    @FindBy(xpath = "(//*[text()='Abnehmen'])[4]")
    public WebElement abnehmenText;

    @FindBy(xpath = "(//a[contains(text(),'Abnehmen')])[1]")
    public WebElement abnahmenLinkText;

    @FindBy(xpath = "(//a[contains(text(),'Outdoor-Yoga')])[2]")
    public WebElement OutdoorYogaText;

    @FindBy(css = "[class='d-flex justify-content-between']")
    public List<WebElement> subtitelLink;

    @FindBy(xpath = "(//*[@name='search'])[2]")
    public WebElement  searchBox;
}
