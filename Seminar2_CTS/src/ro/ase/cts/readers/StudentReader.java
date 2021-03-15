package ro.ase.cts.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.classes.Angajat;
import ro.ase.cts.classes.Aplicant;
import ro.ase.cts.classes.Student;

public class StudentReader extends AplicantReader {

	public StudentReader(String fileName) {
		super(fileName);
		// TODO Auto-generated constructor stub
	}

	public List<Aplicant> citesteAplicant( ) throws FileNotFoundException, NumberFormatException {
		Scanner input = new Scanner(new File(super.getFileName()));
		input.useDelimiter(",|\n");
		List<Aplicant> aplicants = new ArrayList<Aplicant>();

		while (input.hasNext()) {
			Student student = new Student();
			super.readAplicant(input, student); 
			student.setAnDeStudii(input.nextInt());
			student.setFacultate((input.next()).toString());
			aplicants.add(student);
		}
		input.close();
		return aplicants;
	}
	
}
