/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basePack;

import impl.LinkedListSortedQueue;

/**
 *
 * @author технодом
 */
public class LinkedListSortedQueueTest {
    public static void main (String[] args) {
        LinkedListSortedQueue <Integer> myQueue = new LinkedListSortedQueue();
        for (int i = 90; i > 0; i = i - 10) {
            myQueue.insert(i);
        } System.out.println(myQueue + " size: " + myQueue.getSize());
        
       for (int i = 0; i<3; i++) {
           try { 
               myQueue.dequeue();
           } catch (Exception e) {
               System.out.println(e);          
           }
       }
       
       for (int i=100; i<=900; i = i+100) {
            myQueue.insert(i);
       } System.out.println(myQueue + " size: " + myQueue.getSize());
       
       for (int i = 0; i<4; i++) 
           try { 
               myQueue.dequeue();
           } catch (Exception e) {
               System.out.println(e);          
           }
       System.out.println(myQueue + " size: " + myQueue.getSize());
       
       
       for (int i=5; i<=915; i = i+10) {
            myQueue.insert(i);
       } System.out.println(myQueue + " size: " + myQueue.getSize());
       
       
       int size = myQueue.getSize();
       for(int i=0; i < size; i++) {
           try {
               myQueue.dequeue();
           } catch (Exception e) {
               System.out.println(e);
           }
       }
       System.out.println(myQueue + " size: " + myQueue.getSize());
       
       myQueue.insert(30);
       myQueue.insert(20);
       myQueue.insert(15);
       System.out.println(myQueue + " size: " + myQueue.getSize());
       
       myQueue.clear();
       System.out.println(myQueue + " size: " + myQueue.getSize());
       
       myQueue.insert(31);
       myQueue.insert(41);
       myQueue.insert(51);
       myQueue.insert(23);
       
       System.out.println(myQueue + " size: " + myQueue.getSize());      
    }  
}
