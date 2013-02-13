package org.petclinic.acceptance.test.scenario.steps;

import org.petclinic.acceptance.test.candidate.steps.display.FindOwnerSteps;
import org.petclinic.acceptance.test.candidate.steps.display.HomePageSteps;

import net.thucydides.core.annotations.Steps;



public class BaseScenarioSteps {

	@Steps
	protected HomePageSteps homePageSteps;

	@Steps
	protected FindOwnerSteps findOwnerSteps;
}