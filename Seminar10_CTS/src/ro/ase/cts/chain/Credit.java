package ro.ase.cts.chain;

public class Credit extends Cont {

	public Credit(float sold, String numeClient, Cont succesor) {
		super(sold, numeClient, succesor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void plateste(float suma) {
		if(super.getSold() >= suma) {
			System.out.println(super.getNumeClient() + " a realizat plata de: " + suma + " din contul de credit");
		}else {
			super.getSuccesor().plateste(suma);
		}
		
	}

}
