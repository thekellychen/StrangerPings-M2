package edu.gatech.oad.antlab.person;
import java.util.Collections;
import java.util.Arrays;

/**
 *  A simple class for person 2
 *  returns their name and a
 *  modified string 
 *
 * @author Rishab Kaup
 * @version 1.1
<<<<<<< HEAD
 * Rishab Kaup
=======
 * 
>>>>>>> 818cf4166b75c7aaf56d1c2922c5c886357004ca
 */
public class Person2 {
    /** Holds the persons real name */
    private String name;
	 	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
	 public Person2(String pname) {
	   name = pname;
	 }
	/**
	 * This method should take the string
	 * input and return its characters in
	 * random order.
	 * given "gtg123b" it should return
	 * something like "g3tb1g2".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
	  //Person 2 put your implementation here
	  	String[] words = input.split("");
	  	String finalStr = "";
		Integer[] arr = new Integer[words.length];
		for (int i = 0; i < arr.length; i++) {
		    arr[i] = i;
		}

		Collections.shuffle(Arrays.asList(arr));
		for (int i = 0; i < arr.length; i++) {
		    finalStr += words[arr[i]];
		}

	  return finalStr;
	}
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the 
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}
}
