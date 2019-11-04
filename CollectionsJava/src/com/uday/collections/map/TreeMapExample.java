package com.uday.collections.map;

import java.util.Map;
import java.util.TreeMap;
//maintain sorted order
//no null key values are allowed
public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TreeMap<Integer,String> treemap=new TreeMap<Integer,String>();    
	      treemap.put(100,"Amit");    
	      treemap.put(102,"Ravi");    
	      treemap.put(101,"Vijay");    
	      treemap.put(103,"Rahul");    
	      System.out.println("Before invoking remove() method");  
	      for(Map.Entry m:treemap.entrySet())  
	      {  
	          System.out.println(m.getKey()+" "+m.getValue());      
	      }  
	      treemap.remove(102);      
	      System.out.println("After invoking remove() method");  
	      for(Map.Entry m:treemap.entrySet())  
	      {  
	          System.out.println(m.getKey()+" "+m.getValue());      
	      }  

	}

}
