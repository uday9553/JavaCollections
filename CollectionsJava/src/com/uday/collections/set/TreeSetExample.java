package com.uday.collections.set;

import java.util.SortedSet;
import java.util.TreeSet;
//i)doesnot guarantee insertion order
//i)mainatain Sorted order.
public class TreeSetExample {
	public static void main(String[] args) {
		SortedSet<String> stringTreeSet = new TreeSet<>(); 
        stringTreeSet.add("practice"); 
        stringTreeSet.add("collections"); 
        stringTreeSet.add("for");
        
        //stringSortedSet.add(null); TreeSet will not allow null values u will get NullPointerException
        stringTreeSet.add("quiz"); 
        stringTreeSet.add("code"); 
        System.out.println(stringTreeSet.contains("code"));
        
        System.out.println("Sorted Set: " + stringTreeSet); 
        System.out.println("First: " + stringTreeSet.first()); 
        System.out.println("Last: " + stringTreeSet.last()); 
  
        // Getting elements before quiz (Excluding) in a sortedSet 
        SortedSet<String> beforeQuiz = stringTreeSet.headSet("quiz"); 
        System.out.println(beforeQuiz); 
  
        // Getting elements between code (Including) and  
        // practice (Excluding) 
        SortedSet<String> betweenCodeAndQuiz = 
                                  stringTreeSet.subSet("code","practice"); 
        System.out.println(betweenCodeAndQuiz); 
  
        // Getting elements after code (Including) 
        SortedSet<String> afterCode = stringTreeSet.tailSet("code"); 
        System.out.println(afterCode);
	}
}
