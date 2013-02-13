package org.petclinic.acceptance.test;

import net.thucydides.jbehave.ThucydidesJUnitStories;

import org.apache.log4j.Logger;
import org.jbehave.core.steps.ParameterControls;

public class PetClinicThucydidesTestSuite extends ThucydidesJUnitStories {

	private static final Logger LOGGER = Logger.getLogger(PetClinicThucydidesTestSuite.class);

	public PetClinicThucydidesTestSuite() {
		super();
	

		LOGGER.info("-------------------------------------------------------- IMPORTANT ------------------------------------------------------------------------------");
		LOGGER.info("|                                                                                                                                               |");
		LOGGER.info("|   When running from an IDE you MUST include the VM argument                                                                                   |");
		LOGGER.info("|   -javaagent:\"<path_to_your_local_maven_repo/org/springframework/spring-instrument/<spring.version>/spring-instrument-<spring.version>.jar\"   |");
		LOGGER.info("|   to support load-time weaving, which is required by the Spring @Configurable annotation.                                                     |");
		LOGGER.info("|                                                                                                                                               |");
		LOGGER.info("-------------------------------------------------------------------------------------------------------------------------------------------------\n");

		configuration().useParameterControls(new ParameterControls().useDelimiterNamedParameters(true));
	}
}