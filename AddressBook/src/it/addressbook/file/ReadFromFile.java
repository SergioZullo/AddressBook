package it.addressbook.file;

import it.addressbook.beans.Person;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class ReadFromFile  {
	
	public ArrayList<Person> getPersonFromFileAsList(String filename) {
		ArrayList<Person> people = new ArrayList<Person>();
		List<String> lines = null;
        try {
            lines = Files.readAllLines(Paths.get(filename),Charset.defaultCharset());
            for (String line : lines) {
            	
            	Person person = new Person();
                
                String[] splitToComma = line.split(",");
                //split to divide name and surname 
                String[] longName = splitToComma[0].split("\\s+");
                //catch name and surname
                person.setName(longName[0]);
                person.setSurname(longName[1]);
                //remove space from sex
                person.setSex(splitToComma[1].replaceAll("\\s+",""));
                //remove space from date
                SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
            	Date date = null;
				try {
					date = sdf.parse(splitToComma[2].replaceAll("\\s+",""));
				} catch (ParseException e) {
					System.out.println("It was not possible catch the date");
				}
            	person.setDateOfBirth(date);
            	
            	people.add(person);
            }
        } catch (IOException e) {
            System.out.println("Error of read ");
        }
		return people;
	}
}
