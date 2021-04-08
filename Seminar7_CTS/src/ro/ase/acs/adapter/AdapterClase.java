package ro.ase.acs.adapter;

public class AdapterClase extends Leasing implements InterfataCredit{

	public AdapterClase() {
		super();
	}

	@Override
	public void acordaCredit(String numeClient, float suma) {
		super.oferaLeasing(numeClient, suma);
		
	}

}
