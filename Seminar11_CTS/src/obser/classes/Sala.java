package obser.classes;

import java.util.ArrayList;
import java.util.List;

public class Sala implements Subiect {
	
	private List<Observer> listaObserveri;
	private String numeSala;
	

	public Sala(String numeSala) {
		super();
		this.listaObserveri = new ArrayList<Observer>();
		this.numeSala = numeSala;
	}

	@Override
	public void aboneazaClient(Observer observer) {
		listaObserveri.add(observer);
		
	}

	@Override
	public void trimiteMesaj(String mesaj) {
		for(Observer observer : listaObserveri) {
			observer.receptionareMesaj(numeSala + " : "+mesaj);
		}
		
	}
	
	public void anuntaMeci() {
		trimiteMesaj("Urmeaza un meci de fotbal");
	}
	public void anuntaMeciVolei() {
		trimiteMesaj("Urmeaza un meci de volei");
	}

	@Override
	public void dezaboneazaClient(Observer observer) {
		listaObserveri.remove(observer);
		
	}

}
