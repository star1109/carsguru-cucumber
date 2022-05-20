package au.com.carsguide.cucumber.steps;

import au.com.carsguide.cucumber.pages.NewAndUsedCarSearchPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class NewAndUsedCarSearchSteps {


    @Then("^I navigate to new and used car search page$")
    public void iNavigateToNewAndUsedCarSearchPage() {
        String expected = "New & Used Car Search - carsguide";
        String actual = new NewAndUsedCarSearchPage().getNewAndUsedCarSearchTitleText();
        Assert.assertEquals("NewAndUsedCarSearch page not displayed",expected,actual);
    }

    @And("^I select location \"([^\"]*)\"$")
    public void iSelectLocation(String location) {
       new NewAndUsedCarSearchPage().setSelectLocation(location);
    }


    @And("^I select make \"([^\"]*)\"$")
    public void iSelectMake(String make) {
       new NewAndUsedCarSearchPage().setSelectMake(make);
    }

    @And("^I select model \"([^\"]*)\"$")
    public void iSelectModel(String model) {
        new NewAndUsedCarSearchPage().setSelectModel(model);
    }

    @And("^I select price \"([^\"]*)\"$")
    public void iSelectPrice(String price){
        new NewAndUsedCarSearchPage().setSelectPrice(price);
    }

    @And("^I click on Find My Next Car tab$")
    public void iClickOnFindMyNextCarTab() {
        new NewAndUsedCarSearchPage().clickOnFindMyNextCarTab();
    }

    @Then("^I should see the make \"([^\"]*)\" in results$")
    public void iShouldSeeTheMakeInResults(String make){
        String actual = new NewAndUsedCarSearchPage().getSearchTextFromProduct();
        Assert.assertTrue(make,actual.contains(make));
    }

}
