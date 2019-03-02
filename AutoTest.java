/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto_package ;

public class AutoTest {
    public static void main(String[] args) {
	Automobile car1 = new Automobile("lexus200");
	Automobile car2 = new Automobile("Lexus100");
	
	
	System.out.println(car1);
	System.out.println(car2);
	
        try {
            Automobile car3 = new Automobile("Toyota");
            System.out.println(car3);
   
            //car3.startCar();
            car3.pressGasPedal();
            car3.calculateDistance(4);
            System.out.println(car3);
        } 
        catch (Exception ex){
              System.out.println(ex.getMessage());

        }
        
}
    
}
