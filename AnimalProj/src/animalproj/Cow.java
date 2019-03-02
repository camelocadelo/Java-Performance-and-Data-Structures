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
public class Cow extends AnimalImpl implements AnimalProj {


    @Override
    public String AnimalKind() {
       return "Cow";
    }

    @Override
    public boolean canEat(String food) {
        if (food.equals("Grass")) {
            return true;
        }
        return false;
    }
    
    public String toString () {
        return "The cow which is " +age+ " years old";
    }

    @Override
    public void feed(String food) throws Exception {
        if (!this.canEat(food)) {
            throw new Exception ("The cow cannot eat " + food);      
        }
        System.out.println("OMNOMNOM");
    }

    @Override
    public void lives(String place) {
        System.out.println("Cow usually inhabits " + place);
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
        System.out.println("MOOO");
    }

}
