package simplefactory.program;

import simplefactory.classes.Categorie;
import simplefactory.classes.CategorieFactory;
import simplefactory.classes.CategoriiMedicamente;

public class Program {

	public static CategoriiMedicamente getTipCategorie() {
		return CategoriiMedicamente.durere;
	}

	public static void main(String[] args) {

		CategorieFactory categorieFactory = new CategorieFactory();
		Categorie durere = null;
		Categorie raceala = null;
		Categorie categorie;

		try {
			durere = categorieFactory.createCategorie(CategoriiMedicamente.durere, 40);
			raceala = categorieFactory.createCategorie(CategoriiMedicamente.raceala, 100);
			categorie = categorieFactory.createCategorie(getTipCategorie(), 15);
			
			System.out.println(durere.toString());
			System.out.println(raceala.toString());
			System.out.println(categorie.toString());
		} catch (Exception e) {

			e.printStackTrace();
		}

		
	}

}
