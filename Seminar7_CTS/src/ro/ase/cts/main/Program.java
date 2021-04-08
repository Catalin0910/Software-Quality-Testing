package ro.ase.cts.main;

import ro.ase.acs.adapter.AdapterClase;
import ro.ase.acs.adapter.AdapterCreditObj;
import ro.ase.acs.adapter.InterfataCredit;
import ro.ase.acs.adapter.Leasing;

public class Program {

	public static void oferaInfoCredit(InterfataCredit credit, String nume, float suma)
	{
		credit.acordaCredit(nume, suma);
	}
	
	public static void main(String[] args) {
		Leasing leasing = new Leasing();
		AdapterCreditObj adapter = new AdapterCreditObj(leasing);
		oferaInfoCredit(adapter, "Gogu", 245.50f);
		
		AdapterClase adapterClase = new AdapterClase();
		oferaInfoCredit(adapterClase, "Marcel", 412.12f);

	}

}
