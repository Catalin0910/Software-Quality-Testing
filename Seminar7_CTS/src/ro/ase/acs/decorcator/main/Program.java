package ro.ase.acs.decorcator.main;

import ro.ase.acs.decorator.AbastractDecorator;
import ro.ase.acs.decorator.Card;
import ro.ase.acs.decorator.ConcretDecorator;
import ro.ase.acs.decorator.ICard;

public class Program {

	public static void main(String[] args) {
		ICard card = new Card("Mirel");
		
		card.platesteFizic();
		card.platesteOnline();
		
		AbastractDecorator decorator = new ConcretDecorator(card);
		decorator.platesteContactless();
	}

}
