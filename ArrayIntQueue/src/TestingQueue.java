
import impl.ArrayIntQueue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author технодом
 */
public class TestingQueue {
public static void main (String [] args) {
       //1. Creates a new queue and tries to dequeue from the empty queue
        ArrayIntQueue intQueue = new ArrayIntQueue();
        try{
            System.out.println(intQueue.dequeue());
        }catch(Exception e){
            System.out.println(e);
        }
        
     //2. Enqueues 8 items on the queue using a loop, and then prints its contents and size afterwards   
    for (int i =0; i<9; i++)
          intQueue.enqueue((int) (Math.random()*50+1) );
         System.out.println("content: "+intQueue+".  Size:"+intQueue.getSize());
       
    
       
     //3. Dequeue 3 items from the queue, and print its contents and resulting size
     for(int i =0; i<3; i++)
            try{
                System.out.println(intQueue.dequeue()+".  Size:"+ intQueue.getSize());            
            }catch(Exception e){
                System.out.println(e);
            }
      
     
//4. Create a for loop that iterates 9 times, where the body enqueues two items, 
     //and then dequeues two items.  Print the queueвЂ™s contents and size after each iteration.
     
     for (int j=0; j<8; j++){
         intQueue.enqueue((int) (Math.random()*50+1) );
         intQueue.enqueue((int) (Math.random()*50+1) );
         try{
                intQueue.dequeue();
                intQueue.dequeue();
            }catch(Exception e){
                System.out.println(e);
            }

         System.out.println("content: "+intQueue+".  Size:"+intQueue.getSize());
     }
   
     //5. Clear the queue, and print its contents and resulting size
     intQueue.clear();
        System.out.println("content: "+intQueue+".  Size:"+intQueue.getSize());
        
        
     //6. Enqueue 22 more items to the queue using a loop, and again print its contents and resulting size
     for (int i =0; i<22; i++)
          intQueue.enqueue((int) (Math.random()*50+1) );
         System.out.println("content: "+intQueue+".  Size:"+intQueue.getSize());
} 
}

