package obser.classes;

public class ClientAbonat implements Observer {
	private String numeClient;
	
	

	public ClientAbonat(String numeClient) {
		super();
		this.numeClient = numeClient;
	}



	@Override
	public void receptionareMesaj(String mesaj) {
	System.out.println("Clientul " + numeClient + " a primit un mesaj de la" + mesaj);
		
	}

}
