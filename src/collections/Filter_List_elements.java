package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Filter_List_elements {

	

	  public static void main(String[] args) {
	    List < Integer > numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
	    System.out.println("Original list of numbers: " + numbers);
	    // Filter even numbers
//	    List < Integer > evenNumbers = numbers.stream().filter(n -> n %2==0).collect(Collectors.toList());
//	    System.out.println(evenNumbers);
	    
	    List < Integer > evenNumbers = filterList(numbers, n -> n % 2 == 0);
	    System.out.println("Even numbers: " + evenNumbers);
	    

	    // Filter odd numbers
	    List < Integer > oddNumbers = filterList(numbers, n -> n % 2 != 0);
	    System.out.println("Odd numbers: " + oddNumbers);

	    List < String > colors = List.of("Red", "Green", "White", "Orange", "Black", "Pink");
	    System.out.println("\nOriginal list of Colors: " + colors);
	    // Filter colors starting with 'O'
	    List < String > wordsStartingWithO = filterList(colors, color -> color.startsWith("O"));
	    System.out.println("Colors starting with 'O': " + wordsStartingWithO);

	    // Filter colors with length greater than 4
	    List < String > wordsLengthGreaterThan4 = filterList(colors, color -> color.length() > 4);
	    System.out.println("Colors with length greater than 4: " + wordsLengthGreaterThan4);
	  }
	

	private static <T>List <T> filterList(List<T> numbers, Predicate<T> predicate) {
		List<T> filter_list = new ArrayList<>();
		
		for(T elements : numbers) {
			if(predicate.test(elements)) {
				filter_list.add(elements);
			}
			
		}
		
	
		return filter_list;
	}
}
