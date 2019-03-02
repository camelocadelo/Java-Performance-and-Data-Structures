/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import adt.Deque;

/**
 *
 * @author технодом
 */
public class MergeSort {
    
    public static Deque<Integer> merge(Deque<Integer> d1, Deque<Integer> d2) {
     int p1 = 0, p2 =0;
     int d1_length = d1.getSize();
     int d2_length = d2.getSize();
     int length = d1_length + d2_length;
     
     Deque<Integer> result = new LinkedListDeque();
     
     int current1 = 0, current2 = 0;
     
     //System.out.println(d1+" and "+d2);
     
     for(int i=0; i<length; i++){
         
         try {
            current1 = d1.popFromFront();
         } catch (Exception e) {
         }
         try {
            current2 = d2.popFromFront();
         } catch (Exception e) {
         }
         
         if (p1 == d1_length){
             result.pushToBack( current2 );
             p2++;
         } else if (p2 == d2_length){
             result.pushToBack(current1);
             p1++;
         } else if (current1<current2){
             result.pushToBack(current1);
             p1++;
             d2.pushToFront(current2);
         } else{
            result.pushToBack(current2);
            d1.pushToFront(current1);
             p2++; 
         }
         
     };
     return result;
    } 
    
    
    
public static Deque <Integer> mergeSort(Deque<Integer> deq){
    int size = deq.getSize();
         if(size <= 1) return deq;
         else{
             int center = (deq.getSize()/ 2);
             Deque<Integer> semi1 = new LinkedListDeque();
             for (int i = 0; i < center; i++) {
                try {
                    semi1.pushToBack(deq.popFromFront());
                } catch (Exception e) {
                    System.out.println(e);
                }
             }
             
             Deque<Integer> semi2 = new LinkedListDeque();
             for (int i = center; i < size; i++) {
                try {
                    semi2.pushToBack(deq.popFromFront());
                } catch (Exception e) {
                    System.out.println(e);
                }
             }
             
             semi1 = mergeSort(semi1);
             semi2 = mergeSort(semi2);
             
             return merge(semi1, semi2);
        
         }
}
           
public static void main (String [] args) {
    MergeSort mergeSorter = new MergeSort ();
    
    LinkedListDeque <Integer> d1 = new LinkedListDeque();
    LinkedListDeque <Integer> d2 = new LinkedListDeque();
    
    d1.pushToBack(2);
    d1.pushToBack(4);
    d1.pushToBack(5);
    
    d2.pushToBack(3);
    d2.pushToBack(6);
    d2.pushToBack(7);   
    
    System.out.println(mergeSorter.merge(d1, d2));
    
    MergeSort mergeSorting = new MergeSort();
    LinkedListDeque <Integer> deq = new LinkedListDeque();
    
       for (int i = 0; i < 8; i++) {
       deq.pushToBack((int) (Math.random()*50));
        }
        System.out.println("Given: "+deq);
  
        System.out.println("Sorted: "+mergeSort(deq));
    
}
}
