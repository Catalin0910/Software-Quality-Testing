package ro.ase.cts.state.main;

import ro.ase.cts.state.classes.Masa;
import ro.ase.cts.state.classes.StareLibera;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Masa masa = new Masa(1);
		
		masa.rezervaMasa();
		
		masa.rezervaMasa();
		masa.rezervaMasa();
		masa.ocupaMasa();
		
		masa.elibereazaMasa();

	}

}
