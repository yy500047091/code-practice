package SlidingWindows;

public class MaximumSubArray {

	
	
	private static int getSum(int[] arr, int k) {
		int start=0;
		int sum=0;
		int maxSum =0;
		
		for(int end =0;end<arr.length;end++) {
			sum= sum+arr[end];
			
			if(end>=k-1) {
				maxSum= Math.max(maxSum, sum);
				sum= sum -arr[start];
				start++;
				
			}
		}
	
		return maxSum;
	}
	
	
	public static void main(String args[]) {
		
		int [] arr= {2,3,5,5,10};
		int k=3;
		int result =getSum(arr,k);
		System.out.println("maximum sum of the suset with length" +k+ "is :"+result)
		;
		
	}

	
}
