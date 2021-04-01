package ro.ase.cts.builderv2.classes;

import ro.ase.cts.builderv2.classes.Rezervare;

public class RezervareBuilderV2 implements IBuilder {

	private boolean hasMancare;
	private boolean hasMuzicaAmbientala;
	private boolean hasScaunErgonomic;
	private boolean bauturaRacoritare;
	private String genMuzica;
	private int codRezervare;

	public RezervareBuilderV2() {
		super();
		this.hasMancare = false;
		this.hasMuzicaAmbientala = false;
		this.hasScaunErgonomic = false;
		this.bauturaRacoritare = false;
		this.genMuzica = "";
		this.codRezervare = 0;

	}
	
	public RezervareBuilderV2(int cod) {
		super();
		this.hasMancare = false;
		this.hasMuzicaAmbientala = false;
		this.hasScaunErgonomic = false;
		this.bauturaRacoritare = false;
		this.genMuzica = "";
		this.codRezervare = cod;

	}

	public RezervareBuilderV2 setCodRezervare(int codRezervare) {
		this.codRezervare = codRezervare;
		return this;
	}

	public RezervareBuilderV2 setHasMancare(boolean hasMancare) {
		this.hasMancare = hasMancare;
		return this;
	}

	public RezervareBuilderV2 setHasMuzicaAmbientala(boolean hasMuzicaAmbientala) {
		this.hasMuzicaAmbientala = hasMuzicaAmbientala;
		return this;
	}

	public RezervareBuilderV2 setHasScaunErgonomic(boolean hasScaunErgonomic) {
		this.hasScaunErgonomic = hasScaunErgonomic;
		return this;
	}

	public RezervareBuilderV2 setBauturaRacoritare(boolean bauturaRacoritare) {
		this.bauturaRacoritare = bauturaRacoritare;
		return this;
	}

	@Override
	public Rezervare build() {
		Rezervare rezervare = new Rezervare( hasMancare,  hasMuzicaAmbientala,  hasScaunErgonomic,
				 bauturaRacoritare,  genMuzica,  codRezervare);
		return rezervare;
	}

}
