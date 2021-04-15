package ro.ase.cts.flyweight.classes;

import java.util.HashMap;
import java.util.Map;

public class FabricaRezervari {

	private Map<String, Flyweight> clienti;

	public FabricaRezervari() {
		super();
		this.clienti = new HashMap<String, Flyweight>();
	}

	public Flyweight getClient(String email) {
		Flyweight client = clienti.get(email);
		if(client==null) {
			client = new Client("Mirel", "0753913545", "gherghita@gmail.com");
			clienti.put(email, client);
		}
		return client;
	}
	
}
