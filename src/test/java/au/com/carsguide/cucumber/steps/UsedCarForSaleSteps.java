package au.com.carsguide.cucumber.steps;

import au.com.carsguide.cucumber.pages.UsedCarsForSalePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class UsedCarForSaleSteps {
    @Then("^I navigate to ‘Used Cars For Sale’ page$")
    public void iNavigateToUsedCarsForSalePage() {
        String expected = "Used Cars For Sale";
        String actual = new UsedCarsForSalePage().getTitleTextOfUsedCarsForSalePage();
        Assert.assertEquals("Used Cars For Sale Page not displayed ",expected,actual);
    }


}
