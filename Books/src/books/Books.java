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
public class Books {

    private String naming;
    private int pubYear;
    private String Country;
    private int nOfPages;
    
   public Books (String name, int y, String c, int n) {
       naming = name;
       pubYear = y;
       Country = c;
       nOfPages = n;
   }
   /**
    * 
    * @return the name
    */
   public String getName () {
       return naming;
   }
   
   
   /**
    * 
    * @return the publication year
    */
   public int getYear () {
       return pubYear;   
   }
   /**
    * 
    * @return the Country
    */
   public String getCountry() {
       return Country;
   }
   /**
    * 
    * @return number of pages
    */
   public int getPages() {
       return nOfPages;
   }
   
   public void inLibrary() {
       if (pubYear > 1800) {
           System.out.println("You can definitely find it on the shelves");
       } else {
           System.out.println("Search in archives...");
       }
}
   public void LongToRead () {
       if (nOfPages < 100) {
           System.out.println("Finich in 3 days");
       } else {
           System.out.println("It will take considerable time to finish it");
       }
   }
   
     public void language () {
         if (Country == "USA") {
             System.out.println("It is likely to be originally in English");
         } else {
             System.out.println("It is not likely to be in English");
         }
     }
     
     public String toString() {
         return "The book name is " + naming + " was published in " + pubYear + " Country: " + Country;
     }
}





