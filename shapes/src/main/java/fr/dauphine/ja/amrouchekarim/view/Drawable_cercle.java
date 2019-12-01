package fr.dauphine.ja.amrouchekarim.view;

import java.awt.Graphics;

import fr.dauphine.ja.amrouchekarim.model.Circle;
import fr.dauphine.ja.amrouchekarim.model.Shape;


public class Drawable_cercle implements Drawable{
	public Shape shape;
	public Drawable_cercle(Shape shape) {
		this.shape = shape;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		Circle circle = (Circle) this.shape;
		g.drawOval(circle.getPoint().getX(), circle.getPoint().getY(), circle.getRayon(), circle.getRayon());
	}

	
}
