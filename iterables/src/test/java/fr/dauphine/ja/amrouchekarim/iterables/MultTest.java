package fr.dauphine.ja.amrouchekarim.iterables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import org.junit.Assert;
import org.junit.Test;

public class MultTest {



    @Test
    public void mult() throws IllegalAccessException {
        List<Integer> range = Panel.panel(-7, 7);
        ArrayList<Integer> inverse = new ArrayList<>(range);
        Collections.reverse(inverse);
        Assert.assertEquals(inverse, Mult.mult(range, -1));
    }

    @Test
    public void mult2() {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i=1; i<=10000; i++) {
            int value = random.nextInt();
            list.add(value);
            list2.add(value * 3);
        }

        Assert.assertEquals(list2, Mult.mult(list, 3));
    }
    
    @Test
    public void mult3() {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<=10000; i++) {
            list.add(i);
        }
        
        List<Integer> view = Mult.mult(list, 2);
        Assert.assertEquals((Integer)10, view.get(5));
    }
    
    @Test
    public void mult3ll() {
        LinkedList<Integer> list = new LinkedList<>();
        for(int i=0; i<=10000; i++) {
            list.add(i);
        }
        
        List<Integer> view = Mult.mult(list, 2);
        Assert.assertEquals((Integer)10, view.get(5));
    }
    
    @Test
    public void mult4() {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<=10000; i++) {
            list.add(i);
        }
        
        List<Integer> view = Mult.mult(list, 2);
        Assert.assertEquals((Integer)10, view.listIterator(5).next());
    }
    
    @Test
    public void mult4ll() {
        LinkedList<Integer> list = new LinkedList<>();
        for(int i=0; i<=10000; i++) {
            list.add(i);
        }
        
        List<Integer> view = Mult.mult(list, 2);
        Assert.assertEquals((Integer)10, view.listIterator(5).next());
    }
    
    @Test
    public void mult5ll() {
        LinkedList<Integer> list = new LinkedList<>();
        for(int i=0; i<=10000; i++) {
            list.add(i);
        }
        
        List<Integer> view = Mult.mult(list, 2);
        Assert.assertEquals((Integer)8, view.listIterator(5).previous());
    }
    
    @Test
    public void mult5() {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<=10000; i++) {
            list.add(i);
        }
        
        List<Integer> view = Mult.mult(list, 2);
        Assert.assertEquals((Integer)8, view.listIterator(5).previous());
    }

    @Test(timeout=1000)
    public void quick() {
        LinkedList<Integer> list = new LinkedList<>();
        for(int i=1; i<=100000; i++) {
            list.add(i);
        }
        long sum = 0;
        for(int value: Mult.mult(list, 2)) {
            sum += value / 2;
        }
        Assert.assertEquals(100000L * (100001) / 2, sum);
    }

    @Test(timeout=1000)
    public void quick2() {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i<=100000; i++) {
            list.add(i);
        }
        long sum = 0;
        List<Integer> list2 = Mult.mult(list, 3);
        for(int i = 0; i< list2.size(); i++) {
            sum += list2.get(i) / 3;
        }
        Assert.assertEquals(100000L * (100001) / 2, sum);
    }

}
