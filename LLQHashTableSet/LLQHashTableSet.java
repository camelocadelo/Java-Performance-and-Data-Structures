/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import adt.Set;

/**
 *
 * @author технодом
 */
public class LLQHashTableSet <T> implements Set<T> {
    private LinkedListQueue<T>[] buckets;
    private int size;

     public LLQHashTableSet(int numBuckets) {
         size = 0;
     }
     buckets = new LinkedListQueue[numBuckets];
     }
}
@Override
     
     public void add(T value) throws Exception {
int i = value.hashCode() % buckets.length;
if (buckets[i] == null) {
buckets[i] = new LinkedListQueue<>();buckets[i].enqueue(value);size++;}
else
{for (int k = 0; k < buckets[i].getSize(); k++) {T val = buckets[i].dequeue();buckets[i].enqueue(val);if (val.equals(value)) {return;}}buckets[i].enqueue(value);size++;}}@Overridepublic boolean contains(T value) {int i = value.hashCode() % buckets.length;try{


    @Override
    public boolean contains(T value) {
        int hash = value.hashCode();
        boolean result = false;
        if (hash >= 0) {
            hash = hash % branch;
        } else if (hash < 0) {
            hash = -hash % branch;
        }
        if (size == 0) {
            return false;
        }
        
            if (buckets[hash] == null) {
                return false;
            }
            int size0 = buckets[hash].getSize();
            for (int i = 0; i < size0; i++) {
                try {
                    T val = buckets[hash].dequeue();
                    buckets[hash].enqueue(val);
                    if (val.equals(value)) {
                        return true;
                    }
                } catch (Exception ex) { //This should not happen
                }
            }
            return false;
    }
       

    @Override
    public boolean remove(T value) {
        if (contains(value)) {
            int hash = value.hashCode();
            if (hash >= 0) {
                hash = hash % branch;
            } else if (hash < 0) {
                hash = -hash % branch;
            }

            int size0 = buckets[hash].getSize();
            for (int i = 0; i < size0; i++) {
                try {
                    T val = buckets[hash].dequeue();
                    if (val.equals(value)) {
                        size--;
                        return true;
                    } else {
                        buckets[hash].enqueue(val);
                    }
                } catch (Exception ex) { //This should not happen
                }
            }
        }
        return false;
    }

    @Override
    public T removeAny() throws Exception {
        if (size == 0) {
            throw new Exception("The LLQHashTableSet is empty.");
        } else {
            for(int i=0; i<branch; i++){
                if (buckets[i].getSize() != 0) {
                size--;
                return buckets[i].dequeue();
            } 
            } 
        }
        return null;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void clear() {
        buckets = (LinkedListQueue<T>[]) new LinkedListQueue[branch];
        size = 0;
    }

    @Override
    public String toString() {
        String result=null;
        for(int i=0; i<branch; i++){
              result+=  buckets[i] + "\n";
            }
        result+="Size:" +  size;
        return result;
    }

}
    
  
