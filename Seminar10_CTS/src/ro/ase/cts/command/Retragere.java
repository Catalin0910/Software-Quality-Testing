package ro.ase.cts.command;

public class Retragere extends Command {

	public Retragere(ContBancar cont, float suma) {
		super(cont, suma);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void executa() {
	cont.retragere();
		
	}

}
