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
public class HarryPotter extends Books {
   private boolean eVersion;
    
    public HarryPotter (String name, int y, String c, int n, boolean eBook) {
        super(name, y, c, n);
        eVersion = eBook;
    }
    
    public void isPDF () {
        if (eVersion) {
            System.out.println("You can download on your phone");
        } else {
            System.out.println("Hard copy is also Ok");
        }
    }   
    public String toString() {
         return "The book name is " + getName() + "was published in " + getYear() + "Country: " + getCountry();
     }
  
}
