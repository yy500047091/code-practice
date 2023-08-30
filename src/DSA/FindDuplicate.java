package DSA;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindDuplicate {
	
	public static void findDuplicates(int[] arr) {
	    Map<Integer, Integer> frequencyMap = new HashMap<>();
	    
	    for (int num : arr) {
	        frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
	    }
	    
//	    for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
//	        if (entry.getValue() > 1) {
//	            System.out.println(entry.getKey());
//	        }
//	    }
	    
	    for(int num :frequencyMap.keySet()) {
	    	if(frequencyMap.get(num) >1)
	    		System.out.println(num);
	    }
	}
	public static void main(String args[]) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the no of arrrays");
		int n = sc.nextInt();
		
		System.out.println("enter the digits:");
		
		int [] num = IntStream.range(0, n).map(s->sc.nextInt()).toArray();
		findDuplicates(num);
		sc.close();
	}
		
}