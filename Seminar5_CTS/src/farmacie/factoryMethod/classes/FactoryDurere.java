package farmacie.factoryMethod.classes;

public class FactoryDurere implements FactoryCategorie{

	@Override
	public Categorie creareCategorie(float pretDeBaza) {
		// TODO Auto-generated method stub
		return new Durere(pretDeBaza);
	}

}
