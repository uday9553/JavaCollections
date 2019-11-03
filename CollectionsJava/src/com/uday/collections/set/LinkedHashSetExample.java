package com.uday.collections.set;

import java.util.LinkedHashSet;
//i)Maintains insertion order.
//ii)unsorted.
//iii)uses hashCode().
public class LinkedHashSetExample {
	public static void main(String[] args) {
		LinkedHashSet<String> linkedset = new LinkedHashSet<String>();

// Adding element to LinkedHashSet   
		linkedset.add("A");
		
		linkedset.add("B");
// This will not add new element as A already exists  
		linkedset.add("A");
		linkedset.add("E");
		linkedset.add(null);

		System.out.println("Size of LinkedHashSet = " + linkedset.size());
		System.out.println("Original LinkedHashSet:" + linkedset);
		linkedset.add("C");
		System.out.println("Removing D from LinkedHashSet: " + linkedset.remove("D"));
		System.out.println("Trying to Remove Z which is not " + "present: " + linkedset.remove("Z"));
		System.out.println("Checking if A is present=" + linkedset.contains("A"));
		System.out.println("Updated LinkedHashSet: " + linkedset);
	}
}
