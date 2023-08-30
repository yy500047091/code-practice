package ArrayLIst;

import java.util.Arrays;

public class RotateArray {
	
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        int[] originalArr = Arrays.copyOf(arr, arr.length); // Copy the original array

        System.out.println("Original Array: " + Arrays.toString(arr));

        rotateLeft(arr, k);
        System.out.println("Array after left rotation: " + Arrays.toString(arr));

        // Use the original array for right rotation
        rotateRight(originalArr, k);
        System.out.println("Array after right rotation: " + Arrays.toString(originalArr));
    }

	private static void rotateRight(int[] arr, int k) {
		int l =arr.length;
		 k= k % l;
		 int temp[]= new int[l];
		 
		 for(int i=0;i<l;i++) {
			 
		       temp[i]= arr[(i+k)%l];
			 
		 }
		 
		 System.arraycopy(temp, 0, arr, 0, l);
			 
		
		
		
		
		
	}

	private static void rotateLeft(int[] arr, int k) {
		int l =arr.length;
		 k= k % l;
		 int temp[]= new int[l];
		 
		 for(int i=0;i<l;i++) {
			 
		       temp[i]= arr[(i-k+l)%l];
			 
		 }
		 
		 System.arraycopy(temp, 0, arr, 0, l);
		
	}
	

}
