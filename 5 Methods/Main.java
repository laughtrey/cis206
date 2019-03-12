/*
   File: Main.java
   Description:
   Author: Raymond Laughrey
   Email: raymonl4963@student.vvc.edu
   Date of Creation:
 */
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;
public class Main
{
public static void main(String[] args)
{
	String str = "abc";
	String str2 = "California";
	String str3 = "Supercalifragilisticexpialidocious";

	System.out.println(scramble(str));
	System.out.println(scramble(str2));
	System.out.println(scramble(str3));
}
public static String scramble(String word)
{
	String scrambled = word;

	if (word.length() > 3) {
		int e = word.length() - 1;                                      // assigns the second to last character an integer value
		String to_scramble = word.substring(1, e);                      // so that here I can scramble everything EXCEPT first and last char
		int i = (int)(Math.random() * to_scramble.length());            // this picks a random character EXCEPT first and last
		if (i == 0) {i += 1;}
		int j = i + 1;                                                  // this gets the one right after it
		String Beginning = word.substring(0, i);                        // creates a string before the randomly picked character
		String End = word.substring(j + 1);                             // creates a string after the second picked character to the end of the word
		scrambled = Beginning + word.charAt(j) + word.charAt(i) + End;  // concatenates the word with scrambled letters inside
	}
	return scrambled;
}
}
