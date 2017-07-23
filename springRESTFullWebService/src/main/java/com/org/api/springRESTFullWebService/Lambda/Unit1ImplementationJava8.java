package com.org.api.springRESTFullWebService.Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ImplementationJava8{

	public static void main(String[] args) {
		List<Person> people=Arrays.asList(
				new Person("Sidd","Jadhav",1),
				new Person("Abhi","Patil",2),
				new Person("Sunil","Malikar",3),
				new Person("Bhakti","Panda",4)
				);
		//Sort List by last name
		Collections.sort(people,(o1,o2)-> o1.getFirstName().compareTo(o2.firstName));
		//create a method that prints all elements in the list
		printAll(people);
		//create a method that prints all people that has last name starting with a letter
		printLastNameBeginingC(people);
		System.out.println();
		printSome(people,(p)-> p.getFirstName().startsWith("S"));
		
		System.out.println();
		printSome(people, (Person p)->p.getLastName().startsWith("J"));
	}

	private static void printSome(List<Person> people, Condition c) {
		for(Person p:people){
			if(c.condition(p)){
				System.out.println(p);
			}
		}
		
	}

	private static void printLastNameBeginingC(List<Person> people) {
		for(Person p:people){
			if(p.getLastName().startsWith("P")){
				System.out.println(p);
			}
		}
	}

	private static void printAll(List<Person> people) {
		for(Person a:people){
			System.out.println(a.toString());
		}
	}
}
