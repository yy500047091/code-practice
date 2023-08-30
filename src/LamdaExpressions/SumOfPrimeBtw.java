package LamdaExpressions;

import java.util.Scanner;
import java.util.stream.IntStream;

public class SumOfPrimeBtw {

	public static void main(String args[]) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("enter the 2 no btw which u want to find the sum of prime numbers:");
		int min_int = sc.nextInt();
		int max_int =sc.nextInt();
		


		     // Calculate the sum of prime numbers using lambda expression
		     int sumOfPrimes = IntStream.rangeClosed(min_int, max_int)
		       .filter(number -> isPrime(number))
		       .sum();
		     System.out.println("Sum of prime numbers between " + min_int + " and " + max_int + ": " + sumOfPrimes);
		     sc.close();
		   }
		   // Lambda expression to check if a number is prime
		   public static boolean isPrime(int number) {
		     if (number <= 1) {
		       return false;
		     }
		     for (int i = 2; i <= Math.sqrt(number); i++) {
		       if (number % i == 0) {
		         return false;
		       }
		     }
		     return true;
		     
		   }
		   
		 }
