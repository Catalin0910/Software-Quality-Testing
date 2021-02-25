package main;

import classes.*;

public class Main {

	public static void main(String[] args) {
		
		Zookeeper zookeper = new Zookeeper("Marcel");
		Zoo zoo = new Zoo();
		zoo.setZookeeper(zookeper);
		
	}

}
