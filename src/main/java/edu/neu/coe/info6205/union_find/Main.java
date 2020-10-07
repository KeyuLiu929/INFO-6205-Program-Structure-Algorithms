/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.coe.info6205.union_find;

import java.util.Random;

/**
 *
 * @author Keyu Liu
 */
public class Main {
    public static int count(int n){
        int count = 0;
        UF_HWQUPC h = new UF_HWQUPC(n,true);
        Random random = new Random();
        while(h.components()!=1){
            count+=1;
            int a = random.nextInt(n);
            int b = random.nextInt(n);
            h.connect(a, b);
         }
        return count;
        
    }
     public static void main(String[] arg){
         for (int n = 100; n<1000 ; n+=n   ){
           int j = 100;
           int sum = 0;
            while(j>0){
                System.out.println("while n = "+n+" times to connect all components is "+count(n));
                sum+=count(n);
                j--;
             }
            System.out.println("while n = "+n+" Average times to connect all components is " +sum/100);
            
       }

    
}    
    
}
