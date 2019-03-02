/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basePack;

import impl.LinkedListSortedQueue;
import impl.Stuudent;

/**
 *
 * @author технодом
 */
public class StudentSortedQueueTest {
    public static void main (String [] args) {
        LinkedListSortedQueue <Stuudent> studentQueue = new LinkedListSortedQueue();
        
        Stuudent stud1 = new  Stuudent(2012, "Kam");
        Stuudent stud2 = new  Stuudent(2012, "Kami");
        Stuudent stud3 = new  Stuudent(2009, "Kamilla");
        
        studentQueue.insert(stud1);
        studentQueue.insert(stud2);
        studentQueue.insert(stud3);
        
        System.out.println(studentQueue + " size: " + studentQueue.getSize());
        
        for(int i=1; i<=2; i++) {
            try {
                studentQueue.dequeue();
            } catch (Exception e) {
                System.out.println(e);
            }
            
            System.out.println(studentQueue + " size: " + studentQueue.getSize());
     
        }     
    }   
}
