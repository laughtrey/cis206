/*
   File: Main.java
   Description: Hotel transaction log, input and error handling.
   Author: Raymond Laughrey
   Email: raymonl4963@student.vvc.edu
   Date of Creation: 5/8/2019, 7:40:42 PM
 **/
public class Reciept
{
private String m_service;
private Double m_tendered;

public Reciept(Double tendered, String service)
{
	m_tendered = tendered;
	m_service = service;
}
public String get_service()
{
	return m_service;
}
public Double get_tendered()
{
	return m_tendered;
}

}
