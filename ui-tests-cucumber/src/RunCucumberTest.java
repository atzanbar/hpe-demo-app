package com.hp.devops.demoapp.tests.ui.cucumber;

import com.hpe.alm.octane.OctaneCucumber;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(OctaneCucumber.class)
@CucumberOptions(plugin={"junit:junitResult.xml"},
    features="ui-tests-cucumber/resources")

public class RunCucumberTest{

}
