package farmacie.factoryMethod.classes;

public class FactoryBody implements FactoryCategorie {

	@Override
	public Categorie creareCategorie(float pretDeBaza) {
		return new Body(pretDeBaza);
	}

}
