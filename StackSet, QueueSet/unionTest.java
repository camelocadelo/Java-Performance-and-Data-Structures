/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basePack;

import adt.Set;
import impl.QueueSet;
import impl.SetCheck;

/**
 *
 * @author технодом
 */
public class unionTest {
    public  static void main (String [] args) {
        SetCheck checker = new SetCheck();
        
        Set <String> set1 = new QueueSet();
        Set <String> set2 = new QueueSet();
        for (int i = 0; i < 10; i++) {
           set2.add(String.valueOf(i)); 
        }
        for (int i = 15; i > 7; i--) {
            set1.add(String.valueOf(i));
        }
        System.out.println(checker.union(set1, set2));
    
        
    } 
}
