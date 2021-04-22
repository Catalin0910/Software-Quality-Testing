package ro.ase.cts.strategy.main;

import ro.ase.cts.strategy.classes.Card;
import ro.ase.cts.strategy.classes.Cash;
import ro.ase.cts.strategy.classes.Client;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Client client= new Client("Gigel");
	        client.setModPlata(new Cash());

	        client.platesteNota(200);

	        
	        client.platesteNota(350);
	        client.platesteNota(250);

	}

}
