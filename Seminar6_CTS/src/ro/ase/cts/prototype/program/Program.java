package ro.ase.cts.prototype.program;

import ro.ase.cts.prototype.classes.Bilet;
import ro.ase.cts.prototype.classes.Client;

public class Program {

	public static void main(String[] args) {

		Client client = new Client(100, "Gogu", 20);
		Client client2 = (Client) client.copiaza();
		
		System.out.println(client);
		System.out.println(client2.toString());
		
		Bilet bilet = new Bilet(0, "Romania", "Armenia", "31-03-2021");
		Bilet bilet2 =  (Bilet) bilet.copiaza();
		
		bilet2.setCod(31);
		
		Bilet bilet3 = (Bilet) bilet.copiaza();
		bilet3.setCod(17);
		
		System.out.println(bilet);
		System.out.println(bilet2);
		System.out.println(bilet3);
		
		
	}

}
