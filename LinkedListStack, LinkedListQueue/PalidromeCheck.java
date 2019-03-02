/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import adt.Queue;

/**
 *
 * @author технодом
 */
public class PalidromeCheck {
    
    
    public static boolean isPalindrome (Queue <Character> q) {
    LinkedListStack <Character> myStack = new LinkedListStack() ;
    LinkedListQueue <Character> myQueue = new LinkedListQueue();
    int size = q.getSize();
    
    for (int i=0; i<size; i++) {
 
        try {
         char var = q.dequeue();
         myStack.push(var);
         myQueue.enqueue(var);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
       
        while (myQueue.getSize() != 0) {
            try {
               if (myQueue.dequeue() != myStack.pop()) 
                   return false;
            }  catch (Exception e) {
                       System.out.println(e);
                       }
        }
              return true;
            } 
                  
     
 public static void main (String [] args) {
        PalidromeCheck checker = new PalidromeCheck ();
        LinkedListQueue <Character> queue = new LinkedListQueue ();
        
        queue.enqueue('p');
        queue.enqueue('a');
        queue.enqueue('a');
        queue.enqueue('a');
        
        System.out.println(checker.isPalindrome(queue));
  
    } 
}
        
        


