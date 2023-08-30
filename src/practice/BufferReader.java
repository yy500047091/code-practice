package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BufferReader {
	
	    public static void main(String[] args) throws IOException {
	    	
	    	Scanner scan=new Scanner(System.in);
	        BufferedReader bufferedReader = new BufferedReader(
	        		new InputStreamReader(System.in));

	      System.out.println("enter no of inputs");
	      int n= scan.nextInt();
	        int a[] = new int[10];
	        String line = bufferedReader.readLine(); // to read multiple integers line
	        String[] strs = line.trim().split("\\s+");  //The \\s is equivalent to [ \\t\\n\\x0B\\f\\r].
	         for (int i = 0; i < n; i++) 
	         {
	         //a[i] = Integer.parseInt(strs[i] +"*"+i =(strs[i]*i));
	        	 a[i] = Integer.parseInt(strs[i]);
	        	 System.out.println(a[i]);
	        	      
	        	         for (int j = 0; j< 10; j++)
	        	         {
	        	            
	        	        	 System.out.println(strs[i]+ "*" + j + "=" + Integer.valueOf(strs[i]) * j );
	        	         }
	                bufferedReader.close();
	      	        scan.close();

	        }
	         
	    }
	}

