package obser.classes;

public interface Subiect {
	void aboneazaClient(Observer observer);
	void trimiteMesaj(String mesaj);
	void dezaboneazaClient(Observer observer);
}
