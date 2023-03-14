package dddfooddelivery.common;


import dddfooddelivery.CostumerApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { CostumerApplication.class })
public class CucumberSpingConfiguration {
    
}
