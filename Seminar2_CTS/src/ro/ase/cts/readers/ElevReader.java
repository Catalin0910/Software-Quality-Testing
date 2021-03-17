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
		Scanner input = new Scanner(new File(super.getFileName()));
		input.useDelimiter(",|\n");
		List<Aplicant> aplicants = new ArrayList<Aplicant>();

		while (input.hasNext()) {
			Elev elev = new Elev();
			super.readAplicant(input, elev);

			elev.setClasa(input.nextInt());
			elev.setTutore(input.next());
			aplicants.add(elev);
		}

		input.close();
		return aplicants;
	}
}
