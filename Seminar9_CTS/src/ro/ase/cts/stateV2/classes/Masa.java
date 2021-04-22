package ro.ase.cts.stateV2.classes;

public class Masa {
	private int nrMasa;
	private Stare stareMasa;
	
	public Masa(int nrMasa) {
		super();
		this.nrMasa = nrMasa;
		this.stareMasa = new StareLibera();
	}
	
	public void elibereazaMasa() {
		if(!(stareMasa instanceof StareLibera)) {
			System.out.println("Masa cu nr: " + nrMasa + " a fost eliberata");
			stareMasa = new StareLibera();
		}else {
			System.out.println("Masa cu nr " + nrMasa + " este deja libera");
		}
	}
	
	public void rezervaMasa() {
		if(stareMasa instanceof StareLibera) {
			System.out.println("Masa cu nr: " + nrMasa + " a fost rezervata");
			stareMasa = new StareRezervata();
		}else {
			System.out.println("Masa cu nr " + nrMasa + " este deja rezervata");
		}
	}
	
	public void ocupareMasa() {
		if(!(stareMasa instanceof StareOcupata)) {
			System.out.println("Masa cu nr: " + nrMasa + " a fost ocupata");
			stareMasa = new StareOcupata();
		}else {
			System.out.println("Masa nu poate fi ocupata");
		}
	}

}
