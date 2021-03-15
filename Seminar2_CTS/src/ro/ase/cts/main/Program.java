package ro.ase.cts.main;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.classes.Angajat;
import ro.ase.cts.classes.Aplicant;
import ro.ase.cts.classes.Proiect;
import ro.ase.cts.classes.Student;
import ro.ase.cts.readers.AplicantReader;
import ro.ase.cts.readers.ElevReader;
import ro.ase.cts.readers.StudentReader;

public class Program {

	public static List<Aplicant> citesteAplicanti(AplicantReader reader)
			throws NumberFormatException, FileNotFoundException {

		return reader.citesteAplicant();
	}

	public static void main(String[] args) {
		System.out.println("Suma de finantare este: " + Student.getSumaFinanteare());
		System.out.println("Suma de finantare este: " + Angajat.getSumaFinanteare());
		
		List<Aplicant> listaAplicanti;
		AplicantReader aplicantReader = new StudentReader("studenti.txt");
		try {
			listaAplicanti = citesteAplicanti(aplicantReader);
			listaAplicanti = citesteAplicanti(new ElevReader("elevi.txt"));
			Proiect poriect = new Proiect(80);
			for (Aplicant angajat : listaAplicanti) {
				System.out.println(angajat.toString());
				angajat.afiseazaStatus(poriect);
				System.out.println(angajat.getSumaFinantata());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
