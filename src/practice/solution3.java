package practice;


import java.util.*;
import java.io.*;
import java.lang.Math;

class solution3{
    public static void main(String []arg) throws IOException{
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int result =0;
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            
            for (int j = 0; j < n; j++ ){
                if(j==0){
                    result = result + (a + (int)Math.pow(2,j) * b);
                }
                else{
                    result = result + ((int)Math.pow(2,j) * b);
                }
                System.out.print(result+" ");
            }
            System.out.println();
        }
        in.close();
    }
}