package ro.ase.cts.classes;

public class Elev extends Aplicant {
	private int clasa;
	private String tutore;
	private static float sumaFinanteare = 30;


	public void setClasa(int i) {
		this.clasa = i;
	}


	public void setTutore(String tutore) {
		this.tutore = tutore;
	}

	@Override
	public String toString() {
		return "Elev: " + super.toString() + "Clasa=" + clasa + ", Tutore=" + tutore;
	}

	public Elev() {
		super();
	}

	public Elev(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect,
			int clasa, String tutore) {
		super(nume, prenume, varsta, punctaj, nr_proiecte, denumireProiect);
		this.clasa = clasa;
		this.tutore = tutore;
	}

	public void afiseazaSumaFinantare() {
		System.out.println("Angajatul " + getNume() + " " + getPrenume() + " primeste" + sumaFinanteare + " Euro/zi in proiect.");
	}

	@Override
	public float getSumaFinantata() {
		// TODO Auto-generated method stub
		return sumaFinanteare;
	}

	public static float getSumaFinanteare() {
		return sumaFinanteare;
	}

	public static void setSumaFinanteare(float sumaFinanteare) {
		Elev.sumaFinanteare = sumaFinanteare;
	}

}
