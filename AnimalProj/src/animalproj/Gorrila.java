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
public class Gorrila extends AnimalImpl implements AnimalProj {
      @Override
    public String AnimalKind() {
        return "Gorrilla";
    }
    
    @Override
    public boolean canEat(String food) {
       if (food.equals ("Banana")) { 
        return true;
    }
      return false;
    }
    

    
    public String toString () {
        return "The gorrila is " + age + " years old";
    }

    @Override
    public void feed(String food) throws Exception {
        if (!this.canEat(food)) {
            throw new Exception ("Gorrilllas cannot eat " + food);
            
        }
        System.out.println("OMNOMNOM");
    }

    @Override
    public void lives(String place) {
        System.out.println("Gorrillaz usually lives in " + place);
    }
    @Override
    public boolean canSwim () {
        if (age>0) {
            return true;
        }
        return false;
    }

    @Override
    public void sound() {
        System.out.println( "UHUHUU!");
    }
    
}
