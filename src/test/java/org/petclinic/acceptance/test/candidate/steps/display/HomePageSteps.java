package org.petclinic.acceptance.test.candidate.steps.display;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;

import org.petclinic.acceptance.test.candidate.steps.BaseCandidateSteps;


public class HomePageSteps extends BaseCandidateSteps {

	private static final long serialVersionUID = 1L;

	public HomePageSteps(Pages pages) {
		super(pages);
	}

	@Step
	public void opensHomePage() {
		homePage.openHomePage();
	}

	@Step 
	public void clicksFindOwner(){
		homePage.clickFindOwnerLink();
	}
	
}
