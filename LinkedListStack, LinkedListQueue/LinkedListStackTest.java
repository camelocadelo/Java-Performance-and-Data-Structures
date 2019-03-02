/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basePack;

import impl.LinkedListStack;

/**
 *
 * @author технодом
 */


public class LinkedListStackTest {
    public static void main (String [] args) {
        
    LinkedListStack <Integer> myStack = new LinkedListStack();
    try {
    System.out.println(myStack.pop());
} catch (Exception ex) {
    System.out.println(ex);
}
    
    for (int i = 0; i<12; i++) 
        myStack.push(i);
    System.out.println (myStack + " size: " + myStack.getSize());
    
    for (int i = 0; i<12; i++) 
        try{
            System.out.println("Popped: " + myStack.pop());
        } catch (Exception e) {
            System.out.println(e);
        }
      System.out.println(myStack + " size: " + myStack.getSize());
}
    
    
    
}
