package nz.co.deverall.examples.spring;

import org.springframework.stereotype.Service;
import javax.inject.Inject;

@Service
public class MyService {

	@Inject
	private ConnectionSettings connection;

	public ConnectionSettings getConnectionSettings() {
		return connection;
	}

	public void setConnection(ConnectionSettings connection) {
		this.connection = connection;
	}
	
}
