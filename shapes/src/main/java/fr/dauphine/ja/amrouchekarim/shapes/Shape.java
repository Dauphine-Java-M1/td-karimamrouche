package fr.dauphine.ja.amrouchekarim.shapes;

//import java.awt.Graphics;
import java.util.Observable;

//import view.Drawable;

public abstract class Shape {
	public Point point;
//	public Drawable drawer;

//	public abstract void draw(Graphics g);

	public Shape() {

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

	public Shape(Point point) {
		this.point = point;
	}

}
