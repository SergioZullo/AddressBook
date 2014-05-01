package it.addressbook.start;

import it.addressbook.beans.Person;
import it.addressbook.file.ReadFromFile;
import it.addressbook.util.PersonUtil;

import java.util.ArrayList;
import java.util.logging.Logger;

public class Start {
	
	private static Logger LOGGER = Logger.getLogger(Start.class.getName());
	
	public static void main(String[] args) {
		
		String filename = new String("C:\\Users\\Master\\Desktop\\AddressBook.txt");
		
		ReadFromFile read = new ReadFromFile();
		
		ArrayList<Person> people = read.getPersonFromFileAsList(filename);
		
		if (people.size() == 0){
			LOGGER.info("No data found on the file");
			return;
		}
		
		PersonUtil util = new PersonUtil();
		
		//count number of males
		System.out.println("Count Males " + util.countMale(people));
		
		//print the oldest
		Person person = util.getOldestPerson(people);
		System.out.println(person);
		
		//return difference days between Bill and Paul ( if on of them didn't find return -1 )
		Person bill = util.getPersonByName(people, "Bill");
		Person paul = util.getPersonByName(people, "Paul");
		System.out.println(util.differenceDay(bill, paul));
		
		
	}
}
