package ro.ase.cts.classes;

public class Proiect {
	private static int pragAdmitere;
	
	
	public Proiect(int pragAdmitere) {
		Proiect.pragAdmitere = pragAdmitere;
	}


	public static int getPragAdmitere() {
		return pragAdmitere;
	}


	public static void setPragAdmitere(int pragAdmitere) {
		Proiect.pragAdmitere = pragAdmitere;
	}
	
	
}
