/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adt;

/**
 *
 * @author технодом
 */
public interface Stack <T> {
    /**
     * Puts the given element on the top of the stack
     * @param value element to added on the top of the stack
     */
    public void push(T value);
    
    /**
     * Removes and returns the top most element of the stack
     * @return the top most element of the stack
     * @throws Exception if the stack is empty
     */
    public T pop ()throws Exception;
    /**
     * Remove all elements from the stack
     */
    
    public void clear ();
    /**
     * 
     * @return the size of the stack
     */
    
    public int getSize();
    
    public boolean isEmpty();

    /**
     * 
     * @return the String representation of the Stack 
     */
    @Override
    public String toString ();
}

    

