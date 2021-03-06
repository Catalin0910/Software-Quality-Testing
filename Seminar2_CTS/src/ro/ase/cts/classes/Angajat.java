package ro.ase.cts.classes;

public class Angajat extends Aplicant {
	private String ocupatie;
	private int salariu;
	private static float sumaFinanteare = 10;

	public void setOcupatie(String ocupatie) {
		this.ocupatie = ocupatie;
	}

	public void setSalariu(int salariu) {
		this.salariu = salariu;
	}

	public Angajat(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumire_Proiecte,
			int salariu, String ocupatie) {
		super(nume, prenume, varsta, punctaj, nr_proiecte, denumire_Proiecte);
		this.salariu = salariu;
		this.ocupatie = ocupatie;
	}

	public Angajat() {
		super();

	}

	@Override
	public String toString() {
		return "Angajat: " + super.toString() + "Ocupatie=" + ocupatie + ", salariu=" + salariu;
	}

	public void afiseazaSumaFinantare() {
		System.out.println(
				"Angajatul " + getNume() + " " + getPrenume() + " primeste" + sumaFinanteare + " Euro/zi in proiect.");
	}

	@Override
	public float getSumaFinantata() {
		return sumaFinanteare;
	}

	public static float getSumaFinanteare() {
		return sumaFinanteare;
	}

	public static void setSumaFinanteare(float sumaFinanteare) {
		Angajat.sumaFinanteare = sumaFinanteare;
	}

}
