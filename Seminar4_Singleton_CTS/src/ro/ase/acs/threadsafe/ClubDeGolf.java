package ro.ase.acs.threadsafe;

public class ClubDeGolf {
	private String numeClub;
	private int nrPiste;
	private float sumaIncasari;

	private static ClubDeGolf instanta = null;

	private ClubDeGolf(String numeClub, int nrPiste, float sumaIncasari) {
		this.numeClub = numeClub;
		this.nrPiste = nrPiste;
		this.sumaIncasari = sumaIncasari;
	}

	public String getNumeClub() {
		return numeClub;
	}

	public void setNumeClub(String numeClub) {
		this.numeClub = numeClub;
	}

	public int getNrPiste() {
		return nrPiste;
	}

	public void setNrPiste(int nrPiste) {
		this.nrPiste = nrPiste;
	}

	public float getSumaIncasari() {
		return sumaIncasari;
	}

	public void setSumaIncasari(float sumaIncasari) {
		this.sumaIncasari = sumaIncasari;
	}

	@Override
	public String toString() {
		return "ClubDeGolf [numeClub=" + numeClub + ", nrPiste=" + nrPiste + ", sumaIncasari=" + sumaIncasari + "]";
	}

	public static synchronized ClubDeGolf getInstanta(String numeClub, int nrPiste, float sumaIncasari) {
		if (instanta == null) {
			instanta = new ClubDeGolf(numeClub, nrPiste, sumaIncasari);
		}
		return instanta;
	}

}
