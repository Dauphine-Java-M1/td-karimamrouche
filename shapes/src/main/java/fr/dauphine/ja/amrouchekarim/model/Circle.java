package fr.dauphine.ja.amrouchekarim.model;

import fr.dauphine.ja.amrouchekarim.view.Drawable_cercle;

public class Circle extends Shape {

	public int rayon;

	public int getRayon() {
		return rayon;
	}

	public void setRayon(int rayon) {
		this.rayon = rayon;
	}

	public Circle(Point point, int rayon) {
		super(point);
		this.drawer = new Drawable_cercle(this);
		this.rayon = rayon;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "le point est " + this.getCenter() + " et le rayon est " + rayon + " et la surface est "
				+ this.surface();
	}

	public void translate(int px, int py) {
		this.getCenter().translate(px, py);
	}

	public double surface() {
		return Math.PI * Math.pow(this.rayon, 2);
	}

	@Override
	public boolean equals(Object obj) {
		Circle c = (Circle) obj;
		// TODO Auto-generated method stub
		return this.getCenter().equals(c.getCenter()) && this.rayon == c.rayon;
	}

}
