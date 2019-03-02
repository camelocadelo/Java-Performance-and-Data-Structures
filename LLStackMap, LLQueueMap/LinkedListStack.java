/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import adt.Stack;

/**
 *
 * @author технодом
 */
public class LinkedListStack <T> implements Stack <T> {
    private int size;
    private Node <T> top;
    
    public LinkedListStack () {
        top = null;
        size = 0;
    }
    
   public void push (T value) {
       Node <T> newTop = new Node(value);
       if (size>0)
           newTop.setLink(top);
           top = newTop;
           size++;
   }
   
    public T pop () throws Exception {
        if (size == 0) 
            throw new Exception ("The stack is empty");
        T result;
        result = top.getValue();
        if (size == 1) {
            top = null;
        }
        else {
        
        top.setValue(top.getLink().getValue());
        top.setLink(top.getLink().getLink());
        
        }
        size--;
        return result;
    }

    @Override
    public void clear() {
        size = 0;
        top = null;
    }

    @Override
    public int getSize() {
        return size;
    }
    
    @Override
    public String toString(){
        String result = "";
        Node current = top;
        while(current!=null){
            result += current+",";
            current = current.getLink();
        }
        return result;
    
}

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
