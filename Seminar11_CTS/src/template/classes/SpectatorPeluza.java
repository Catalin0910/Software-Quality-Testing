package template.classes;

public class SpectatorPeluza  extends SpectatorAbstract{
	private String nume;
	
	
	
	public SpectatorPeluza(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void aseszareLaCoada() {
		System.out.println(nume + " se aseaza la coada");
		
	}

	@Override
	public void prezintaBilet() {
		System.out.println(nume + " prezinta biletul.");
		
	}

	@Override
	public void realizeazaControlCorporal() {
		System.out.println(nume + " ii s-a facut controlul corporal");
		
	}

	@Override
	public void intraPeStadion() {
		System.out.println(nume + " intra pe stadion");
		
	}

	@Override
	public void ocupaLoc() {
		System.out.println(nume + " a ocupat un loc");
		
	}

}
