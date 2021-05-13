package observ.main;

import obser.classes.ClientAbonat;
import obser.classes.Sala;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClientAbonat clientMarcel = new ClientAbonat("Marcel");
		ClientAbonat clientIon = new ClientAbonat("Ion");
		ClientAbonat clientMirel = new ClientAbonat("Mirel");
		
		Sala sala = new Sala("Sala FCSB");
		sala.aboneazaClient(clientMirel);
		sala.aboneazaClient(clientIon);
		sala.aboneazaClient(clientMarcel);
		sala.anuntaMeci();
		sala.dezaboneazaClient(clientIon);
		sala.anuntaMeciVolei();
	}

}
