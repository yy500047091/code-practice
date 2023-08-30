package ArrayLIst;

import java.util.HashMap;

public class SunsetUsingHashMap {
	
	private static boolean isSubset(int[] arr1, int m, int[] arr2, int n) {
		if(m>n)
			return false;
		HashMap<Integer, Boolean> mp =new HashMap<>();
		
		for(int i=0; i<n;i++) {
		  mp.put(arr2[i], true);
		}
		
		for(int j=0;j<m;j++) {
			if(mp.containsKey(arr1[j])==false) {
				return false;
			}
			
		}

		return true;
	}
	
	
	public static void main(String[] args) {

	  	int arr1[]={1,3,4,5,2};
		int arr2[]={2,4,3,1,7,5,15};
		
		int m= arr1.length;
		int n= arr2.length;
		
		boolean ans= isSubset(arr1,m,arr2,n);
		
		if(ans==true)
		    System.out.print("arr1[] is a subset of arr2[]");
		else  System.out.print("arr1[] is not a subset of arr2[]");

	  }


}	