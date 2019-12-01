package fr.dauphine.ja.amrouchekarim.model;

import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JFrame;

import fr.dauphine.ja.amrouchekarim.view.MyDisplay;

/**
 * 
 *
 */
public class Main {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Java Avance - Graphic Display");
		frame.setSize(new Dimension(1000, 1000));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		new Circle(new Point(100, 100), 200);
		World world = new World();
		MyDisplay d1 = new MyDisplay(world);
		frame.setContentPane(d1);
		d1.world.addObserver(d1);
		LigneBrise l = new LigneBrise(new Point(200, 100));
//		l.getL().add(new Point(500, 500));
		d1.world.add(new Circle(new Point(100, 100), 200));
		d1.world.add(l);
		
		

	}
}
