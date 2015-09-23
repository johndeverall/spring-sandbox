package nz.co.deverall.examples.spring;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(ConnectionSettings.class)
public class ApplicationConfiguration {
	
}
