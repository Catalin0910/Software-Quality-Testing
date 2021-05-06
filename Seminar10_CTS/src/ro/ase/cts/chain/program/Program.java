package ro.ase.cts.chain.program;

import ro.ase.cts.chain.Cont;
import ro.ase.cts.chain.ContCurent;
import ro.ase.cts.chain.ContIndisponibil;
import ro.ase.cts.chain.Credit;
import ro.ase.cts.chain.Economii;

public class Program {

	public static void main(String[] args) {
		Cont contCurent = new ContCurent(1600, "Catalin", null);
		
		Cont contEconomii = new Economii(2500, "Catalin",  null);
		
		Cont contCredit = new Credit(4000, "Catalin", null);
		
		Cont contIndisponibil = new ContIndisponibil("Catalin");
		
		contCurent.setSuccesor(contEconomii);
		contEconomii.setSuccesor(contCredit);
		contCredit.setSuccesor(contIndisponibil);
		
		contCurent.plateste(4500);

	}

}
