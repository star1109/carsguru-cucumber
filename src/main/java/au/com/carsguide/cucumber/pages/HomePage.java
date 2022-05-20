package au.com.carsguide.cucumber.pages;

import au.com.carsguide.cucumber.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='buy + sell']")
    WebElement buy_sellTab;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Search Cars']")
    WebElement searchCarsLink;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Used']")
    WebElement usedLink;



    public void mouseHoverOnBuySellTab(){
        log.info("mouse hover on buy+sell tab"+ buy_sellTab.toString());
        mouseHoverToElement(buy_sellTab);
    }

    public void clickOnSearchCarsLink(){
        log.info("clicking on search cars link "+ searchCarsLink.toString());
        clickOnElement(searchCarsLink);
    }

    public void clickOnUsedLink(){
        log.info("clicking on used link "+ usedLink.toString());
        clickOnElement(usedLink);
    }


}
