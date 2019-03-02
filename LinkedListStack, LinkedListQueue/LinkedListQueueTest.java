/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basePack;

import impl.LinkedListQueue;

/**
 *
 * @author технодом
 */
public class LinkedListQueueTest {
    public static void main (String[] args) {
        
       LinkedListQueue<Integer> myQueue = new LinkedListQueue();
        try {
            System.out.println(myQueue.dequeue());
        } catch (Exception e) {
            System.err.println(e);
        }
        
        for(int i =0; i<8; i++){
            myQueue.enqueue(i);
        } 
        System.out.println(myQueue+" and size: "+myQueue.getSize());
        
        for(int i=0; i<3; i++)
            try {
                System.out.println(myQueue.dequeue());
            } catch (Exception e) {
                System.out.println(e);
            }
        System.out.println(myQueue+" and size: "+myQueue.getSize());
        
        System.out.println("\nStarting 9 iteration");
        
        for(int i=0; i<9; i++){
            myQueue.enqueue(i);
            myQueue.enqueue(i);
            try {
                myQueue.dequeue();
                myQueue.dequeue();
            } catch (Exception e) {
                System.err.println(e);
            }
            System.out.println(myQueue+" and size: "+myQueue.getSize());
        }
        
        System.out.println(myQueue+" and size: "+myQueue.getSize());
        
        
        System.out.println("\nClear the queue");
        myQueue.clear();
        System.err.println(myQueue+" and size: "+myQueue.getSize());
    }
}
