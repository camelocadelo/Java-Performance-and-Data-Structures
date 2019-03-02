/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

/**
 *
 * @author технодом
 */
public class Node <T>{
    private T value;
    private Node<T> link;
    
    public Node (T val) {
        value = val;
    }
    /**
     * 
     * @return the value; 
     */
    public T getValue() {
        return value;
    }
    
    public void setValue(T value) {
        this.value = value;
    }
    
    public Node <T> getLink () {
        return link;
    }
    public void setLink (Node <T> link) {
        this.link = link;
    }
    
    public String toString () {
       return value.toString();
    }
 
}
