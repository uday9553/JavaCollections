package com.uday.collections.set;

import java.util.HashSet;
//i)doesnot guarantee order of sorting
//ii)uses hashing technique/implementation
//iii)uses hashCode().
//iv)null values are allowed in HashSet
//simple any class starts with Hash represents no order insertion
public class HashSetExample {
	public static void main(String[] args) {
		HashSet<String> h = new HashSet<String>(); 
		  
        // Adding elements into HashSet usind add() 
        h.add("India"); 
        h.add("America");
        h.add("Australia"); 
        h.add("SouthAfrica"); 
        h.add("India");// adding duplicate elements
        h.add("America");
        h.add(null);
  
        // Displaying the HashSet 
        System.out.println(h); 
        System.out.println("List contains India " + 
                           h.contains("India")); 
  
        // Removing items from HashSet using remove() 
        h.remove("Australia"); 
        System.out.println("List after removing Australia:"+h); 
  
        // Iterating over hash set items 
        System.out.println("Iterating over list:"); 
       h.forEach(p->System.out.print(p+" "));
	}
}
