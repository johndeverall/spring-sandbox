package nz.co.deverall.examples.spring;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.*;
import javax.inject.Inject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {MyService.class, ApplicationConfiguration.class})
@TestPropertySource(locations="classpath:test.properties")
public class ConfigTest {

	@Inject 
	private MyService service;
	
	@Test
	public void testConfig() { 
		assertThat(service.getConnectionSettings().getGreetingProperty(), is(equalTo("hello world")));
	}
}
