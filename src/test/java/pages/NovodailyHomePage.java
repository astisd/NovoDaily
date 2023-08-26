package pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.html.HTMLInputElement;
import utilities.Driver;

import java.util.List;

import static org.openqa.selenium.By.xpath;

public class NovodailyHomePage {

    public HTMLInputElement cookie;
    public WebElement navigationPopupMenu;


    public NovodailyHomePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = ("(//a[normalize-space()='Alle Cookies erlauben'])[1]"))
    public WebElement cookieAcceptButton;

    @FindBy(css = "#uc-btn-accept-banner")
    public WebElement accepToCookies;

    @FindBy(css = "#uc-btn-deny-banner")
    public WebElement cookieDeny;

    @FindBy(css = "[class='header-logo-picture']")
    public WebElement logoOfNovodaily;

    @FindBy(xpath = ("(//div[@class='main-navigation-link-text'])[1]"))
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

    @FindBy(xpath = ("(//span[normalize-space()='Bundles'])[1]"))
    public WebElement bundlesText;

    @FindBy(xpath = ("(//span[normalize-space()='Abnehmen'])[1]"))
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
    public WebElement navigationFlyout;

    @FindBy(xpath = "//*[text()='Alle Produkte']")
    public WebElement alleProdukteText;

    @FindBy(xpath = "(//*[text()='Deine Ziele '])[2]")
    public WebElement deineZieleText;

    @FindBy(xpath = "(//*[text()='Wissenswert: Alles rund um Gesundheit'])[2]")
    public WebElement wissenswertText;

    @FindBy(xpath = "(//*[text()='Dein Novodaily Ratgeber'])[2]")
    public WebElement ratgeberText;

// Bu kod parçası, acceptCookie() adında bir metod tanımlar.
// Bu metod, accepToCookies adında bir elemente tıklamaya çalışır.
// Eğer bu element bulunamazsa, "Cookie görüntülenmiyor" şeklinde bir mesajı ekrana yazdırır.
    public void acceptCookie() {
        try {
            accepToCookies.click();
        } catch (NoSuchElementException e) {
            System.out.println("Cookie is not displayed");
        }
    }
// Bu kod parçası, getCategoryTitleElement adında bir metod tanımlar.
// Bu metod, categoryName olarak aldığı bir giriş değeriyle bir XPath ifadesi oluşturur.
// Bu XPath ifadesi, categoryName değerini içeren bir span elementini bulmak için kullanılır.
// Ardından, Driver.getDriver().findElement metodunu kullanarak bu web elementini bulur ve onu döndürür.
    public WebElement getCategoryTitleElement(String categoryName) {
        String xpath = "//span[text()='" + categoryName + "']";
        return Driver.getDriver().findElement(xpath(xpath));
    }

    public WebElement getNavigationFlyoutElement(String categoryName) {
        String xpath = "//span[text()='" + categoryName + "']/ancestor::div[@class='main-navigation-link']/div[@class='navigation-flyout is-open']";
        return Driver.getDriver().findElement(xpath(xpath));
    }
}
