package farmacie.factoryMethod.classes;

public class FactoryRaceala implements FactoryCategorie{

	@Override
	public Categorie creareCategorie(float pretDeBaza) {
		
		return new Raceala(pretDeBaza);
	}

}
