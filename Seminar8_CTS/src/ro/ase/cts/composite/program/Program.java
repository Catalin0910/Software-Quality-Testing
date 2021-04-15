package ro.ase.cts.composite.program;

import ro.ase.cts.composite.classes.IOptiuneMeniu;
import ro.ase.cts.composite.classes.Item;
import ro.ase.cts.composite.classes.Sectiune;

public class Program {

	public static void main(String[] args) {
		IOptiuneMeniu meniu = new Sectiune("Meniu restaurant");

		IOptiuneMeniu optiuneBauturi = new Sectiune("bauturi");
		IOptiuneMeniu optiuniDesert = new Sectiune("desert");

		IOptiuneMeniu itemApaMinerala = new Item("apa minerala");
		IOptiuneMeniu itemFrappe = new Item("frappe");
		IOptiuneMeniu itemPapanasi = new Item("papanasi");

		try {
			optiuneBauturi.adugaNod(itemFrappe);
			optiuneBauturi.adugaNod(itemApaMinerala);

			meniu.adugaNod(optiuneBauturi);
			meniu.adugaNod(optiuniDesert);
			optiuniDesert.adugaNod(itemPapanasi);

			meniu.descriere();

			optiuneBauturi.stergenod(itemFrappe);
			optiuniDesert.adugaNod(itemFrappe);
			meniu.adugaNod(optiuneBauturi);

			System.out.println("============");
			meniu.descriere();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
