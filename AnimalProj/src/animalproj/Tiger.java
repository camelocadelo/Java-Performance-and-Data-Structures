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
public class Tiger extends AnimalImpl implements AnimalProj {
    
    
    @Override
    public String AnimalKind() {
        return "Tiger";
    }
    
    @Override
    public boolean canEat(String food) {
       if (food.equals ("Meat")) { 
        return true;
    }
      return false;
    }
    

    
    public String toString () {
        return "The tiger is " + age + " years old";
    }

    @Override
    public void feed(String food) throws Exception {
        if (!this.canEat(food)) {
            throw new Exception ("Tigers cannot eat " + food);
            
        }
        System.out.println("MUNCH!!!MUNCH!!!");
    }

    @Override
    public void lives(String place) {
        System.out.println("Tiger usually lives in " + place);
    }


    @Override
    public void sound() {
        System.out.println( "Roooar!");
    }
    
    
}
