package ro.ase.cts.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.classes.Aplicant;
import ro.ase.cts.classes.Elev;

public class ElevReader extends AplicantReader {
	public ElevReader(String fileName) {
		super(fileName);

	}

	public List<Aplicant> citesteAplicant() throws FileNotFoundException {
		Scanner input2 = new Scanner(new File(super.getFileName()));
		input2.useDelimiter(",|\n");
		List<Aplicant> aplicants = new ArrayList<Aplicant>();

		while (input2.hasNext()) {
			Elev elev = new Elev();
			super.readAplicant(input2, elev);

			elev.setClasa(input2.nextInt());
			elev.setTutore(input2.next());
			aplicants.add(elev);
		}

		input2.close();
		return aplicants;
	}
}
