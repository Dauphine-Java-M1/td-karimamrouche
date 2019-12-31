	package fr.dauphine.ja.amrouchekarim.iterables;
	
	import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
	
	public class Mult {
		public static List<Integer> mult(List<Integer> l, int multiplicateur) {
	
			List<Integer> liste = new ArrayList<Integer>();
			for (int i : l)
				liste.add(i * multiplicateur);
			return l.subList(0, l.size() - 1);
		}
	
		public static List<Integer> mult1(final List<Integer> l, final int multiplicateur) {
			if(l instanceof RandomAccess)
			return new AbstractList<Integer>() {
	
				@Override
				public Integer get(int index) {
					// TODO Auto-generated method stub
					return l.get(index) * multiplicateur;
				}
	
				@Override
				public int size() {
					// TODO Auto-generated method stub
					return l.size();
				}
			};
			else
				return new AbstractSequentialList<Integer>() {

					@Override
					public ListIterator<Integer> listIterator(int index) {
						// TODO Auto-generated method stub
						return new ListIterator<Integer>() {

							ListIterator<Integer> li = l.listIterator();
							@Override
							public boolean hasNext() {
								// TODO Auto-generated method stub
								 return li.hasNext();
							}

							@Override
							public Integer next() {
								// TODO Auto-generated method stub
								return li.next()*multiplicateur;
							}

							@Override
							public boolean hasPrevious() {
								// TODO Auto-generated method stub
								return li.hasPrevious();
							}

							@Override
							public Integer previous() {
								// TODO Auto-generated method stub
								return li.previous()*multiplicateur;
							}

							@Override
							public int nextIndex() {
								// TODO Auto-generated method stub
								return li.nextIndex();
							}

							@Override
							public int previousIndex() {
								// TODO Auto-generated method stub
								return li.previousIndex();
							}

							@Override
							public void remove() {
								// TODO Auto-generated method stub
								li.remove();
							}

							@Override
							public void set(Integer e) {
								// TODO Auto-generated method stub
								li.set(e);
							}

							@Override
							public void add(Integer e) {
								// TODO Auto-generated method stub
								li.add(e);
							}
						};
					}

					@Override
					public int size() {
						// TODO Auto-generated method stub
						return l.size();
					}
				};
				
		}
		
		public static void main(String[] args) {
			ArrayList<Integer> al = new ArrayList<>();
			for (int i = 0; i < 1000000; i++) {
				al.add(i);
			}
			long t0 = System.nanoTime();
			List<Integer> ret = Mult.mult1(al, 2);
			long sum = 0;
			for (int val : ret) {
				sum += val / 2;
			}
			System.out.println((System.nanoTime() - t0));
			LinkedList<Integer> ll = new LinkedList<>();
			for (int i = 0; i < 1000000; i++) {
				ll.add(i);
			}
			t0 = System.nanoTime();
			sum = 0;
			ret = Mult.mult1(ll, 2);
			for (int val : ret) {
				sum += val / 2;
			}
			System.out.println((System.nanoTime() - t0));

		}
		
	}
