package fr.dauphine.ja.amrouchekarim.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Hello world!
 * 
 * @param <T>
 *
 */
public class Main {

	public static void main(String[] args) {

		List<String> l1= Arrays.asList("C", "rc");
		List<StringBuilder> l2= Arrays.asList(new StringBuilder("a ma"), new StringBuilder("he!"));
		List<? extends CharSequence> r1=fusion(l1,l2);
		List<?> r2=fusion(l1,l2);
		List<Integer> l3 = Arrays.asList(1,2);
		List<Integer> l4 = Arrays.asList(10,20);
		List<Integer> r3 = fusion(l3,l4);
		List<?> r4 = fusion(l1,l3);

	}

	private static <T extends Comparable<T>> T myMax(T x, T... y) {
		T max = x;
		for (int i = 0; i < y.length; i++) {
			if (max.compareTo(y[i]) < 0)
				max = y[i];s
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

	public static <T> List<T> fusion(List<? extends T> liste1, List<? extends T> liste2 ){
		List<T>list = new ArrayList<T>();
		if(liste1.size()!=liste2.size() || liste1.isEmpty())
			return Collections.<T>emptyList();
		else {
			Iterator<? extends T> it1 = liste1.iterator();
			Iterator<? extends T> it2 = liste1.iterator();
			while (it2.hasNext() || it1.hasNext()) {
				list.add(it1.next());
				list.add(it2.next());
				}
			}
		return list;
	}
}