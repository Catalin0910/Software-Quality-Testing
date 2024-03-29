package ro.ase.cts.readers;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.classes.Aplicant;
import java.util.Scanner;

public abstract class AplicantReader {
	private String fileName;

	public AplicantReader(String fileName) {
		super();
		this.fileName = fileName;
	}

	public String getFileName() {
		return fileName;
	}

	public abstract List<Aplicant> citesteAplicant() throws FileNotFoundException, NumberFormatException;

	public void readAplicant(Scanner input, Aplicant aplicant) {
		String nume = input.next();
		String prenume = input.next();
		int varsta = input.nextInt();
		int punctaj = input.nextInt();
		int numar = input.nextInt();
		String[] vect = new String[5];
		for (int i = 0; i < numar; i++)
			vect[i] = input.next();

		aplicant.setNume(nume);
		aplicant.setPrenume(prenume);
		aplicant.setVarsta(varsta);
		aplicant.setPunctaj(punctaj);
		aplicant.setNrProiecte(numar, vect);

	}
}
