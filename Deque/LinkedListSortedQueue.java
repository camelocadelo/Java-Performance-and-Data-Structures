/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;


import adt.SortedQueue;

/**
 *
 * @author технодом
 */
public class LinkedListSortedQueue<T extends Comparable> implements SortedQueue<T> {
     private Node<T> front;
    private int size;
    
    public LinkedListSortedQueue(){
        front = null;
        size = 0;
    }
    @Override
    public void insert(T value) {
        Node<T> newNode = new Node(value); 
        if (size == 0) {
            front = newNode;
        } else {
           // newnode goes before front
           if(value.compareTo(front.getValue()) <=0){
              newNode.setLink(front);
              front = newNode;
           } else{
               Node<T> current = front;
               Node<T> previous = null;
               while(current !=null){
                   if(value.compareTo(current.getValue()) <=0){
                       newNode.setLink(current);
                       previous.setLink(newNode);                       
                       break;
                   }
                   previous = current;
                   current = current.getLink();
               }
               
               //execute if "while" looped until the end
               if(current == null){
                   previous.setLink(newNode);
               }
               
           }
        }
        size++;
    }

   
    @Override
    public T dequeue() throws Exception {
        if(size == 0) throw new Exception("queue is empty....");
        T result = front.getValue();
        if(size == 1) {
            front = null;
        } else front = front.getLink();
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
      size =0;
    }

    @Override
    public boolean isEmpty() {
       return size == 0;
    }
    
@Override
     public String toString(){
        String result="front[ ";
        Node<T> current = front;
        while(current != null){
            result += current.getValue()+" ";
            current = current.getLink();
        }
        
        return result+"]back";
    }
    }

