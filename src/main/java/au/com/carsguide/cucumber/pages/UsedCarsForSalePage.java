package au.com.carsguide.cucumber.pages;

import au.com.carsguide.cucumber.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsedCarsForSalePage extends Utility {

    private static final Logger log = LogManager.getLogger(UsedCarsForSalePage.class.getName());

    public UsedCarsForSalePage(){
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Used Cars For Sale']")
    WebElement usedCarsForSaleTitleText;

    public String getTitleTextOfUsedCarsForSalePage(){
        log.info("get title text of used cars for sale page " + usedCarsForSaleTitleText.getText());
        return usedCarsForSaleTitleText.getText();
    }




}
