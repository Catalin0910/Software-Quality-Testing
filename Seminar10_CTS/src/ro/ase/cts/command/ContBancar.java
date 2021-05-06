package ro.ase.cts.command;

public class ContBancar {
	private String detinator;
	private float suma;

	public ContBancar(String detinator) {
		super();
		this.detinator = detinator;
		this.suma = 0;
	}

	public void constituire(float suma) {

		System.out.println("Contul a fost constituit");
		this.suma = suma;
	}

	public void retragere() {
		if (this.suma >= suma) {
			this.suma = this.suma - suma;
			System.out.println("O retragere cu suma: " + suma + " a fost realizata");
		} else {
			System.out.println("Nu aveti fonduri");
		}

	}

	public void depunere() {
		this.suma = this.suma + suma;
		System.out.println("Suma a fost depusa");
	}
}
