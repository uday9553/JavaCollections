package com.uday.collections.set;

import java.util.HashSet;
import java.util.Set;

class Person {
	// omitting for brevity
	String firstName;
	String lastName;

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public boolean equals(Object o) {
		System.out.println("equals method");
		if (this == o) {
			return true;
		}
		if (!(o instanceof Person)) {
			return false;
		}
		Person p = (Person) o;
		return firstName.equals(p.firstName) && lastName.equals(p.lastName);
	}

	@Override
	public int hashCode() {
		System.out.println("hashcode method");
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}

}

public class SetWithDuplicateObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetWithDuplicateObjects swdo=new SetWithDuplicateObjects();
		swdo.addValuestoSet();
	}

	public void addValuestoSet() {
		Set<Person> person = new HashSet<Person>();
		person.add(new Person("aaa", "bbb"));
		person.add(new Person("aaa", "bbb"));
		person.add(new Person("ddd", "ccc"));
		
		person.forEach(p->System.out.println("firstname is "+p.firstName+" lastname is "+p.lastName));
	}

}
