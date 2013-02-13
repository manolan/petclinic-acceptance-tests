package org.petclinic.acceptance.test.scenario.steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class ApplicationLoadingSteps extends BaseScenarioSteps {

	@Given("the home page is loaded")
	public void tellerWishingToUseShopWalletWith() {
		homePageSteps.opensHomePage();
	}

	@When("find pet owner is clicked")
	public void openingShopWalletIn() {
		homePageSteps.clicksFindOwner();
	}

	@Then("the pet owner page should be displayed")
	public void verifyingHomePageIsDisplayedProperly() {
		assertThat(findOwnerSteps.pageIsLoaded(), is(true));
	}

	@Given("the find owner page is loaded")
	public void theFindOwnerPageIsLoaded(){
		homePageSteps.opensHomePage();
		homePageSteps.clicksFindOwner();
	}
	
	@When("the find owners button is clicked")
	public void theFindOwnersButtonIsClick(){
		findOwnerSteps.theFindOwnerButtonIsClicked();
	}
	
	@Then("all the owners should be displayed")
	public void allTheOwnersShouldBeDisplayed(){
		assertThat(findOwnerSteps.allTheOwnersShouldBeDisplayed(), is(true));
	}
	
	@Given("all the owners are being displayed")
	public void allTheOwnersAreBeingDisplayed(){
		homePageSteps.opensHomePage();
		homePageSteps.clicksFindOwner();
		findOwnerSteps.theFindOwnerButtonIsClicked();
	}
	
	@When("an owner link is clicked")
	public void anOwnerLinkIsClicked(){
		findOwnerSteps.anOwnerIsClicked();
	}
	
	@Then("the owner page should be displayed")
	public void theOwnerPageShouldBeDisplayed(){
		assertThat(findOwnerSteps.theOwnerPageShouldBeDisplayed(), is(true));
	}
	
}