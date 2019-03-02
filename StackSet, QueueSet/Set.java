/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adt;

/**
 * A generic set
 * @author технодом
 * @param <T>
 */
public interface Set <T> {
    
    /**
     * Adds the given value to the set if another element with the same value
     * is not already there
     * @param value element to be added to the set
     */
    public void add (T value);
    
    /**
     * Returns whether or not an element witht he same value is in the set
     * @param value that is checked for in the set
     * @return whether or not the value is contained int he set
     */
    public boolean contains (T value);
    
    /**
     * Removes an element witht he given value fron the set and returns true, if 
     * it is there; otherwise, the set remains unchanged and false is returned
     * @param value to be removed from the set
     * @return whether o rnot the vakue is contained in the set
     */
    public boolean remove (T value);
    
    /**
     * Removes some element form the set and returns it, if the set is not empty;
     * if the set is empty, the exception is thrown.
     * @return some element from the set
     * @throws Exception 
     */
    public T removeAny () throws Exception;
    
    /**
     * 
     * @return the number of elements in the set;
     */
    public int getSize();
    
    /**
     * Removes all elements from the set
     */
    public void clear();
    
    /**
     * 
     * @return the String representation of the set
     */
    public String toString ();
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
