package it.addressbook.util;

import it.addressbook.beans.Person;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class PersonUtil {
	
	public int countMale(List<Person> people){
		int count = 0;
		for (Person person : people){
		   if (Gender.Male.name().equals(person.getSex()))
			   count++;
		}
		return count;
	};

	public Person getOldestPerson(List<Person> people){
		Collections.sort(people, new PersonCompareByData());
		return people.get(0);
	}
	
	public long differenceDay(Person person1, Person person2){
		if (person1 == null || person2 == null)
			return -1;
		
		long diff = Math.abs(person1.getDateOfBirth().getTime() - person2.getDateOfBirth().getTime());

		long diffDays = diff / (24 * 60 * 60 * 1000);
		
		return diffDays;
	}
	
	public Person getPersonByName(List<Person> people,String name){
		Person person = null;
		for(Person p : people){
			if (p.getName().equalsIgnoreCase(name)){
				return p;
			}
		}
		return person;
	}
	
	
}
