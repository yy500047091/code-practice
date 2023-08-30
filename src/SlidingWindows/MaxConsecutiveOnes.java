package SlidingWindows;

public class MaxConsecutiveOnes {
	
	private static int countMaxConsecutiveOnes(int[] arr, int k) {
		
		int start = 0,end;
		int maxConsecutiveOne=0;
		int zerocount=0;
		
		for( end=0;end<arr.length;end++) {
			if(arr[end]==0) {
				zerocount++;
				
			}
			while (zerocount>k) {
				if(arr[start]==0){
					zerocount--;
					
				}
				
				start++;
				
			}
			
		maxConsecutiveOne= Math.max(maxConsecutiveOne, end-start+1);
		}
		return maxConsecutiveOne;
	}

	
	
	
	

	
	
	
	public static void main(String args[]) {
		
		int [] arr= {1,1,1,0,0,1,0,1,1};
	    int k=2;//no. of zeros that can be flipped
	    
		int result =countMaxConsecutiveOnes(arr,k);
		System.out.println("maximum consecutive ones after flipping "+k+ "is :"+result)
		;
		
	}








}
