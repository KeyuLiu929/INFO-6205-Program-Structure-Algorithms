/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.coe.info6205.symbolTable;

/**
 *
 * @author Keyu Liu
 */
public class BSTMain {
    private static void addAll(BSTSimple<String, Integer> bst ){
         for (int i=0; i<1000000; i++) bst.put(Integer.toString(i), i);
    } 
    public static void main(String[] arg){
         BSTSimple<String, Integer> bst = new BSTSimple<>();
         addAll(bst);
         for (int x = 0; x < bst.size() ; x+=100000){
            long startTime=System.currentTimeMillis(); 
            for (int y=0 ; y<x ; y++){ 
                bst.delete(Integer.toString(y));   
             }
            long endTime=System.currentTimeMillis();
//            System.out.println("Time： "+(endTime-startTime)+" ms");  
            System.out.println("After M = "+ x + " (Hibbard) deletions,");
            System.out.println("The depth/height of a Binary Search Tree is " + bst.getHeight());
            System.out.println("The size of this tree n = " + bst.size());
         }
    }
}
