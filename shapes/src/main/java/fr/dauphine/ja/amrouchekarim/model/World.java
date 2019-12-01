package fr.dauphine.ja.amrouchekarim.model;

import java.util.LinkedList;
import java.util.Observable;

public class World extends Observable {
	public LinkedList<Shape> liste;

	public World() {
		this.liste = new LinkedList<Shape>();
	}

	public void add(Shape shape) {
		this.liste.add(shape);
		this.setChanged();
		this.notifyObservers();
	}

}
