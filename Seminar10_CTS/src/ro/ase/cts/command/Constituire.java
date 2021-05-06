package ro.ase.cts.command;

public class Constituire extends Command {



	public Constituire(ContBancar cont, float suma) {
		super(cont, suma);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void executa() {
		super.cont.constituire(suma);
		
	}

}
