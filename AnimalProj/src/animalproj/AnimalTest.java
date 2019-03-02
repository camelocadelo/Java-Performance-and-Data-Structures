/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalproj;

/**
 *
 * @author технодом
 */
public class AnimalTest {
    
    public static void feedMeat (AnimalProj animal) {
              try { 
                  animal.feed("Meat");
              } catch (Exception ex ) {
                  System.out.println(ex.getMessage());
              }
        }
    
    public static void main (String [] args) {
        
        AnimalProj cow = new Cow();
        AnimalProj tiger = new Tiger();
        Gorrila gorrila = new Gorrila ();
       
        
        cow.oneYear();
        
        System.out.println(cow);
        System.out.println(tiger);
        System.out.println(gorrila);
        feedMeat(tiger);
        feedMeat(cow);
        
        cow.lives("villages");
        tiger.lives("jungles");
        gorrila.lives("tropical rainforests");
        
        gorrila.sound(); 
        
    }
    
}
