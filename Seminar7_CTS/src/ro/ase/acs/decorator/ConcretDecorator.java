package ro.ase.acs.decorator;

public class ConcretDecorator extends AbastractDecorator {

	public ConcretDecorator(ICard card) {
		super(card);

	}

	@Override
	public void platesteContactless() {
		System.out.println("Detinatoru: " + super.getCard().getDetinatorCard() + " plateste contactless");

	}

}
