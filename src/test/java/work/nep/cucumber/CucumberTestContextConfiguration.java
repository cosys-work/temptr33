package work.nep.cucumber;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;
import work.nep.Tr33T33App;

@CucumberContextConfiguration
@SpringBootTest(classes = Tr33T33App.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
