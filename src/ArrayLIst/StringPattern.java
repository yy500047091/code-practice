package ArrayLIst;

public class StringPattern {
	
	
	
	
	  public static void main(String[] args) throws java.lang.Exception {
		    String text = "takeuforward";
		    String pattern = "forward";

		    int foundIdx = foundPattern(text, pattern);

		    System.out.println("The substring starts from the index: "+foundIdx);
		  }

	private static int foundPattern(String text, String pattern) {
		int n= text.length();
		int m = pattern.length();
		
		
		for(int i=0;i<n;i++) {
			int temp=i;
			int j=0;
			for(j =0;j<m;j++) {
				if(text.charAt(temp)!=pattern.charAt(j)) {
					break;
				}
				temp++;
			}
			if(j==m) {
				return i;	
				
			}
		}
		
		return -1;
	}
}

