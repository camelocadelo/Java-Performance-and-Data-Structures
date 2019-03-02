/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basePack;

import impl.LinkedListDeque;

/**
 *
 * @author технодом
 */
public class LinkedListDequeTest {
    public static void main (String [] args) {
        LinkedListDeque <Integer> object = new LinkedListDeque();
        
        //tries to pop from front/back empty deque
        try {
            object.popFromFront();
        } catch (Exception e) {
            System.out.println(e);
        } 
        System.out.println(object + " size: " + object.getSize());
        
        try {
            object.popFromBack();
        } catch (Exception e) {
            System.out.println(e);
        } 
        System.out.println(object + " size: " + object.getSize());
        
        //pushes 5 items to front, returning contents and size after each iteration
        
        for (int i=0; i<5; i++) {
            object.pushToFront(i);
            System.out.println(object + " size: " +object.getSize());
        }
        
        //Pops the 5 items from the front of the deque, and print its contents and resulting size after each pop.
        for (int i=0; i<5; i++) {
            try {
                object.popFromFront();
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(object + " size: " +object.getSize());
        }
        
        //Pushes 6 items to the front of the deque, and print its contents and resulting size after each push.
        for (int i=0; i<6; i++) {
            object.pushToFront(i);
            System.out.println(object + " size: " +object.getSize());
        }
        
        //Pops the 6 items from the back of the deque, and print its contents and resulting size after each pop.
            for (int i=0; i<6; i++) {
            try {
                object.popFromBack();
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(object + " size: " +object.getSize());
        }
       
        //Pushes 7 items to the back of the deque, and print its contents and resulting size after each push.
         for (int i=0; i<7; i++) {
            object.pushToBack(i);
            System.out.println(object + " size: " +object.getSize());
        }
        
         //Pops the 7 items from the back of the deque, and print its contents and resulting size after each pop.
        for (int i=0; i<7; i++) {
            try {
                object.popFromBack();
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(object + " size: " +object.getSize());
        }
        
        //Pushes 8 items to the back of the deque, and print its contents and resulting size after each push.
          for (int i=0; i<8; i++) {
            object.pushToBack(i);
            System.out.println(object + " size: " +object.getSize());
        }
        
          //Pops the 8 items from the front of the deque, and print its contents and resulting size after each pop.
                for (int i=0; i<8; i++) {
            try {
                object.popFromFront();
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(object + " size: " +object.getSize());
        }
                
//Repeat the following 10 times using a loop:
//Pushes an item to the front, and then to the back, and print the contents and resulting size

 for (int i=0; i<10; i++) {
     object.pushToFront(i);
     object.pushToBack(i);
 }
     System.out.println(object + " size: " + object.getSize());
 
 
//Repeat the following 8 times using a loop:
//Pops an item from the front, and then from the back, and print the contents and resulting size
 
  for (int i=0; i<8; i++) {
       try {
            object.popFromFront();
            object.popFromBack();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
  System.out.println(object + " size: " + object.getSize());
        
                object.clear();
                System.out.println(object + " size: "+ object.getSize());             
    }
}
