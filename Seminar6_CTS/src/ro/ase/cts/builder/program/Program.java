package ro.ase.cts.builder.program;

import ro.ase.cts.builder.classes.Rezervare;
import ro.ase.cts.builder.classes.RezervareBuilder;

public class Program {

	public static void main(String[] args) {
		
		Rezervare rezervare = new RezervareBuilder().setCodRezervare(2).setBauturaRacoritare(true).build();
		
		System.out.println(rezervare);
		
		Rezervare rezervare2 = new RezervareBuilder().setCodRezervare(3).setGenMuzica("jazz").setHasMuzicaAmbientala(true).build();
		System.out.println(rezervare2);
		
		Rezervare rezervare3 = new RezervareBuilder(5).setHasMancare(true).build();
		System.out.println(rezervare3);

	}

}
