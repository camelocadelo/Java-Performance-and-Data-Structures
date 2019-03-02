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
public class intersectionTest {
     public  static void main (String [] args) {
        SetCheck checker = new SetCheck();
        
        Set<Integer> set1 = new QueueSet();
        Set<Integer> set2 = new QueueSet();
        for (int i = 0; i < 10; i++) {
           set2.add(i); 
        }
        for (int i = 9; i > 4; i--) {
            set1.add(i);
        }
        System.out.println(checker.intersection(set1, set2));
    }
   }

