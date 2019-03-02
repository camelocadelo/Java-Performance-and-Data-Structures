/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adt;

/**
 * 
 * @author технодом
 * @param <K>
 * @param <V> 
 */
public interface Map <K, V> {
    
    
    /**
     * Adds a new key-value mapping to the map, which will replace the same
     * key-value mapping that has the same key, if it exists
     * @param key of the key-value to be added
     * @param value of the key-value to be added
     */
    public void define (K key, V value);
    
    /**
     * Returns the value associated with the given key in the map, if one exists;
     * returns null if the key is not in the map
     * @param key whose value we want to return 
     * @return the value associated with the given key
     */
    public V getValue (K key) ;
    
    /**
     * Removes the key-value pair from the map that has the given key value, and returns the associated
     * value if it exists; if the key is not in the map, the map remains unchanged 
     * and null is returned
     * @param key of the key-value pair that we want to remove
     * @return value associated with the given key before removal
     */
    public V remove (K key);    
    
    /**
     * Removes and returns some key-value pair from the map,
     * if the map is not empty; if the map is empty, the exception
     * is thrown
     * @return some key-value pair from the map
     * @throws Exception if the map is empty
     */
    public KeyValuePair <K, V> removeAny () throws Exception;
    
    /**
     * 
     * @return the number of key-value pairs in the map 
     */
    public int getSize ();
    
    /**
     * Remove all key-value pairs from the map
     */
    public void clear ();
    
    /**
     * 
     * @return a String representation of the map 
     */
    @Override
    public String toString ();
}
