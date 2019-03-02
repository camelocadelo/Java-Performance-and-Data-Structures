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
public class BooksTest {
    public static void main (String[] args) {
        HarryPotter phylStone = new HarryPotter (" Phylosospher Stone ", 2001, "England", 356, true);
        System.out.println(phylStone);
        phylStone.isPDF();
        
         
        History kzHis = new History (" History of early KZ ", 1799, "Kazakhstan", 184, false);
        System.out.println(kzHis);
        kzHis.isReliable();
        kzHis.inLibrary();
        kzHis.language();
      
        Science maths = new Science (" Calculus 1 ", 2005, "USA", 456);
        
        System.out.println(maths);
        maths.language();
        maths.LongToRead();
        
    }
}
