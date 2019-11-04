package com.uday.collections.map;

import java.util.Hashtable;
//	i)same like HashMap but it is Thread-safe. so maintains insertion order
public class HashTableExample {

	public static void main(String[] args) {
		Hashtable<Integer, String> hash = new Hashtable<Integer, String>();

		hash.put(3, "sehwag");
		hash.put(2, "rohit");
		hash.put(1, "kiran");
		hash.put(0, "rahul");
		System.out.println("elements  in hash are:- " + hash);
		//will return null
		System.out.println(hash.put(4, "dhoni"));
	}

}
