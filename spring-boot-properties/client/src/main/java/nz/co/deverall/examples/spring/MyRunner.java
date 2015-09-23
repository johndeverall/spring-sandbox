package nz.co.deverall.examples.spring;

import javax.inject.Inject;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import nz.co.deverall.examples.spring.MyService;

@Component
public class MyRunner implements CommandLineRunner {

	@Inject
	private MyService service;
	
	@Override
	public void run(String... args) throws Exception { 
		System.out.println(service.getConnectionSettings().getGreetingProperty());
	}
	
}
