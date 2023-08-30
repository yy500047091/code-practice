package LamdaExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CheckPerfectSquare {
	
	
	 public static boolean isPerfectnumber(int number) {
		 int sqrt = (int) Math.sqrt(number);
		
		 return sqrt*sqrt ==number;
		 
	 }

	public static void main(String args[]) {
		
	
	 Scanner sc = new Scanner(System.in);
		

		System.out.println("enter the 5 number to chacke if they are perfect ssquare or not :");
		
		 List<Integer> numbers = IntStream.range(0, 5)
				 .map(i -> sc.nextInt()).boxed().collect(Collectors.toList());
		 
		 numbers.forEach(number -> System.out.println("number :"+ number + "is"+ (isPerfectnumber(number)? "a":"not")+"perfect number"));
		 
		 sc.close();
		 
		
				 
		
		
		
		
		
	}
}
		