package com.uday.collections.map;

import java.util.LinkedHashMap;
//mainatains insertion order
public class LinkedHashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
		lhm.put("one", "practice c");
		lhm.put("two", "java tutorial");
		lhm.put("four", "quiz on java");
		lhm.put("aaa", "practise java");

		// It prints the elements in same order
		// as they were inserted
		System.out.println(lhm);

		System.out.println("Getting value for key 'one': " + lhm.get("one"));
		System.out.println("Size of the map: " + lhm.size());
		System.out.println("Is map empty? " + lhm.isEmpty());
		System.out.println("Contains key 'two'? " + lhm.containsKey("two"));
		System.out.println("Contains value 'practice.python" + "org'? ");
		System.out.println("delete element 'one': " + lhm.remove("one"));
		System.out.println(lhm);

	}

}
