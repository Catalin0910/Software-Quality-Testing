package facade.main;

import facade.classes.FacadeInternare;
import facade.classes.Pacient;

public class Program {

	public static void main(String[] args) {
		Pacient p1 = new Pacient("Dani", false);
		Pacient p2 = new Pacient("Catalin", true);
		
		System.out.println(FacadeInternare.verificaPacient(p1));
		System.out.println(FacadeInternare.verificaPacient(p2));

	}

}
