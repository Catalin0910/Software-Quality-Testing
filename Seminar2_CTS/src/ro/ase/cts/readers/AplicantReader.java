package ro.ase.cts.readers;

import ro.ase.cts.classes.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;

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
}
