package ro.ase.cts.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.classes.Angajat;
import ro.ase.cts.classes.Aplicant;

public class AngajatReader extends AplicantReader {
	public AngajatReader(String fileName) {
		super(fileName);
	}

	public List<Aplicant> citesteAplicant() throws FileNotFoundException {
		Scanner input = new Scanner(new File(super.getFileName()));
		input.useDelimiter(",");
		List<Aplicant> aplicants = new ArrayList<Aplicant>();

		while (input.hasNext()) {
			Angajat angajat = new Angajat();
			super.readAplicant(input, angajat);
			angajat.setSalariu(input.nextInt());
			angajat.setOcupatie(input.next());
			aplicants.add(angajat);
		}
		input.close();
		return aplicants;
	}

}
