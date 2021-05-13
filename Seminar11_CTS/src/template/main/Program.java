package template.main;

import template.classes.Spectator;
import template.classes.SpectatorPeluza;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Spectator spectator = new Spectator();
		spectator.intrareSpectatoriPeStadion();
		
		System.out.println();
		
		SpectatorPeluza spectatorPeluza = new SpectatorPeluza("Mirel");
		spectatorPeluza.intrareSpectatoriPeStadion();
	}

}
