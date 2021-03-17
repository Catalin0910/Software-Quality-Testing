package ro.ase.cts.classes;

public class Student extends Aplicant {
	protected String facultate;
	protected int anDeStudiu;
	private static float sumaFinanteare = 20;


	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}


	public void setAnDeStudii(int an_studii) {
		this.anDeStudiu = an_studii;
	}

	public Student() {
		super();

	}

	public Student(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect,
			String facultate, int an_studii) {
		super(nume, prenume, varsta, punctaj, nr_proiecte, denumireProiect);
		this.facultate = facultate;
		this.anDeStudiu = an_studii;
	}

	@Override
	public String toString() {
		return "Student: " + super.toString() + "Facultate=" + facultate + ", An_studii=" + anDeStudiu;
	}

	public void afiseazaSumaFinantare() {
		System.out.println("Studentul " + getNume() + " " + getPrenume() + " primeste " + sumaFinanteare + " Euro/zi in proiect.");
	}

	@Override
	public float getSumaFinantata() {
		return sumaFinanteare;
	}

	public static float getSumaFinanteare() {
		return sumaFinanteare;
	}

	public static void setSumaFinanteare(float sumaFinanteare) {
		Student.sumaFinanteare = sumaFinanteare;
	}

}
