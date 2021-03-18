package ro.ase.cts.eager;

public class ClinicaVeterninara {

	private String nume;
	private String adresa;
	private int nrDoctori;
	private float buget;

	//la eager initialization instanta statica este initializata la momentul declararii
	private static final ClinicaVeterninara instanta = new ClinicaVeterninara();

	//constructor obligatoriu trebuie sa fie private
	private ClinicaVeterninara() {
		nume = "Mon ami";
		adresa = "Aleea politehnicii nr 4";
		nrDoctori = 10;
		buget = (float) 98761.12;
	}
	

	//functia statica publica care va returna instanta
	public static ClinicaVeterninara getInstance() {
		return instanta;
	}

	@Override
	public String toString() {
		return "ClinicaVeterninara [nume=" + nume + ", adresa=" + adresa + ", nrDoctori=" + nrDoctori + ", buget="
				+ buget + "]";
	}




}
