package ro.ase.cts.chain;

public class ContIndisponibil extends Cont {

	public ContIndisponibil( String numeClient) {
		super(0, numeClient, null);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void plateste(float suma) {
		System.out.println("Nu mai sunt suficienti bani pentru a extrage suma de: " + suma);

	}

}
