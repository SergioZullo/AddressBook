package it.addressbook.util;

import it.addressbook.beans.Person;

import java.util.Comparator;

public class PersonCompareByData implements Comparator<Person>{

	@Override
	public int compare(Person person1, Person person2) {
		return person1.getDateOfBirth().compareTo(person2.getDateOfBirth());
	}

}
