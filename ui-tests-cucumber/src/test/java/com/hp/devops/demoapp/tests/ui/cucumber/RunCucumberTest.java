package com.hp.devops.demoapp.tests.ui.cucumber;

import com.hpe.alm.octane.OctaneCucumber;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(OctaneCucumber.class)
@CucumberOptions(features="src/test/resources")
public class RunCucumberTest {
}
