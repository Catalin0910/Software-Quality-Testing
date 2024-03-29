package ro.ase.cts.state.classes;

public class Masa {

	private StareMasa stareMasa;
	private int nrMasa;
	
	public Masa(int nrMasa) {
		super();
		this.nrMasa = nrMasa;
		this.stareMasa = new StareLibera();
	}

	public StareMasa getStareMasa() {
		return stareMasa;
	}

	 void setStareMasa(StareMasa stareMasa) {
		this.stareMasa = stareMasa;
	}

	public int getNrMasa() {
		return nrMasa;
	}

	public void setNrMasa(int nrMasa) {
		this.nrMasa = nrMasa;
	}
	
	public void rezervaMasa() {
		modificaStareMasa(new StareRezervare());
	}
	
	public void ocupaMasa() {
		modificaStareMasa(new StareOcupata());
	}
	
	public void elibereazaMasa() {
		modificaStareMasa(new StareLibera());
	}
	
	public void modificaStareMasa(StareMasa stare) {
		stare.modificaStarea(this);
	}

}
