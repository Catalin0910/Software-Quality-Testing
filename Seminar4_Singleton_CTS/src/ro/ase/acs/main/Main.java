package ro.ase.acs.main;

import ro.ase.acs.eager.ClinicaVeterninara;
import ro.ase.acs.lazy.ClinicaVeterinaraLazy;

public class Main {

	public static void main(String[] args) {
//		ClinicaVeterninara primaClinica = ClinicaVeterninara.getInstance();
//		ClinicaVeterninara aDouaClinica = ClinicaVeterninara.getInstance();
//		
//		System.out.println(primaClinica.toString());
//		System.out.println(aDouaClinica.toString());
//		
		
		ClinicaVeterinaraLazy primaClinica = ClinicaVeterinaraLazy.getInstance("Cutu", "Aleea domnilor", 20, 1231.3f);
		ClinicaVeterinaraLazy aDouaClinica = ClinicaVeterinaraLazy.getInstance("La Pisu", "Aleea pisicilor", 30, 4231.3f);
		
		System.out.println(primaClinica.toString());
		System.out.println(aDouaClinica.toString());
		
		primaClinica.setNume("Veterinar 1!");
		aDouaClinica.setNrDoctori(34);
		
		System.out.println(primaClinica.toString());
		System.out.println(aDouaClinica.toString());

	}

}
