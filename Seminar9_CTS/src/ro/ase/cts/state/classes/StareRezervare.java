package ro.ase.cts.state.classes;

public class StareRezervare implements StareMasa{

	@Override
	public void modificaStarea(Masa masa) {
		if(masa.getStareMasa() instanceof StareLibera) {
			masa.setStareMasa(this);
			System.out.println("Ati rezervat masa cu codul: " + masa.getNrMasa());
		}else {
			System.out.println("Nu se poate face rezervare!");
		}
		
	}

}
