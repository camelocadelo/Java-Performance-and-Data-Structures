/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adt;

/**
 *
 * @author технодом
 * @param <T>
 */
public interface SortedQueue <T extends Comparable>{
     
    /**
     * Adds an element to the queue in a position that preserves the ordering
     * of the elements 
     * @param value the element to be added to the queue
     */
    public void insert (T value);
    
    /**
     * Removes and returns the front most element of the queue
     * 
     * @return the front most element of the queue
     * @throws Exception if the queue is empty
     */
    public T dequeue() throws Exception;
        
    /**
     * @return the size of the queue
     */
    public int getSize();
    
    /**
     * Removes all elements from the queue
     */
    public void clear();
    
    public boolean isEmpty();
    
    /**
     * @return a String representation of the queue
     */
    @Override
    public String toString();
}
