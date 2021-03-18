package ro.ase.acs.main;

import ro.ase.acs.lazy.ClinicaVeterinaraLazy;
import ro.ase.cts.eager.ClinicaVeterninara;

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

	}

}
