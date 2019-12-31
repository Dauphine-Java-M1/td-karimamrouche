package fr.dauphine.ja.amrouchekarim.iterables;

import java.util.AbstractList;
import java.util.Iterator;

public class Panel {

	public static Iterator<Integer> panel1(final int firstValue, final int lastValue) {

		return new Iterator<Integer>() {

			private int currentValue = firstValue;

			@Override
			public Integer next() {
				// TODO Auto-generated method stub
				return currentValue++;
			}

			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return currentValue <= lastValue;
			}
		};

	}

	public static Iterable<Integer> panel2(final int firstValue, final int lastValue) {
		return new Iterable<Integer>() {

			@Override
			public Iterator<Integer> iterator() {
				// TODO Auto-generated method stub
				return panel1(firstValue, lastValue);
			}
		};

	}

	public static AbstractList<Integer> panel(final int firstValue, final int lastValue) throws IllegalAccessException {
//		if (firstValue > lastValue)
//			throw new IllegalAccessException("not possible");
		return new AbstractList<Integer>() {

			@Override
			public Integer get(int index) {
				if (firstValue + index > lastValue)
					throw new IndexOutOfBoundsException();
				return firstValue + index;

			}

			@Override
			public int size() {

				return lastValue - firstValue + 1;
			}
		};
	}
}
