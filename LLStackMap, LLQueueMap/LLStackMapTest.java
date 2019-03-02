/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basePack;

import impl.LLStackMap;

/**
 *
 * @author технодом
 */
public class LLStackMapTest {
    public static void main (String [] args) {
    LLStackMap <Integer, String> object = new LLStackMap();
    
    try {
         object.removeAny();
        } catch (Exception ex) {
            System.out.println(ex);
        }
         
        System.out.println(object);
        
        object.define (101, "Minimal");
        object.define (202, "Rvanye dzhynsy");
        object.define (303, "Hey, guys");
        object.define (404, "Disconnect");
        object.define (505,"Rozovoye vino");
        
        System.out.println(object + " size: " + object.getSize());

        object.remove(505);
        
        System.out.println(object + " size: " + object.getSize());
        
        object.remove(606);
        
        System.out.println(object + " size: " + object.getSize());
        
        object.define (101, "Medina");
        object. define (202, "Leila");
        
        System.out.println(object + " size: " + object.getSize());
        
        object.define (110, "Potrachu");
        object.define (220, "Tancy");
        object.define (330, "La Callin");
        
        System.out.println(object + " size: " + object.getSize());
        
        try {
         object.removeAny();
        } catch (Exception ex) {
            System.out.println(ex);
        }

        try {
         object.removeAny();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
        System.out.println(object + " size: " + object.getSize());
        
        object.clear();
        
        System.out.println(object + " size: " + object.getSize());
        
        object.define (440, "Collaba");
        object.define (550, "Africa");
        
        System.out.println(object + " size: " + object.getSize()); 
    }
}
