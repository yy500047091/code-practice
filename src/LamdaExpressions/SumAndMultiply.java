package LamdaExpressions;

import java.util.Arrays;
import java.util.List;

public class SumAndMultiply {

	    public static void main(String[] args) {
	        // Create a list of integers
	        List<Integer> nums = Arrays.asList(4, 2, 3, 6, 5, 1);
	        System.out.println("Original array elements: " + nums);
	        // Define the multiply and sum lambda expression
	        int result = nums.stream().reduce(1, (x,y)->x*y).intValue();
	        System.out.println("product is : "+ result);
}
}