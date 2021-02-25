package classes;

public class Zebra extends Animal{
	
	private int linii;

	public Zebra(String name, float greutate, int linii) {
		super(name, greutate);
		this.linii = linii;
	}

	public Zebra(String name, float greutate) {
		super(name, greutate);
	}

	public int getLinii() {
		return linii;
	}

	public void setLinii(int linii) {
		this.linii = linii;
	}
	
	

}
