package fr.dauphine.ja.amrouchekarim.iterables;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class Main {
	public static void main(String[] args) throws IllegalAccessException {

		Iterator<Integer> it = Panel.panel1(1, 5);
		for (; it.hasNext();)
			System.out.println(it.next());

		List<Integer> l = Panel.panel(1, 3);
		for (int i : Panel.panel2(1, 4))
			System.out.println(i);
		System.out.println(l.get(2));
		
		
		
	}

}
