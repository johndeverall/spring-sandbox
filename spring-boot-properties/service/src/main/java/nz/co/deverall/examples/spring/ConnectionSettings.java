package nz.co.deverall.examples.spring;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "application")
public class ConnectionSettings {

	private String greetingProperty;
	
	public String getGreetingProperty() { 
		return this.greetingProperty;
	}
	
	public void setGreetingProperty(String greetingProperty) { 
		this.greetingProperty = greetingProperty;
	}
	
}
