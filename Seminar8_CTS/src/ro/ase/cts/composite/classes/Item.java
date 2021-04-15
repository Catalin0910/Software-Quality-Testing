package ro.ase.cts.composite.classes;

public class Item implements IOptiuneMeniu{

	private String name;
	
	
	
	public Item(String name) {
		super();
		this.name = name;
	}

	@Override
	public void adugaNod(IOptiuneMeniu optiune) throws Exception {
		throw new Exception("NU este implementata");
		
	}

	@Override
	public void stergenod(IOptiuneMeniu optiune)  {
		throw new IllegalArgumentException("NU este implementata");
		
	}

	@Override
	public IOptiuneMeniu getNod(int index) throws Exception  {
		throw new Exception("NU este implementata");
	}

	@Override
	public void descriere() {
		System.out.println("Item: " + name);		
	}

}
