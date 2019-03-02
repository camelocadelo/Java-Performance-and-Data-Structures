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
public class Stuudent implements Comparable <Stuudent> {
     
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
    
    public boolean equals (Stuudent other) {
        return this.getID() == other.getID();
    }
    public int compareTo(Stuudent other) { 
     if (this.equals(other)) 
             return 0;
     else if (this.getID() > other.getID())
        return 1;
     else
      return -1;

  //   return name.compareTo(other.getName());
    }
        public String toString ( ){
        return name + ":" + id;
    }
  
}
