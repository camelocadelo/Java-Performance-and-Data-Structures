/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADT.adt;

/**
 *
 * @author технодом
 */
public interface IntQueue {
  public void enqueue(int value);
    
    /**
     * Removes and returns the front most element of the queue
     * 
     * @return the front most element of the queue
     * @throws Exception if the queue is empty
     */
    public int dequeue() throws Exception;
        
    /**
     * @return the size of the queue
     */
    public int getSize();
    
    /**
     * Removes all elements from the queue
     */
    public void clear();
    
    /**
     * @return a String representation of the queue
     */
    @Override
    public String toString();
 
}
