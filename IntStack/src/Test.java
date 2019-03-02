
import Instack.impl.ArrayIntStack;


/**
 *
 * @author технодом
 */
public class Test {
   
    
    public static void main (String [] args) {
        
         /**
         * Creates a new stack and tries to pop from the empty stack
         */
        ArrayIntStack intStack = new ArrayIntStack();
        
        try{
            System.out.println(intStack.pop());
        }catch(Exception e){
            System.out.println(e);
        }
        /**
         * Use the loop to push 12 items, print the contents;
         */
         for (int i =0; i<12; i++) 
         intStack.push((int) (Math.random()*50+1) );
        
        System.out.println(intStack);
        
        /** 
         * Pop several items from the stack, and print its contents and resulting size
         */
        for(int i =0; i<3; i++)
            try{
                System.out.println(intStack.pop()+" and size:"+ intStack.getSize());            
            }catch(Exception e){
                System.out.println(e);
            }
        /**
         * Clear the stack, and print its contents and resulting size
         */
        intStack.clear();
        System.out.println("content: "+intStack+" and size:"+intStack.getSize());
        
        /**
         * Push 22 more items to the stack using a loop, and 
         * again print its contents and resulting size
         */
        for(int i =0; i<22; i++) intStack.push( (int) (Math.random()*50+1) );
        
        System.out.println("content: "+intStack+" and size:"+intStack.getSize());       
    }
      
    }


