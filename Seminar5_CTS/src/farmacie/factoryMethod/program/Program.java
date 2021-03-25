package farmacie.factoryMethod.program;

import farmacie.factoryMethod.classes.Categorie;
import farmacie.factoryMethod.classes.FactoryBody;
import farmacie.factoryMethod.classes.FactoryCategorie;
import farmacie.factoryMethod.classes.FactoryDurere;
import farmacie.factoryMethod.classes.FactoryGripa;
import farmacie.factoryMethod.classes.FactoryRaceala;

public class Program {
	
	private static FactoryCategorie gettipFactory() {
		return new FactoryGripa();
		
	}
	
	private static void printeazaCategorie(FactoryCategorie categorieFactory, float pretDebaza) {
		Categorie categorie = categorieFactory.creareCategorie(pretDebaza);
		System.out.println(categorie);
	}

	public static void main(String[] args) {
		printeazaCategorie(new FactoryDurere(), 80);
		printeazaCategorie(new FactoryBody(), 90);
		printeazaCategorie(gettipFactory(), 100);
		printeazaCategorie(new FactoryRaceala(), 400);
	}

}
