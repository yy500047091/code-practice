package Iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;


public class Iterator1 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            ArrayList<Integer> result = javaIterator(n, k, arr);
            
            // Print the sorted ArrayList
            for (int num : result) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
    
    
    static ArrayList<Integer> javaIterator(int n, int k, int[] arr) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        for (int num : arr) {
            arrayList.add(num);
        }
        
        // Use explicit iterator to remove elements less than k
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            int num =  iterator.next();
            if (num < k) {
                iterator.remove();
            }
        }
        
        Collections.sort(arrayList);
        
        return arrayList;
    }
}

