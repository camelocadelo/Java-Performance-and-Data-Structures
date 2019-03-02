/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basePack;

import impl.BSTSet;

/**
 *
 * @author технодом
 */
public class BSTSetTest {
    public static void main (String [] args) {
       
    BSTSet <Integer> obj = new BSTSet ();
    
    obj.add(5);
    obj.add(12);
    obj.add(3);
    obj.add(6);
    obj.add(14);
    obj.add(2);
    obj.add(-6);
    obj.add(8);
    obj.add(0);
    
    System.out.println(obj + " size " + obj.getSize());
    
    obj.add(14);
    obj.add(-6);
    obj.add(5); 
    
    System.out.println(obj + " size " + obj.getSize()); 
    
     System.out.println("Does constain 12? - "+ obj.contains(12));
     System.out.println("Does constain 7? - "+ obj.contains(7));
     System.out.println("Does constain 2? - "+ obj.contains(2));
     System.out.println("Does constain -8? - "+obj.contains(-8));
    
    obj.clear();
    System.out.println(obj + " size " + obj.getSize());
    
    obj.add(55);
    obj.add(24);
    obj.add(78);
    obj.add(51);
        
    System.out.println(obj + " size " + obj.getSize());  
    
              
    }    
}
