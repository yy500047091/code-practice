package practice;
// a number represented as a string
import java.util.Arrays;

public class GFG {
	
	// Returns sum of all substring of num
	public static long sumOfSubstrings(String num)
	{
		long sum = 0; // Initialize result
	
		// Here traversing the array in reverse
		// order.Initializing loop from last
		// element.
		// mf is multiplying factor.
		long mf = 1;
		for (int i = num.length() - 1; i >= 0; i --)
		{
			// Each time sum is added to its previous
			// sum. Multiplying the three factors as
			// explained above.
			// s[i]-'0' is done to convert char to int.
			sum += (num.charAt(i) - '0') * (i + 1) * mf;
	
			// Making new multiplying factor as
			// explained above.
			mf = mf * 10 + 1;
		}
	
		return sum;
	}
	
	 public static void main(String[] args)
	    {
	        String num = "6759";
	             
	        System.out.println(sumOfSubstrings(num));
	             
	    }
	}
	
