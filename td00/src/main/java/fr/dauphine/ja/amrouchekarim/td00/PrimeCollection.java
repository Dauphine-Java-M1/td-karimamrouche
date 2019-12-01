package fr.dauphine.ja.amrouchekarim.td00;

import java.util.ArrayList;
import java.util.Random;

/**
 * Hello world!
 *
 */

public class PrimeCollection {
	protected ArrayList<Integer> numbers;

	public PrimeCollection() {
		this.numbers = new ArrayList<Integer>();
	}

	public void initRandom(int n, int m) {
		Random random = new Random();
		for (int i = 0; i < n; i++) {
			this.numbers.add(random.nextInt(m));
		}
	}

	public boolean isPrime(Integer p) {
		boolean r = true;
		for (float x = 2; x < Math.sqrt(p); x++)
			if (p % x == 0)
				r = false;
		return r;
	}

	public void printPrimes() {
		for (Integer integer : numbers) {
			if (isPrime(integer))
				System.out.println(integer);
		}
	}

	public static void main(String[] args) {
		
		PrimeCollection p = new PrimeCollection();
		p.initRandom(100, 2000);
		p.printPrimes();

	}

}
