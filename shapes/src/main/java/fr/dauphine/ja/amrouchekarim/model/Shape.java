package fr.dauphine.ja.amrouchekarim.model;

import fr.dauphine.ja.amrouchekarim.view.Drawable;

public abstract class Shape {

	public Drawable drawer;

	public Point point;

	public Shape(Point point) {
		this.point = point;
	}

	public Point getCenter() {
		return this.point;
	}

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}

}
