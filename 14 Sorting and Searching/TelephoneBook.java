/*
   File: TelephoneBook.java
   Description: Telephone Lookup Program
   Author: Raymond Laughrey
   Email: raymonl4963@student.vvc.edu
   Date of Creation: 5/17/2019, 3:52:10 PM
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.io.File;
import java.io.FileNotFoundException;

public class TelephoneBook {
//---Private Variables---//
private ArrayList<Listing> v = new ArrayList<Listing>();
private final int MAX_LENGTH_OF_DATA = 4;
Comparator<Listing> compareByName = (Listing a, Listing b)->a.get_name().compareTo(b.get_name());
//Collections.sort(v, compareByName);
Comparator<Listing> compareByNumber = (Listing a, Listing b)->a.get_number().compareTo(b.get_number());
//Collections.sort(v, compareByNumber);
//---Private Variables---//

/**
 * Default TelephoneBook constructor
 * @param filename The input data in the form of a , delimited set of information
 */
public TelephoneBook(String filename)  throws FileNotFoundException
{
	File inputFile = new File(filename);
	Scanner input = new Scanner(inputFile);
	int line_count = 0;

	while (input.hasNextLine()) {
		line_count++;
		String line = input.nextLine();
		String[] listingData = line.split(",");//Expected: [0] id # discarded | [1] first name | [2] last name |[3] phone number
		if (listingData.length > MAX_LENGTH_OF_DATA) {
			input.close();
			throw new IllegalArgumentException("Error in input file on line: " + line_count); // This will throw an error message if input data is not formatted correctly.
		}
		String name = listingData[1] + " " + listingData[2];
		v.add(new Listing(name, listingData[3]));
	}
	input.close();
}
/**
 * Sorts the ArrayList of listings by name, and then searches for the name and returns the phone number.
 * @param  name The input name.
 * @return      A string constructed with the name and number.
 */
public String lookup_by_name(String name)
{
	Collections.sort(v, compareByName);
	int result = binary_search_name(v, 0, v.size() - 1, name);
	if (result < 0) {
		return ("That name doesn't exist in this Telephone Book");
	}else
		return (v.get(result).get_name() + "'s number is: " + v.get(result).get_number());
}
/**
 * Sorts the ArrayList of listings by number, and then searches for the number and returns the name.
 * @param  number The input number.
 * @return      A string constructed with the name and number.
 */
public String lookup_by_number(String number)
{
	Collections.sort(v, compareByNumber);
	int result = binary_search_number(v, 0, v.size() - 1, number);
	if (result < 0) {
		return ("That number doesn't exist in this Telephone Book");
	}else
		return (v.get(result).get_name() + "'s number is: " + v.get(result).get_number());
}
/**
 * Binary search by name
 * @param  v     The ArrayList of Listings
 * @param  from  The start of the search
 * @param  to    The end of the search
 * @param  value The inputted value being searched for
 * @return       The index position of the name in the ArrayList of listings.
 */
public int binary_search_name(ArrayList<Listing> v, int from, int to, String value)
{
	if (from > to)
		return -1;
	int mid = (from + to) / 2;
	if (v.get(mid).get_name().equals(value))
		return mid;
	else if (v.get(mid).get_name().compareTo(value) < 0)
		return binary_search_name(v, mid + 1, to, value);
	else
		return binary_search_name(v, from, mid - 1, value);
}
/**
 * Binary search by number
 * @param  v     The ArrayList of Listings
 * @param  from  The start of the search
 * @param  to    The end of the search
 * @param  value The inputted value being searched for
 * @return       The index position of the number in the ArrayList of listings.
 */
public int binary_search_number(ArrayList<Listing> v, int from, int to, String value)
{
	if (from > to)
		return -1;
	int mid = (from + to) / 2;
	if (v.get(mid).get_number().equals(value))
		return mid;
	else if (v.get(mid).get_number().compareTo(value) < 0)
		return binary_search_number(v, mid + 1, to, value);
	else
		return binary_search_number(v, from, mid - 1, value);
}
}
