package ro.ase.cts.builder.classes;

public class RezervareBuilder implements IBuilder {
	
	private Rezervare rezervare;
	
	
	public RezervareBuilder() {
		rezervare = new Rezervare(false, false, false, false, "gen", 1);
	}
	
	public RezervareBuilder(int codRezervare) {
		rezervare = new Rezervare(false, false, false, false, "gen", codRezervare);
		
	}

	@Override
	public Rezervare build() {
		// TODO Auto-generated method stub
		return rezervare;
	}
	


	public RezervareBuilder setHasMancare(boolean hasMancare) {
		rezervare.setHasMancare(hasMancare);
		return this;
	}


	public RezervareBuilder setHasMuzicaAmbientala(boolean hasMuzicaAmbientala) {
		rezervare.setHasMuzicaAmbientala(hasMuzicaAmbientala);
		return this;
	}



	public RezervareBuilder setHasScaunErgonomic(boolean hasScaunErgonomic) {
		rezervare.setHasScaunErgonomic(hasScaunErgonomic);
		return this;
	}



	public RezervareBuilder setBauturaRacoritare(boolean bauturaRacoritare) {
		rezervare.setBauturaRacoritare(bauturaRacoritare);
		return this;
	}

	public RezervareBuilder setGenMuzica(String genMuzica) {
		rezervare.setGenMuzica(genMuzica);
		return this;
	}


	public RezervareBuilder setCodRezervare(int codRezervare) {
		rezervare.setCodRezervare(codRezervare);
		return this;
	}

}
