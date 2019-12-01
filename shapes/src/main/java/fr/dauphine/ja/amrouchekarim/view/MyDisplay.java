package fr.dauphine.ja.amrouchekarim.view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JPanel;

import fr.dauphine.ja.amrouchekarim.model.Circle;
import fr.dauphine.ja.amrouchekarim.model.Point;
import fr.dauphine.ja.amrouchekarim.model.Shape;
import fr.dauphine.ja.amrouchekarim.model.World;

public class MyDisplay extends JPanel implements Observer {
	public World world;

	public MyDisplay(World world) {
		this.world = world;
	}

	@Override
	protected void paintComponent(Graphics g) {
		for (Shape shape : this.world.liste) {
			shape.drawer.draw(g);
		}
	}

	@Override
	public void update(Observable o, Object arg) {
		this.repaint();
	}
}
