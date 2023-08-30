package collections;


import java.util.*;

public class MaxOccChar {
    public static void main(String[] args) {
        String str = "hello world";
        System.out.println(str.length());
        char maxOccurringChar = findMaxOccurringChar(str);
        System.out.println("Maximum occurring character: " + maxOccurringChar);
    }

	private static char findMaxOccurringChar(String str) {
	  
     Map<Character, Integer> charCount= new HashMap<Character, Integer>();
      
		
		for(char c : str.toCharArray()) {
			charCount.put(c, charCount.getOrDefault(c, 0)+1);
		}
		
		int maxCount = 0;
        char maxChar = ' ';
        
		for(char c: charCount.keySet()) {
			int count = charCount.get(c);
			if(count> maxCount) {
				maxCount =count;
				maxChar= c;
			}
		}
			
		return maxChar;	
				
		}
		
	}