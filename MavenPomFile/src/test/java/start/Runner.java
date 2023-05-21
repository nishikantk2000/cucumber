package start;



import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.TestNGCucumberRunner;


@CucumberOptions(
        features = "/MavenPomFile/feature/Features.feature",
        glue = "start_def",
        tags = "@Gmail_login",
        dryRun=true,
        plugin = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty",
               
        })
public class Runner<CucumberFeatureWrapper> {
	  private TestNGCucumberRunner testNGCucumberRunner;
	    
	    @BeforeClass(alwaysRun = true)
	    public void setUpClass() throws Exception {
	        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	    }
	 
	    @Test(description = "Runs Cucumber Feature", dataProvider = "features")
	    public void feature(CucumberFeatureWrapper cucumberFeature) {
	        testNGCucumberRunner.finish();
	    }
	 
	    @DataProvider
	    public String features() {
	        return testNGCucumberRunner.toString();
	    }
	 
	    @AfterClass(alwaysRun = true)
	    public void tearDownClass() throws Exception {
	        testNGCucumberRunner.finish();
	    }
	
	    
	   

}
