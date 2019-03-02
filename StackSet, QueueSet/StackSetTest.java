/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basePack;

import adt.Set;
import impl.StackSet;
import impl.Stuudent;

/**
 *
 * @author технодом
 */
public class StackSetTest {
    public static void main (String [] args) {
    
            Set<Stuudent> set = new StackSet();
        
        System.out.println("First tries to removeAny from the empty set — catch the exception, and print the set’s contents and size"); 
        try {
            set.removeAny();
        } catch (Exception e) {
            System.out.println(e);
        }
        
        System.out.println("\nAdd 5 unique Stuudents to the set, and print its contents and size");
        set.add(new Stuudent(111, "Alua1"));
        set.add(new Stuudent(222, "alua2"));
        set.add(new Stuudent(333, "alesha"));
        set.add(new Stuudent(444, "zhanerke"));
        set.add(new Stuudent(555, "lichi"));
        System.out.println(set+" and size:"+set.getSize());
        
       
        System.out.println("\nRemove a specific Stuudent from the set using a different object");    
        try {
            set.remove(new Stuudent(222, "Alua1"));
        } catch (Exception e) {
        }
        System.out.println(set+" and size:"+set.getSize());
        
        System.out.println("\nAttempt to add 2 new Stuudent objects that have the same values as those already in the set");
        set.add(new Stuudent(333, "alesha"));
        set.add(new Stuudent(444, "zhanerke"));
        System.out.println(set+" and size:"+set.getSize());
        
        System.out.println("\nAdd 3 new Stuudents to the set whose values are not already present, and print the set’s contents and size");
        set.add(new Stuudent(112, "aigera"));
        set.add(new Stuudent(223, "altynay"));
        set.add(new Stuudent(334, "bolat"));
        System.out.println(set+" and size:"+set.getSize());
        
        System.out.println("\nCall removeAny twice on the set, and output the values of those Stuudents who were removed");
        try {
            System.out.println("removed: "+set.removeAny());
            System.out.println("removed: "+set.removeAny());
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(set+" and size:"+set.getSize());
        
        System.out.println("\nClear the set, and print its contents and resulting size");
        set.clear();
        System.out.println(set+" and size:"+set.getSize());
        
        System.out.println("\nFinally, add 2 new Stuudents to the set, and print the set’s contents and size");
        set.add(new Stuudent(225, "kairat"));
        set.add(new Stuudent(226, "kamilla"));
        System.out.println(set+" and size:"+set.getSize());
    }
}
    
