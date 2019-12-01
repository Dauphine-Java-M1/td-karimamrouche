package fr.dauphine.ja.amrouchekarim.shapes;

import java.util.LinkedList;

import sun.security.action.GetLongAction;

public class LigneBrise {
	private LinkedList<Point> l;

	public LigneBrise(int taille) {
		this.l = new LinkedList<>();

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
