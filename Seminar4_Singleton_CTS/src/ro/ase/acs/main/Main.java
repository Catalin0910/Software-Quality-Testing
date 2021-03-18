package ro.ase.acs.main;

import ro.ase.acs.eager.ClinicaVeterninara;
import ro.ase.acs.lazy.ClinicaVeterinaraLazy;
import ro.ase.acs.threadsafe.ClubDeGolf;

public class Main {

	public static void main(String[] args) {
//		ClinicaVeterninara primaClinica = ClinicaVeterninara.getInstance();
//		ClinicaVeterninara aDouaClinica = ClinicaVeterninara.getInstance();
//		
//		System.out.println(primaClinica.toString());
//		System.out.println(aDouaClinica.toString());
//		
		
//		ClinicaVeterinaraLazy primaClinica = ClinicaVeterinaraLazy.getInstance("Cutu", "Aleea domnilor", 20, 1231.3f);
//		ClinicaVeterinaraLazy aDouaClinica = ClinicaVeterinaraLazy.getInstance("La Pisu", "Aleea pisicilor", 30, 4231.3f);
//		
//		System.out.println(primaClinica.toString());
//		System.out.println(aDouaClinica.toString());
//		
//		primaClinica.setNume("Veterinar 1!");
//		aDouaClinica.setNrDoctori(34);
//		
//		System.out.println(primaClinica.toString());
//		System.out.println(aDouaClinica.toString());
		
		ClubDeGolf primulClub = ClubDeGolf.getInstanta("Golf Master",30, 83123.4f);
		ClubDeGolf alDoileaClub = ClubDeGolf.getInstanta("Mini golf",10, 13123.4f);

		System.out.println(primulClub.toString());
		System.out.println(alDoileaClub.toString());
		
		primulClub.setNrPiste(15);
		alDoileaClub.setNumeClub("Masters");
		
		System.out.println(primulClub.toString());
		System.out.println(alDoileaClub.toString());
		
	}

}
