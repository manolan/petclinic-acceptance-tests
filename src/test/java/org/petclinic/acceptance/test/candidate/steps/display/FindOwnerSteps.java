package org.petclinic.acceptance.test.candidate.steps.display;

import org.petclinic.acceptance.test.candidate.steps.BaseCandidateSteps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;


public class FindOwnerSteps extends BaseCandidateSteps{

	public FindOwnerSteps(Pages pages) {
		super(pages);
	}

	private static final long serialVersionUID = -698016446777782144L;
	
	@Step
	public boolean pageIsLoaded() {
		return findOwnerPage.hasPageLoaded();
	}
	
	@Step
	public void theFindOwnerButtonIsClicked(){
		findOwnerPage.clickFindOwnerButton();
	}

	public boolean allTheOwnersShouldBeDisplayed() {
		return findOwnerPage.allTheOwnersAreDisplayed();
		
	}

	public void anOwnerIsClicked() {
		findOwnerPage.clickOwner();
		
	}

	public boolean theOwnerPageShouldBeDisplayed() {
		return findOwnerPage.ownerPageIsDisplayed();
		
	}
	
}
