package ro.ase.cts.builderv2.program;

import ro.ase.cts.builderv2.classes.Rezervare;
import ro.ase.cts.builderv2.classes.RezervareBuilderV2;

public class Program {

	public static void main(String[] args) {
		RezervareBuilderV2 builderV2 = new RezervareBuilderV2();
		builderV2.setBauturaRacoritare(true);
		builderV2.setHasScaunErgonomic(true);
		
		Rezervare rezervare = builderV2.setCodRezervare(15).build();
		Rezervare rezervare2 = builderV2.setCodRezervare(25).build();
		
		System.out.println(rezervare);
		System.out.println(rezervare2);
	}

}
