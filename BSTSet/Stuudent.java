/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

/**
 *
 * @author технодом
 */
public class Stuudent implements Comparable {
     
    private int id;
    private String name;
    
    public Stuudent (int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public void setID (int id) {
        this.id = id;
    }
    
    public void setName (String name) {
        this.name = name;
    }
    
    public int getID () {
        return id;
    }
    public String getName () {
        return name;
    }
    
    public boolean equals(Object obj){
        if(obj instanceof Stuudent){
           Stuudent st = (Stuudent) obj;
           return st.getID() == id;
        }
        return false;
    }

    
    public int compareTo(Object student) {
        /**
         * lab12_2
         */
        Stuudent st = (Stuudent) student;
//        boolean res = id > st.getId();
//        if(res == false) return -1; 
//        else return 1; 


        /**
         * lab12_2
         */
        return name.compareTo(st.getName());
    }

        public String toString ( ){
        return "{"+name+": "+id+"}";
    }
  
}
