/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basePack;

import impl.BSTSet;
import impl.Stuudent;

/**
 *
 * @author технодом
 */
public class BSTStuudentTest {
    public static void main (String [] args) {
        
        BSTSet <Stuudent> object = new BSTSet();
        
        object.add(new Stuudent (2016, "Kamilla"));
        object.add(new Stuudent (2015, "Ardak"));
        object.add(new Stuudent (2017, "Ashim"));
        object.add(new Stuudent (2020, "Alua"));
        object.add(new Stuudent (2021, "Nurik"));
        
        System.out.println(object + " size: " + object.getSize());
        
        object.add(new Stuudent (2017, "Ashim"));
        object.add(new Stuudent (2020, "Alua"));
        
        System.out.println(object + " size: " + object.getSize());
        
        object.add(new Stuudent (2013, "Madina"));
        object.add(new Stuudent (2014, "Regina"));
        object.add(new Stuudent (2015, "Aida"));
        
        System.out.println(object + " size: " + object.getSize());
        
        object.clear();
        
        System.out.println(object + " size: " + object.getSize());
        
        object.add(new Stuudent (2016, "Leila"));
        object.add(new Stuudent (2018, "Medina"));
        
        System.out.println(object + " size: " + object.getSize());
        
        
        
        
        
        
        
        
    }  
}
