package practice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class badString {
	
	    public static void main(String[] args) throws IOException {
	    	
//	        try(Scanner scan = new Scanner(System.in)){
//	        	
//	            int input = Integer.parseInt(scan.nextLine());
//	            System.out.println(input);
//	        }
//	        catch(NumberFormatException e){
//	            System.out.println("Bad String");
//	        }
	    	
	    	
	    	 try {
	    		 BufferedReader br = new BufferedReader
	    				     (new InputStreamReader(System.in));
	    		 int a= Integer.parseInt(br.readLine());
	                 System.out.println(a);
	               
     	            
	        
	         } catch (NumberFormatException e) {
	        	 System.out.println("Bad String");
	         }
	    	
	    	
	    }
	}
	        
	    

