/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basePack;

import adt.Set;
import impl.QueueSet;
import impl.Stuudent;

/**
 *
 * @author технодом
 */
public class QueueSetTest {
    
    public static void main (String [] args) {
                Set <Stuudent> set = new QueueSet();
        
        //First tries to removeAny from the empty set — catch the exception, and print the set’s contents and size 
        try {
            set.removeAny();
        } catch (Exception e) {
            System.out.println(e);
        }
        
        //Add 5 unique Stuudents to the set, and print its contents and size
        set.add(new Stuudent(111, "Alua1"));
        set.add(new Stuudent(222, "alua2"));
        set.add(new Stuudent(333, "livan"));
        set.add(new Stuudent(444, "miami"));
        set.add(new Stuudent(555, "amiran"));
        System.out.println(set+" and size:"+set.getSize());
        
        //Remove a specific Stuudent from the set using a different object         
        try {
            set.remove(new Stuudent(111, "livan"));
        } catch (Exception e) {
        }
        System.out.println(set+" and size:"+set.getSize());
        
        //Attempt to add 2 new Stuudent objects that have the same values as those already in the set
        set.add(new Stuudent(111, "Alua1"));
        set.add(new Stuudent(222, "alua2"));
        System.out.println(set+" and size:"+set.getSize());
        
        //Add 3 new Stuudents to the set whose values are not already present, and print the set’s contents and size
        set.add(new Stuudent(123, "eskere"));
        set.add(new Stuudent(221, "lilpump"));
        set.add(new Stuudent(332, "bizkit"));
        System.out.println(set+" and size:"+set.getSize());
        
        //Call removeAny twice on the set, and output the values of those Stuudents who were removed
        try {
            System.out.println("removed: "+set.removeAny());
            System.out.println("removed: "+set.removeAny());
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(set+" and size:"+set.getSize());
        
        //Clear the set, and print its contents and resulting size
        set.clear();
        System.out.println(set+" and size:"+set.getSize());
        
        //Finally, add 2 new Stuudents to the set, and print the set’s contents and size
        set.add(new Stuudent(124, "kredo"));
        set.add(new Stuudent(132, "ivan"));
        System.out.println(set+" and size:"+set.getSize());       
  
        
    }
}
