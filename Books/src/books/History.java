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
public class History extends Books {
    private boolean inGoogleScholar;
    
    public History (String name, int y, String c, int n, boolean inGS) {
        super(name, y, c, n);
        inGoogleScholar = inGS;
    }
    
    public void isReliable () {
        if (inGoogleScholar) {
            System.out.println("You can use it in Research");
        } else {
            System.out.println("Search for another reliable source");
        }
    }
     public String toString() {
         return "The book name is " + getName() + "was published in " + getYear() + "Country: " + getCountry();
     }
}
