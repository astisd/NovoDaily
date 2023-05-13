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

    @FindBy(xpath = "(//span[text()='Wissenswertes'])[1]")
    public WebElement WissenswertesDropdown;

    @FindBy(xpath = "(//span[text()='Ratgeber'])[1]")
    public WebElement RatgeberDropdown;


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

    @FindBy(css = "[class='navigation-flyout is-open']")
    public WebElement navigationPopupMenu;

    @FindBy(xpath = "//*[text()='Alle Produkte']")
    public WebElement alleProdukteText;

    @FindBy(xpath = "(//*[text()='Deine Ziele '])[2]")
    public WebElement deineZieleText;

    @FindBy(xpath = "(//*[text()='Wissenswert: Alles rund um Gesundheit'])[2]")
    public WebElement wissenswertText;

    @FindBy(xpath = "(//*[text()='Dein Novodaily Ratgeber'])[2]")
    public WebElement ratgeberText;

}
