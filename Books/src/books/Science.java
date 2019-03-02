/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package books;

/**
 *
 * @author технодом
 */
public class Science extends Books {
    public Science(String name, int y, String c, int n) {
        super(name, y, c, n);
    }
        
         public String toString() {
         return "The book name is " + getName() + "was published in " + getYear() + "Country: " + getCountry();
     }
        
    
}
