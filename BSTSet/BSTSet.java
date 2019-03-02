/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import adt.Set;

/**
 *
 * @author технодом
 */
public class BSTSet <T extends Comparable> implements Set <T> {
    
    private TreeNode <T> root;
    private int size;
    
    public BSTSet () {
    root= null;
    size = 0;
    
}

    @Override
    public void add(T value) {
      if (!contains(value)){
      if (root == null) {
          TreeNode <T> newN = new TreeNode (value);
          root = newN;
          size++;
      } else {
       addHelper(value, root);
      }
    }
    }
      
    private void addHelper(T value, TreeNode <T> root) {
  
      if  (value.compareTo(root.getValue()) < 0) {
          if (root.getLeft() == null) {
              root.setLeft(new TreeNode (value));
              size++;
          } else {
              addHelper(value, root.getLeft());
          } 
      } else {
              if (root.getRight() == null) {
              root.setRight(new TreeNode(value));
              size++;
              } else {
              addHelper(value, root.getRight()); 
             }   
      } 
    }
   
    @Override
    public boolean contains(T value) { 
        return containsHelper(value, root);
    }  
    
    private boolean containsHelper(T value, TreeNode <T> root){
          boolean ans;
      if (root == null) {
         return false;
    }
         if  ((value.compareTo(root.getValue())) < 0) {
             ans = containsHelper(value, root.getLeft());
         } else{
             ans = containsHelper(value, root.getRight());
             }
             if(root.getValue().compareTo(value) == 0){ 
         ans = true; 
             }
         return ans;
         }    

    @Override
    public boolean remove(T value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T removeAny() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void clear() {
        root = null;
        size = 0;
    }
    
    public String toString () {
    return toStringHelper(root);
    }
    
    private String toStringHelper (TreeNode <T> node) {
        if (node == null) {
            return " ";
        }
        
        return toStringHelper (node.getLeft()) +
        node.getValue() +
        toStringHelper(node.getRight());
        
    }
    
}
