package ArrayLIst;

import java.util.Arrays;

public class SubsetUsingBs {
	
	public static boolean bSearch(int element,int arr2[],int n) {
		int start=0;
		int end=n-1;
		
		while(start<=end) {
			int mid= (start+end)/2;
			
			if(arr2[start]==element)
				return true;
			else
				if(arr2[mid]<element) 
					start=mid+1;
				
				else 
					end=mid-1;
	 }
		return false;
	}
		
	
	
	
	public static boolean isSubset(int arr1[],int m,int arr2[],int n) {
		
		if(m>n)
			return false;
		Arrays.sort(arr2);
		
		for(int i =0;i<m;i++) {
			boolean isPresent= bSearch(arr1[i] , arr2,n);
			
			if (isPresent == false) return false;
	    }
	    return true;
	  }

	
	
	 public static void main(String[] args) {

		    int arr1[]={1,3};
			int arr2[]={2,4,3,1};

		    int m = arr1.length;
		    int n = arr2.length;

		    boolean ans = isSubset(arr1, m, arr2, n);

		    if (ans == true)
		      System.out.print("arr1[] is a subset of arr2[]");
		    else System.out.print("arr1[] is not a subset of arr2[]");

		  }
		}


