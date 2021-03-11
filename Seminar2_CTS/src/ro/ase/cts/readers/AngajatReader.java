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
		// TODO Auto-generated constructor stub
	}

	public List<Aplicant> citesteAplicant() throws FileNotFoundException {
		Scanner input2 = new Scanner(new File(super.getFileName()));
		input2.useDelimiter(",");
		List<Aplicant> aplicants = new ArrayList<Aplicant>();

		while (input2.hasNext()) {
			Angajat angajat = new Angajat();
			super.readAplicant(input2, angajat);
			angajat.setSalariu(input2.nextInt());
			angajat.setOcupatie(input2.next());
			aplicants.add(angajat);
		}
		input2.close();
		return aplicants;
	}

}
