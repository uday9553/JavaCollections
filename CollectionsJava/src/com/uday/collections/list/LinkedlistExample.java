package com.uday.collections.list;

import java.util.LinkedList;
//i)Elements are doubly linked-both forward and backword
//ii)LinkedList also implements Queue,so supports methods like peek(),poll(),remove()
//iii)fast insertion and deletion
//iv)maintains insertion order
//v)It's not Thread Safe
//vi)if you try to remove any element using index method(more than size of the list), you will get exception
//but if if try remove(element) it will return false
public class LinkedlistExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> stringLinkedlist = new LinkedList<String>(); 
		  
        // Adding elements to the linked list 
        stringLinkedlist.add("A"); 
        stringLinkedlist.add("B"); 
        stringLinkedlist.addLast("C"); 
        stringLinkedlist.addFirst("D"); 
        stringLinkedlist.add(2, "E"); 
        stringLinkedlist.add("F"); 
        stringLinkedlist.add("G"); 
        stringLinkedlist.add(null);
        System.out.println("Linked list : " + stringLinkedlist); 
        // Removing elements from the linked list 
        stringLinkedlist.remove("B"); 
        stringLinkedlist.remove(3); 
        //will return false
        System.out.println(stringLinkedlist.remove("Z"));
        stringLinkedlist.removeFirst();  
        System.out.println("Linked list after deletion: " + stringLinkedlist); 
    
        // Number of elements in the linked list 
        int size = stringLinkedlist.size(); 
        System.out.println("Size of linked list = " + size); 
  
        // Get and set elements from linked list 
       
        System.out.println("Element returned by get() : " +  stringLinkedlist.get(2)); 
        stringLinkedlist.set(2, "Y"); 
        System.out.println("Linked list after change : " + stringLinkedlist); 
    

	}

}
