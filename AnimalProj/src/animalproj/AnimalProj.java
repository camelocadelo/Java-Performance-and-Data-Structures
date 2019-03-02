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
public interface AnimalProj {
   
    /**
     * Returns the animal kind
     * @return the kind of the animal
     */
    public String AnimalKind ();
    
    /**
     * Return the current age of the animal
     * @return the current animal age
     */
    public int getAge() ;
    /**
     * Returns true iff the animal can eat the gicen kind of the food
     * @param food - the name of the food
     * @return whether or not the animal can eat the food
     */
    public boolean canEat(String food);
    /**
     * Increments the age of the animal by one year
     */
    public void oneYear();
    
    
    /**
     * Attempt to feed the animal to the given food
     * Throws an exception if an animal can not eat that type of food
     * @param food the food to be fed to the animal
     * @throws Exception if the animal can not eat the food
     */
    public void feed(String food) throws Exception;
    /**
     * 
     * @param place the place where this animal lives
     */
    public void lives (String place);
    /**
     * Returns true iff the animal's age is enough to be able to swim
     * @return whether or not the animal can swim
     */
    public boolean canSwim () ;
    /**
     * Prints the sound that the animal produces
     */
    public void sound ();
    
    
    
    }
    
    
  
