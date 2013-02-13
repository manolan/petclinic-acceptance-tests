package org.petclinic.acceptance.test.candidate.steps;

import org.petclinic.acceptance.test.page.FindOwnerPage;
import org.petclinic.acceptance.test.page.HomePage;

import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;


@SuppressWarnings("all")
public class BaseCandidateSteps extends ScenarioSteps {

	private static final long serialVersionUID = 1L;

	protected HomePage homePage;
	
	protected FindOwnerPage findOwnerPage;


	public BaseCandidateSteps(Pages pages) {
		super(pages);

		homePage = getPages().get(HomePage.class);
		findOwnerPage = getPages().get(FindOwnerPage.class);
		
	}

	public FindOwnerPage getFindOwnerPage() {
		return findOwnerPage;
	}
	

}
