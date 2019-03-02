/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import adt.Intqueue;

/**
 *
 * @author технодом
 */
public class ArrayIntQueue implements Intqueue {
 private int[] values;
    private int size;
    private int front;
    private int back;
    
    public ArrayIntQueue(){
        values = new int[5];
        size = 0;
        front = 0;
        back = 0;
    }
    
    @Override
    public void enqueue(int value) {
           if (size == values.length){

            int[] copyValues = new int[values.length*2];

            for(int i=0, j = front; i<size; i++, j = (j+1)%values.length){
            copyValues[i] = values[j];
                }
            
            values = copyValues;
            values[size] = value;
            front = 0;
            size++;
            back = size;

            } else{

            values[back]=value;
            back = (back+1) % values.length;
            size++;

            }
                }
      
              
    
    
    @Override
    public int dequeue() throws Exception {
        int result = 0;

        if (back == 0 && front == 0){
        throw new Exception("The array is empty");
        }

            if (front == values.length - 1 && back < front){
                result = values[front];
                        front = 0;
                } else {
                result = values[front];
                front++;
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
        values = new int[5];
        size = 0;
        front = 0;
        back = 0;
    }
    
 @Override
    public String toString(){
    
            String result = " ";
            for(int a = 0, b = front; a<size; a++, b=(b+1)%values.length){ 
            result +=" "+values[b]; 
            } 

            return result; 
        }
}
