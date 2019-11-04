package com.uday.collections.list;
import java.util.*; 
class VectorExample { 
//	i)It is Thread safe(all methods are synchronized).
//	ii)almost same like ArrayList
	//iii)allows null values
    public static void main(String[] arg) 
    { 
        List<Integer> integerVector = new Vector<Integer>(); 
  
        // use add() method to add elements in the vector 
        integerVector.add(1); 
        integerVector.add(2); 
        integerVector.add(5); 
        integerVector.add(6); 
        integerVector.add(7);
        integerVector.add(3); 
        integerVector.add(4); 
        integerVector.add(null);
  
        // printing elements 
        System.out.println("elements in vector are: " + integerVector); 
        
        //Remove element at index 3
        integerVector.remove(3);
     // printing elements 
        System.out.println("elements in vector are: " + integerVector); 

        
        
    } 
} 