package com.uday.collections.map;

import java.util.HashMap;
//i)unsorted
//ii)uses hashCode()
//iii)not synchronized
public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map = new HashMap<>();
		map.put(20, "dravid");
		map.put(1,"vishal");
		map.put(2,"sachin");
		map.put(3,"vaibhav");
		map.put(10, "sehwag");
		map.put(15, "dhoni");
		map.put(7, "rohit");
		map.put(5, "ganguly");
		map.put(2, "rahul");
		map.put(11, "rahul");
		System.out.println("elements  in map are:- " + map);
		//you can't remomve an element using value only
		//will return null if key is not present
		System.out.println("delete element at key 11 which is not present"+map.remove(11));
		//remove() wil return element present at key 2 and deletes the element
		System.out.println("delete element at key 2"+map.remove(3));
	}

}
