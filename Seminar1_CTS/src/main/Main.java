package main;

import classes.Giraffe;
import classes.Zebra;
import classes.Zoo;
import classes.Zookeeper;

public class Main {

	public static void main(String[] args) {
		
		Zookeeper zookeper = new Zookeeper("Marcel");
		Zoo zoo = new Zoo();
		zoo.setZookeeper(zookeper);
		
		Giraffe g1 = new Giraffe("Marcela", 400);
		Giraffe g2 = new Giraffe("Gigela", 500, 200);
		
		zoo.addAnimal(g1);
		zoo.addAnimal(g2);
		
		zoo.feedAnimals();
		
		Zebra z1 = new Zebra("Zebruta", 200);
		Zebra z2  = new Zebra("Zebruta 2", 300, 40);
		zoo.addAnimal(z1);
		zoo.addAnimal(z2);
		
		zoo.feedAnimals();
		
		
	}

}
