package ro.ase.cts.state.classes;

public class StareLibera implements StareMasa {

	@Override
	public void modificaStarea(Masa masa) {
		if(!(masa.getStareMasa() instanceof StareLibera)){
			System.out.println("Masa cu nr: " + masa.getNrMasa() + " a fost eliberata");
			masa.setStareMasa(this);
		}else {
			System.out.println("Masa selectata este deja libera");
		}
		
	}

}
