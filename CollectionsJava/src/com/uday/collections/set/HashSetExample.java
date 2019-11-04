package com.uday.collections.set;

import java.util.HashSet;
//i)doesnot guarantee order of sorting
//ii)uses hashing technique/implementation
//iii)uses hashCode().
//iv)null values are allowed in HashSet
//simple any class starts with Hash represents no order insertion
public class HashSetExample {
	public static void main(String[] args) {
		HashSet<String> stringHashSet = new HashSet<String>(); 
		  
        // Adding elements into HashSet usind add() 
        stringHashSet.add("India"); 
        stringHashSet.add("America");
        stringHashSet.add("Australia"); 
        stringHashSet.add("SouthAfrica"); 
        stringHashSet.add("India");// adding duplicate elements
        stringHashSet.add("America");
        stringHashSet.add(null);
        // Displaying the HashSet 
        System.out.println(stringHashSet); 
        System.out.println("List contains India " + 
                           stringHashSet.contains("India")); 
       //removing using index is not possible
  
        // Removing items from HashSet using remove() 
        stringHashSet.remove("Australia"); 
        System.out.println("List after removing Australia:"+stringHashSet); 
  
        // Iterating over hash set items 
        System.out.println("Iterating over list:"); 
       stringHashSet.forEach(p->System.out.print(p+" "));
	}
}
