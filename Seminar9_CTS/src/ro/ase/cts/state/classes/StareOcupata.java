package ro.ase.cts.state.classes;

public class StareOcupata implements StareMasa {

	@Override
	public void modificaStarea(Masa masa) {
		if(!(masa.getStareMasa() instanceof StareOcupata)) {
			System.out.println("Masa a fost ocupata");
			masa.setStareMasa(this);
		}else {
			System.out.println("Masa este tot libera");
		}
		
	}

}
