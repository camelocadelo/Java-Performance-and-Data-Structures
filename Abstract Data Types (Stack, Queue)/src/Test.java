
import ADT.adt.IntQueue;
import ADT.adt.IntStack;
import ADT.impl.ArrayIntQueue;
import ADT.impl.ArrayIntStack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author технодом
 */
public class Tessstt {
   
    public static int evenCount(IntStack stk){
        int count = 0,
            size = stk.getSize();
        IntStack temp = new ArrayIntStack();
        for (int i = 0; i < size; i++) {
            int number;
            try {
                number = stk.pop();
                temp.push(number);
                if(number % 2 == 0) count++;
            } catch (Exception except) {
                System.out.println(except);
            }            
        }
        for (int i = 0; i < size; i++)  
            try {
                stk.push(temp.pop());
            } catch (Exception ex) {
                System.out.println(ex);
            }
        return count;
    }
    
    public static IntStack copyStack(IntStack orig){
        ArrayIntStack Stack1 = new ArrayIntStack(),
                      temp = new ArrayIntStack();
        int size = orig.getSize();
        for (int i = 0; i < size; i++) {
            try {
                temp.push(orig.pop());
            } catch (Exception except) {
                System.out.println(except);
            }
        }
        for (int i = 0; i < size; i++) {
            try {
                int value = temp.pop();
                orig.push(value);
                Stack1.push(value);
            } catch (Exception except) {
                System.out.println(except);
            }
        }
        
        return Stack1;
    }
    
    public static boolean isPalindrome(IntQueue q){
        ArrayIntStack stackCheck = new ArrayIntStack();
        ArrayIntQueue queueCheck = new ArrayIntQueue();
        int size = q.getSize(); 
        for(int j=0; j<size; j++){
            try {
                int c = q.dequeue();
                stackCheck.push(c);
                queueCheck.enqueue(c);
            } catch (Exception ex) {
                System.out.println(ex);
            }
            
        }
        
        while(queueCheck.getSize()!=0){
            try {
                if(queueCheck.dequeue() != stackCheck.pop()) return 
                        false;
            } catch (Exception ex) {
                System.out.println(ex);
            }            
        } 
        return true;
    }
    
    
    public static void reverseQueue(IntQueue toRev){
        int size = toRev.getSize();
        int c = 0;
        ArrayIntStack stack = new ArrayIntStack(); 
 
        for (int i = 0; i < size; i++) {
            try {
                c = toRev.dequeue();
                stack.push(c);
            } catch (Exception ex) {
                System.out.println(ex);
            } 
        }
        System.out.println("stack:"+stack);
        System.out.println("queue:"+toRev);
        for (int i = 0; i < size; i++) {
            try {
                toRev.enqueue(stack.pop());
                //System.out.println("queue:"+toRev);
            } catch (Exception ex) {
                System.out.println(ex);
            }
 
        }
    }
    
     public static void main (String [] args) {
        
//        //1 
//        ArrayIntStack intStack = new ArrayIntStack();
//        
//        try{
//            System.out.println(intStack.pop());
//        }catch(Exception e){
//            System.out.println(e);
//        }
//        
//        //2
//         for (int i =0; i<12; i++) 
//         intStack.push((int) (Math.random()*50+1) );
//        
//        System.out.println(intStack);
//        
//        //3
//        for(int i =0; i<3; i++)
//            try{
//                System.out.println(intStack.pop()+".  Size:"+ intStack.getSize());            
//            }catch(Exception e){
//                System.out.println(e);
//            }
//       //4
//        intStack.clear();
//        System.out.println("content: "+intStack+".  Size:"+intStack.getSize());
//        
//      //5
//        for(int i =0; i<22; i++) intStack.push( (int) (Math.random()*50+1) );
//        
//        System.out.println("content: "+intStack+".  Size:"+intStack.getSize());       
//    
     
        
        //lesson8
        ArrayIntStack stk = new ArrayIntStack();
         for (int i =0; i<5; i++) 
         stk.push((int) (Math.random()*50+1) );
        
         System.out.println("Ex 1 ");
        System.out.println(stk);
        System.out.println(evenCount(stk));
        
         System.out.println("Ex 2");
         System.out.println(copyStack(stk));

         System.out.println("Ex 6");
         ArrayIntQueue palindrome = new ArrayIntQueue();
         palindrome.enqueue(1);
         palindrome.enqueue(2);
         palindrome.enqueue(3);
         palindrome.enqueue(2);
         palindrome.enqueue(1);
         System.out.println(palindrome);
         System.out.println(isPalindrome(palindrome));
         
         
        System.out.println("Ex 5");
        ArrayIntQueue rev = new ArrayIntQueue();
         for (int i =0; i<5; i++) 
         rev.enqueue((int) (Math.random()*50+1) );
         System.out.println(rev);
         reverseQueue(rev);
     } 
    }

