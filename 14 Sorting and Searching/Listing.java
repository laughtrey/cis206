/*
   File: Listing.java
   Description: Telephone Lookup Program
   Author: Raymond Laughrey
   Email: raymonl4963@student.vvc.edu
   Date of Creation: 5/17/2019, 3:52:10 PM
 */
public class Listing {
private String m_name, m_number;
/**
 * Constructs a listing of a persons name and telephone number
 * @param name   The input name
 * @param number The input number
 */
public Listing(String name, String number)
{
	m_name = name;
	m_number = number;
}
/**
 * Returns the listing name
 * @return Member data name
 */
public String get_name()
{
	return m_name;
}
/**
 * Returns the listing number
 * @return Member data number
 */
public String get_number()
{
	return m_number;
}
}
