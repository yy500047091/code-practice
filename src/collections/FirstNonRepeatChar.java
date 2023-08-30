package collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatChar {
   
	public static void main(String args[]) {
		String str= "abbcbaab";
		
		Map<Character, Integer> charCount = new LinkedHashMap<Character, Integer>();
		
		for(char c : str.toCharArray()) {
			charCount.put(c, charCount.getOrDefault(c, 0)+1);
		}
		
		for(char c: charCount.keySet()) {
			if(charCount.get(c)==1) {
				System.out.println("charst non repeat char :"+c);
				break;
			}
			
				
		}
	}
}
