package edu.neu.coe.info6205.sort.simple;

import java.util.Arrays;

public class QuickSort<X extends Comparable<X>> implements Sort<X> {
    private final Helper<X> helper;

    /**
     * Constructor for InsertionSort
     *
     * @param helper an explicit instance of Helper to be used.
     */
    public QuickSort(Helper<X> helper) {
        this.helper = helper;
    }

    public QuickSort() {
        this(new Helper<>("QuickSort"));
    }
    
    public int partition(X[] a, int lo, int hi) {
        int i = lo;
        int j = hi+1;
        while (true) {
            while(helper.less(a[++i], a[lo]))
                if (i>hi) break;
            while(helper.less(a[lo], a[--j]))
                if (j<lo) break;
            if(i>=j) break;
            helper.swap(a, lo, hi , i, j);
            
        }
        helper.swap(a, lo, hi, lo, j);
        return j;
    }
        

    @Override
    public void sort(X[] xs, int from, int to) {
        if (from >=  to) return;
        int j = partition(xs, from, to);
        sort (xs, from, j-1);
        sort (xs, j+1, to);
//        Arrays.sort(xs, from, to);
//        for (int i = from; i < to; i++)
//            for (int j = i; j > 0; j--)
//                if (less(xs[j], xs[j - 1]))
//                    swap(xs, j, j - 1);
//                else break;
//
    }

    @Override
    public Helper<X> getHelper() {
        return helper;
    }
}

