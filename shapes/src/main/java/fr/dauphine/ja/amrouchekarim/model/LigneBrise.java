package fr.dauphine.ja.amrouchekarim.model;

import java.awt.Graphics;
import java.util.LinkedList;

import fr.dauphine.ja.amrouchekarim.view.Drawable_line;

public class LigneBrise extends Shape {
	private LinkedList<Point> l;

	public LigneBrise(Point point) {
		super(point);
		this.l = new LinkedList<>();
		this.drawer = new Drawable_line(this);
	}

	public void setL(LinkedList<Point> l) {
		this.l = l;
	}

	public LinkedList<Point> getL() {
		return l;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String r = "";
		for (Point p : this.l)
			r += p;
		return r;
	}

}
