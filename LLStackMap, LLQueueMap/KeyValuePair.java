/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adt;

/**
 * Key=value pairs to be used with the Map Interface
 * @param <K>
 * @param <V>
 * @author технодом
 */
public class KeyValuePair <K, V> {
    
    private K key;
    private V value;
    
    
    public KeyValuePair (K key, V value) {
        this.key = key;
        this.value = value;
    }
    
    public K getKey () {
        return key;
    }
    
    public void setKey (K key) {
        this.key = key;
    }
    
    public V getValue () {
        return value;
    }
    
    public void setValue (V value) {
        this.value = value;
    }
    
    @Override
    public String toString () {
        return "<" + key + "," + value + ">";
    }
    
}

