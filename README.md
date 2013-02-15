petclinic-acceptance-tests
==========================

Simple acceptance tests for SpringSource's petclinic

There are two JBehave stories which contain different scenarios, one of which is a smoke test.

By default both scenarios will run, which together effectively make up a full acceptance test. To run the smoke test scenario only, we will make use of Thucydides metadata on the stories.

To run all tests: 		mvn verify -Dwebdriver.base.url="URL"
To run only smoke tests:	mvn verify -Dmetafilter="+smoketest" -Dwebdriver.base.url="URL" 