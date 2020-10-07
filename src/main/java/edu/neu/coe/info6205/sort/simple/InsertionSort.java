package edu.neu.coe.info6205.sort.simple;

import java.util.Arrays;

public class InsertionSort<X extends Comparable<X>> implements Sort<X> {

    /**
     * Constructor for InsertionSort
     *
     * @param helper an explicit instance of Helper to be used.
     */
    public InsertionSort(Helper<X> helper) {
        this.helper = helper;
    }

    public InsertionSort() {
        this(new Helper<>("InsertionSort"));
    }

    @Override
    public void sort(X[] xs, int from, int to) {
         for (int i = from; i <to; i++){
             int j = i;
             X x = xs[i];
             while (j>0 && helper.less(x ,xs[j-1])){
                 xs[j] = xs[j-1];
                 j--;
             }
             xs[j] = x;

                
             
         }                                
     }
         

    @Override
    public String toString() {
        return helper.toString();
    }

    @Override
    public Helper<X> getHelper() {
        return helper;
    }

    private final Helper<X> helper;
}
