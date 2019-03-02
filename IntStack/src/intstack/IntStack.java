/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intstack;

/**
 * A stack of primitive integers
*/
public interface IntStack {
    /**
     * Puts the given element on the top of the stack
     * @param value element to added on the top of the stack
     */
    public void push(int value);
    
    /**
     * Removes and returns the top most element of the stack
     * @return the top most element of the stack
     * @throws Exception if the stack is empty
     */
    public int pop ()throws Exception;
    /**
     * Remove all elements from the stack
     */
    
    public void clear ();
    /**
     * 
     * @return the size of the stack
     */
    
    public int getSize();
    /**
     * 
     * @return the String representation of the Stack 
     */
    @Override
    public String toString ();
}
