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
public class AnimalImpl implements AnimalProj {
    
    public int age;
    public int maxAge;
    public boolean isAlive;

    @Override
    public String AnimalKind() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * 
     * @return the age of the animal
     */
    @Override
    public int getAge() {
        return age;
    }

    @Override
    public boolean canEat(String food) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Increments the age by one integer;
     */
    @Override
    public void oneYear() {
        age++;
        if (age > maxAge) {
            isAlive = false;
        }
    }

    @Override
    public void feed(String food) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void lives(String place) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean canSwim() {
        if (age > 0) {
            return true;
        }
        return false;
    }

    @Override
    public void sound() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
