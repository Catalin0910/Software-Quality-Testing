package template.classes;

public abstract class SpectatorAbstract {
	
	public final void intrareSpectatoriPeStadion() {
		aseszareLaCoada();
		prezintaBilet();
		realizeazaControlCorporal();
		intraPeStadion();
		ocupaLoc();
	}
	
	public abstract void aseszareLaCoada();
	public abstract void prezintaBilet();
	public abstract void realizeazaControlCorporal();
	public abstract void intraPeStadion();
	public abstract void ocupaLoc();
}
