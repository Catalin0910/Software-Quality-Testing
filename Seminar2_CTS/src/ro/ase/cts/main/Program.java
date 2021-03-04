package ro.ase.cts.main;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.classes.Aplicant;
import ro.ase.cts.readers.AngajatReader;
import ro.ase.cts.readers.AplicantReader;
import ro.ase.cts.readers.ElevReader;

public class Program {

	public static List<Aplicant> citesteAplicanti(AplicantReader reader) throws NumberFormatException, FileNotFoundException {

		return reader.citesteAplicant();
	}

	public static void main(String[] args) {
		List<Aplicant> listaAplicanti;
		AngajatReader angajatReader = new AngajatReader("angajati.txt");

		try {
			//listaAplicanti = citesteAplicanti(angajatReader);
			listaAplicanti = citesteAplicanti(new ElevReader("elevi.txt"));
			for (Aplicant angajat : listaAplicanti)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
