package fr.dauphine.ja.amrouchekarim.view;

import java.awt.Graphics;

import fr.dauphine.ja.amrouchekarim.model.LigneBrise;
import fr.dauphine.ja.amrouchekarim.model.Point;
import fr.dauphine.ja.amrouchekarim.model.Shape;

public class Drawable_line implements Drawable {
	public Shape shape;

	public Drawable_line(Shape shape) {
		this.shape = shape;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		LigneBrise ligne = (LigneBrise) this.shape;
		Point p = ligne.point;
		if (ligne.getL().size() == 0)
			g.drawLine(p.getX(), p.getY(), 2, 2);
		else {
			g.drawLine(p.getX(), p.getY(), ligne.getL().getFirst().getX(), ligne.getL().getFirst().getY());
			for (int i = 0; i < ligne.getL().size() - 1; i++) {
				g.drawLine(ligne.getL().get(i).getX(), ligne.getL().get(i).getY(), ligne.getL().get(i + 1).getX(),
						ligne.getL().get(i + 1).getY());
			}

		}
	}
}
