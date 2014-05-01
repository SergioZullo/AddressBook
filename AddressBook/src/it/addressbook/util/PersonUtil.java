package it.addressbook.util;

import it.addressbook.beans.Person;

import java.util.Collections;
import java.util.List;

public class PersonUtil {
	
	public int countMale(List<Person> people){
		int count = 0;
		for (Person person : people){
		   if (person.getSex().equals(Gender.Male))
			   count++;
		}
		return count;
	};

	public Person getOldestPerson(List<Person> people){
		Collections.sort(people, new PersonCompareByData());
		return people.get(0);
	}
	
	
}
