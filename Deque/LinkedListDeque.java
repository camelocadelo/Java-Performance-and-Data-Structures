/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import adt.Deque;


/**
 *
 * @author технодом
 */
public class LinkedListDeque <T> implements Deque<T> {
     private DoublyLinkedNode<T> front;
     private DoublyLinkedNode <T> back;
     private int size;
    
    public LinkedListDeque(){
        front = null;
        back = null;
        size = 0;
    }

    @Override
    public void pushToFront(T value) {
        //push from stack
       DoublyLinkedNode <T> newItem = new DoublyLinkedNode(value);
       if (size == 0) {
           front = newItem;
           back = front;
       } else {
           newItem.setNext(front);
           front.setPrevious(newItem);
           front = newItem;
       }
        size++;
   }

    @Override
    public void pushToBack(T value) {
        DoublyLinkedNode<T> newObj = new DoublyLinkedNode(value); 

        if(size == 0) {
            front = newObj;
            back = front;
        } else {
            back.setNext(newObj);
            newObj.setPrevious(back);
            back = newObj;            
        }
        size++;
    }

    @Override
    public T popFromFront() throws Exception {
        if(size == 0) throw new Exception("Cannot pop from empty deque");
        T result = front.getValue();
        if(size == 1) {
            front = null; back= null;
        } else {
            DoublyLinkedNode current = front;
            current = current.getNext();
            current.setPrevious(null);
            front = current;
        }
        size--;
        return result;
    }

    @Override
    public T popFromBack() throws Exception {
        if (size == 0) throw new Exception ("Cannot pop from empty deque");
        T result = back.getValue();
        if (size == 1) {
            front = null; back = null;
        } else {
            DoublyLinkedNode current = back;
            current = current.getPrevious();
            current.setNext(null);
            back = current;
        }
        size--;
        return result;
    }
    
    @Override
    public int getSize() {  
        return size;
    }

    @Override
    public void clear() {
        front = null;
        back = null;
        size = 0;
    }

      public String toString(){
        String result="front[ ";
        DoublyLinkedNode<T> current = front;
        while(current != null){
            result += current.getValue()+" ";
            current = current.getNext();
        }
        
        return result+"]back";
    }
}