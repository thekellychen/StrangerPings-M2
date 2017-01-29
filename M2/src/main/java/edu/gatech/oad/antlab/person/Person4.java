package edu.gatech.oad.antlab.person;

/**
 *  A simple class for person 4
 *  returns their name and a
 *  modified string 
 *  
 *  @author Bob
 *  @version 1.1
 */
public class Person4 {
  /** Holds the persons real name */
  private String name;
    /**
     * The constructor, takes in the persons
     * name
     * @param pname the person's real name
     */
  public Person4(String pname) {
    name = pname;
  }
    /**
     * This method should return a string
     * where each character is 1 greater 
     * than its previous value.  So
     * given "abc123" it should return
     * "bcd234".
     *
     * @param input the string to be modified
     * @return the modified string
     */
    private String calc(String input) {
      //Person 4 put your implementation here
        char[] aa = input.toCharArray();
        int j = 0;
        while ( j < input.length()) {
            if (aa[j] == 'z') {
                aa[j] = 'a';
            } else if (aa[j] == 'Z') {
                aa[j] = 'A';
            } else if (aa[j] == '9') {
                aa[j] = '0';
            } else {
                aa[j] += 1;
            }
            j++;
        }
        return new String(aa);
    
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

