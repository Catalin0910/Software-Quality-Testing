package ro.ase.cts.command.program;

import ro.ase.cts.command.Constituire;
import ro.ase.cts.command.ContBancar;
import ro.ase.cts.command.Depunere;
import ro.ase.cts.command.ManagerComenzi;
import ro.ase.cts.command.Retragere;

public class Main {

	public static void main(String[] args) {
		ManagerComenzi manager = new ManagerComenzi();
		manager.invoca(new Constituire(new ContBancar("Cebuc"), 500));
		manager.invoca(new Retragere(new ContBancar("Tuca"), 300));
		
		manager.executaComanda();
		
		manager.invoca(new Depunere(new ContBancar("Cupii"), 500));
		manager.executaComanda();
		manager.executaComanda();
	}

}
