package collections;
import java.util.Arrays;

public class DuplicateArrayWIthoutExtraSpace {
	


	    public static void main(String[] args) {
	        int[] arr = { 1, 2, 2, 3, 4, 4, 5, 6, 6 };
	        int[] deduplicatedArray = removeDuplicates(arr);
	        System.out.println("Deduplicated array: " + Arrays.toString(deduplicatedArray));
	    }

	    public static int[] removeDuplicates(int[] arr) {
	        int n = arr.length;
	        int j = 0;

	        for (int i = 0; i < n - 1; i++) {
	            if (arr[i] != arr[i + 1]) {
	                arr[j++] = arr[i];
	            }
	        }

	        arr[j++] = arr[n - 1];

	        int[] deduplicatedArray = new int[j];
	        System.arraycopy(arr, 0, deduplicatedArray, 0, j);
	        return deduplicatedArray;
	    }
	}


