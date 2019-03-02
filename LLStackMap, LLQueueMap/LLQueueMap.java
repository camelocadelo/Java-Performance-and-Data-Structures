/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import adt.KeyValuePair;
import adt.Map;

/**
 *
 * @author технодом
 */
public class LLQueueMap <K,V> implements Map <K,V> {
    
    private LinkedListQueue <KeyValuePair<K,V>> pairs;
    private int size;
    
    public LLQueueMap () {
        pairs = new LinkedListQueue ();
        size = 0;
   
    }

    @Override
    public void define(K key, V value) {
        
        KeyValuePair <K, V> m = new KeyValuePair (key, value);
        if (size == 0) {
            pairs.enqueue(m);
        } else {
            
        for (int i=0; i<pairs.getSize();i++) {
            try {
                KeyValuePair <K,V> x = pairs.dequeue();
                if (x.getKey().equals(key)) {
                    x.setValue(value);
                    pairs.enqueue(x);
                } 
                else {
                    KeyValuePair <K,V> y;
                    y = new KeyValuePair <K,V> (key,value);
                    y.setKey(key);
                    y.setValue(value);
                    pairs.enqueue(y);
                }
            } catch (Exception ex) {
                System.out.println(ex);
            }         
        }
        }
    }
       
    

    @Override
    public V getValue(K key) {
        V result = null;
        for (int i = 0; i< pairs.getSize(); i++) {
            try {
                KeyValuePair <K,V> x = pairs.dequeue();
                pairs.enqueue(x);
                 if (x.getKey().equals(key)) 
                     result = x.getValue();
                     return result;         
            } catch (Exception ex) {
                System.out.println(ex);
            }
        } 
        return null;
    }

    @Override
    public V remove(K key) {
        V result = null;
        for (int i=0; i<pairs.getSize();i++) {
            try{
                KeyValuePair <K,V> x = pairs.dequeue();
                if (x.getKey().equals(key)) {
                    result=x.getValue();
                    return result;
                } else {
                    pairs.enqueue(x);
                }
            } catch (Exception ex) {
                System.out.println(ex);
            } 
        } 
        return null;
    }

    @Override
    public KeyValuePair<K, V> removeAny() throws Exception {
        if (pairs.getSize() == 0) throw new Exception ("The map is empty");
            KeyValuePair <K,V> result = pairs.dequeue();
            return result;
    }

    @Override
    public int getSize() {
        return pairs.getSize();
    }

    @Override
    public void clear() {
        pairs.clear();
    }
   
    
    public String toString () {
    return pairs.toString();
}
    
}
