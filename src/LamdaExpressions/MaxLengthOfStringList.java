package LamdaExpressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MaxLengthOfStringList {
	
	

	
	  public static void main(String[] args) {
	    // Create a list of colors
	    List < String > colors = Arrays.asList("Red", "Green", "Blue", "Orangeisbestand love is best", "Black");

	    // Print the elements of the list
	    System.out.println("Elements of the list: " + colors);
	    
//	    int max_length= colors.stream().mapToInt(String :: length).max().orElse(0);
	    
	    int max_length= colors.stream().mapToInt(s-> s.replaceAll(" ","").length()).max().orElse(0);
	    System.out.println("max length is "+ max_length);
	    
	  }
	  
}