package ArrayLIst;

public class findEquilibrium{
	 private static int findEquilibriumIndex(int[] arr) {
	        int n = arr.length;
	        int totalSum = 0;
	        int leftSum = 0;

	        for (int num : arr) {
	            totalSum += num;
	        }

	        for (int i = 0; i < n; i++) {
	            

	            if (leftSum == totalSum) {
	                return i;
	            }
	            totalSum -= arr[i];

	            leftSum += arr[i];
	        }

	        return -1;
	    }
	    

	
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 3, 2, 1};
	        int equilibriumIndex = findEquilibriumIndex(arr);

	        if (equilibriumIndex != -1) {
	            System.out.println("Equilibrium index is: " + equilibriumIndex);
	        } else {
	            System.out.println("No equilibrium index found.");
	        }
	    }

	   
	}
