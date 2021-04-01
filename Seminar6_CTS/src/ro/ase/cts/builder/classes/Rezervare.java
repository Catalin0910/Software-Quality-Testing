package ro.ase.cts.builder.classes;

public class Rezervare {
	private boolean hasMancare;
	private boolean hasMuzicaAmbientala;
	private boolean hasScaunErgonomic;
	private boolean bauturaRacoritare;
	private String genMuzica;
	private int codRezervare;
	
	public Rezervare(boolean hasMancare, boolean hasMuzicaAmbientala, boolean hasScaunErgonomic,
			boolean bauturaRacoritare, String genMuzica, int codRezervare) {
		super();
		this.hasMancare = hasMancare;
		this.hasMuzicaAmbientala = hasMuzicaAmbientala;
		this.hasScaunErgonomic = hasScaunErgonomic;
		this.bauturaRacoritare = bauturaRacoritare;
		this.genMuzica = genMuzica;
		this.codRezervare = codRezervare;
	}
	
	public Rezervare() {
		
	}

	public boolean isHasMancare() {
		return hasMancare;
	}

	public void setHasMancare(boolean hasMancare) {
		this.hasMancare = hasMancare;
	}

	public boolean isHasMuzicaAmbientala() {
		return hasMuzicaAmbientala;
	}

	public void setHasMuzicaAmbientala(boolean hasMuzicaAmbientala) {
		this.hasMuzicaAmbientala = hasMuzicaAmbientala;
	}

	public boolean isHasScaunErgonomic() {
		return hasScaunErgonomic;
	}

	public void setHasScaunErgonomic(boolean hasScaunErgonomic) {
		this.hasScaunErgonomic = hasScaunErgonomic;
	}

	public boolean isBauturaRacoritare() {
		return bauturaRacoritare;
	}

	public void setBauturaRacoritare(boolean bauturaRacoritare) {
		this.bauturaRacoritare = bauturaRacoritare;
	}

	public String getGenMuzica() {
		return genMuzica;
	}

	public void setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
	}

	public int getCodRezervare() {
		return codRezervare;
	}

	public void setCodRezervare(int codRezervare) {
		this.codRezervare = codRezervare;
	}

	@Override
	public String toString() {
		return "Rezervare [hasMancare=" + hasMancare + ", hasMuzicaAmbientala=" + hasMuzicaAmbientala
				+ ", hasScaunErgonomic=" + hasScaunErgonomic + ", bauturaRacoritare=" + bauturaRacoritare
				+ ", genMuzica=" + genMuzica + ", codRezervare=" + codRezervare + "]";
	}
	
	
	
}
