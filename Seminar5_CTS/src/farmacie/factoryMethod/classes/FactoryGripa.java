package farmacie.factoryMethod.classes;

public class FactoryGripa implements FactoryCategorie{

	@Override
	public Categorie creareCategorie(float pretDeBaza) {

		return new Gripa(pretDeBaza);
	}

}
