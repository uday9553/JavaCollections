package com.uday.collections.list;

// Java program to demonstrate working of ArrayList in Java 
import java.io.*; 
import java.util.*; 
  
//i)accessing variables in ArrayList is very fast because underlying datastructure is array
//ii)Insertion and deletion are slower compared to LinkedList,because adding and deleting may nedd to create new copy of array
//iii)It's not Thread Safe
//iv)allows null values
class ArraylistExample 
{ 
    public static void main(String[] args) 
                       throws IOException 
    { 
        //declaring ArrayList with initial size n 
        List<Integer> arrlist = new ArrayList<Integer>(); 
  
        // Appending the new element at the end of the list 
       arrlist.add(1);
       //Allows duplicate values in list
       //arrlist.add(1);
       arrlist.add(10);
       arrlist.add(4);
       arrlist.add(3);
       arrlist.add(2);
       arrlist.add(null);
  
        // Printing elements 
        System.out.println(arrlist); 
        // Remove element at index 3 
        arrlist.remove(3); 
  
        // Displaying ArrayList after deletion 
        System.out.println(arrlist); 
  
        // Printing elements one by one 
        arrlist.forEach(p->System.out.print(p+" "));
    } 
}