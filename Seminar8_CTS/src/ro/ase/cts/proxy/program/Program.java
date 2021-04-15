package ro.ase.cts.proxy.program;

import ro.ase.cts.proxy.classes.IRezervare;
import ro.ase.cts.proxy.classes.ProxyRezervare;
import ro.ase.cts.proxy.classes.Rezervare;

public class Program {

	public static void main(String[] args) {
		IRezervare rezervarePentruDouaPersoane = new Rezervare(3, 2);
		rezervarePentruDouaPersoane.anuntaRezervare();

		ProxyRezervare proxy = new ProxyRezervare((Rezervare) rezervarePentruDouaPersoane);
		proxy.anuntaRezervare();

		((Rezervare) rezervarePentruDouaPersoane).setNrPersoane(4);
		proxy.anuntaRezervare();

	}

}
