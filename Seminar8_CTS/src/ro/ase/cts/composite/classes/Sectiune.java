package ro.ase.cts.composite.classes;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements IOptiuneMeniu {

	List<IOptiuneMeniu> lista;
	private String nume;

	public Sectiune(String nume) {
		lista = new ArrayList<IOptiuneMeniu>();
		this.nume = nume;
	}

	@Override
	public void adugaNod(IOptiuneMeniu optiune) {
		lista.add(optiune);

	}

	@Override
	public void stergenod(IOptiuneMeniu optiune) {
		lista.remove(optiune);

	}

	@Override
	public IOptiuneMeniu getNod(int index) {
		return lista.get(index);
	}

	@Override
	public void descriere() {
		System.out.println("Sectiunea " + nume);
		for (IOptiuneMeniu optiune : lista) {
			optiune.descriere();
		}

	}

}
