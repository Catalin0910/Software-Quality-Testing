package ro.ase.cts.composite.classes;

public interface IOptiuneMeniu {
	void adugaNod(IOptiuneMeniu optiune) throws Exception;
	void stergenod(IOptiuneMeniu optiune) throws Exception;
	IOptiuneMeniu getNod(int index) throws Exception;
	void descriere();

}
