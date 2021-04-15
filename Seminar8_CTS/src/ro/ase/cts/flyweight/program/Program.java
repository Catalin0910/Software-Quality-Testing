package ro.ase.cts.flyweight.program;

import ro.ase.cts.flyweight.classes.FabricaRezervari;
import ro.ase.cts.flyweight.classes.Rezervare;

public class Program {

	public static void main(String[] args) {
	
		Rezervare rezervare1 =  new Rezervare(1, 3, "12:00");
		Rezervare rezervare2 = new Rezervare(3,  5, "14:00");
		
		FabricaRezervari fabrica = new FabricaRezervari();
		
		fabrica.getClient("mirel@gmail.com").afisareInformatii(rezervare1);
		fabrica.getClient("mirel@gmail.com").afisareInformatii(rezervare2);

	}

}
