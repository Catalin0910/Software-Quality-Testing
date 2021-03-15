package ro.ase.cts.classes;

import java.util.Arrays;

public abstract class Aplicant {
	protected String nume;
	protected String prenume;
	protected int varsta;
	protected int punctaj;
	protected int nrProiecte;
	protected String[] denumiriProiect;

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public void afiseazaStatus(Proiect proiect) {
		System.out.print("Aplicantul " + nume + " " + prenume);
		if (punctaj > proiect.getPragAdmitere()) {
			System.out.println(" a fost acceptat.");
		} else {
			System.out.println(" nu a fost acceptat.");
		}

	}

	public void setPunctaj(int punctaj) {
		this.punctaj = punctaj;
	}

	public Aplicant() {
		super();
	}

	public Aplicant(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.punctaj = punctaj;
		this.nrProiecte = nr_proiecte;
		this.denumiriProiect = denumireProiect;
	}

	public void setNrProiecte(int nrProiecte, String[] denumiriProiecte) {
		this.nrProiecte = nrProiecte;
		this.denumiriProiect = denumiriProiecte;
	}

	public abstract float getSumaFinantata();

	@Override
	public String toString() {
		return "Aplicantul " + nume + " " + prenume + "cu varsta " + varsta + ", a obtinut punctajul de " + punctaj
				+ " pentru proiectele " + nrProiecte + ", denumiriProiect=" + Arrays.toString(denumiriProiect);
	}

}
