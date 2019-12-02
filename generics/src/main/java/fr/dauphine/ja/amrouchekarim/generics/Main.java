package fr.dauphine.ja.amrouchekarim.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 * 
 * @param <T>
 *
 */
public class Main<T> {

	public static void main(String[] args) {

		List l = Arrays.asList("colonel", "reyel");
		System.out.println(listLength(l));
	}

	private static <T extends Comparable<T>> T myMax(T x, T... y) {
		T max = x;
		for (int i = 0; i < y.length; i++) {
			if (max.compareTo(y[i]) < 0)
				max = y[i];
		}
		return max;
	}

	private static void print(List<?> list) {
		for (Object o : list)
			System.out.println(o);
	}

	private static <T extends CharSequence> void printSize(List<T> liste) {
		for (T t : liste)
			System.out.println(t.length());
	}

//	public static <T extends CharSequence> List listLength(List<T> list) {
//		ArrayList length = new ArrayList();
//		for (int i = 0; i < list.size(); i++) {
//			length.add(list.get(i).length());
//		}
//		return length;
//	}
	
	public static ArrayList listLength(List<? extends CharSequence> list) {
		ArrayList length = new ArrayList();
		for (int i = 0; i < list.size(); i++) {
			length.add(list.get(i).length());
		}
		return length;
	}
}
