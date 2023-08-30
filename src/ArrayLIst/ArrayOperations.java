package ArrayLIst;

import java.util.*;

public class ArrayOperations {

    // Find all repeating elements in an array
    public static List<Integer> findRepeatingElements(int[] arr) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                result.add(entry.getKey());
            }
        }
        
        return result;
    }

    // Find all non-repeating elements in an array
    public static List<Integer> findNonRepeatingElements(int[] arr) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == 1) {
                result.add(entry.getKey());
            }
        }
        
        return result;
    }

    // Find all symmetric pairs in array
    public static List<int[]> findSymmetricPairs(int[][] pairs) {
        List<int[]> result = new ArrayList<>();
        Map<Integer, Integer> pairMap = new HashMap<>();
        
        for (int[] pair : pairs) {
            int first = pair[0];
            int second = pair[1];
            
            if (pairMap.containsKey(second) && pairMap.get(second) == first) {
                result.add(pair);
            } else {
                pairMap.put(first, second);
            }
        }
        
        return result;
    }

    // Maximum product subarray in an array
    public static int maxProductSubarray(int[] arr) {
        int maxProduct = arr[0];
        int minProduct = arr[0];
        int result = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < 0) {
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }
            
            maxProduct = Math.max(arr[i], maxProduct * arr[i]);
            minProduct = Math.min(arr[i], minProduct * arr[i]);
            
            result = Math.max(result, maxProduct);
        }
        
        return result;
    }

    // Replace each element of the array by its rank in the array
    public static int[] replaceByRank(int[] arr) {
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);
        
        Map<Integer, Integer> rankMap = new HashMap<>();
        for (int i = 0; i < sortedArr.length; i++) {
            rankMap.put(sortedArr[i], i + 1);
        }
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rankMap.get(arr[i]);
        }
        
        return arr;
    }

    // Sorting elements of an array by frequency
    public static int[] sortByFrequency(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Create a custom comparator based on frequency and value
        Comparator<Integer> frequencyComparator = (a, b) -> {
            int freqCompare = Integer.compare(frequencyMap.get(b), frequencyMap.get(a));
            if (freqCompare != 0) {
                return freqCompare;
            }
            return Integer.compare(a, b);
        };

        // Sorting the array using the custom comparator
        Integer[] boxedArray = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(boxedArray, frequencyComparator);

        // Converting the sorted array back to primitive int[]
        int[] sortedArray = Arrays.stream(boxedArray).mapToInt(Integer::intValue).toArray();

        return sortedArray;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking array input
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Find repeating elements
        List<Integer> repeatingElements = findRepeatingElements(arr);
        System.out.println("Repeating elements: " + repeatingElements);

        // Find non-repeating elements
        List<Integer> nonRepeatingElements = findNonRepeatingElements(arr);
        System.out.println("Non-repeating elements: " + nonRepeatingElements);

        // Find symmetric pairs
        System.out.print("Enter the number of pairs: ");
        int numPairs = scanner.nextInt();
        int[][] pairs = new int[numPairs][2];
        System.out.println("Enter the pairs (first second): ");
        for (int i = 0; i < numPairs; i++) {
            pairs[i][0] = scanner.nextInt();
            pairs[i][1] = scanner.nextInt();
        }
        List<int[]> symmetricPairs = findSymmetricPairs(pairs);
        System.out.println("Symmetric pairs: " + symmetricPairs);

        // Maximum product subarray
        int maxProduct = maxProductSubarray(arr);
        System.out.println("Maximum product subarray: " + maxProduct);

        // Replace each element by its rank
        int[] rankArray = replaceByRank(arr.clone());
        System.out.println("Array after replacing by rank: " + Arrays.toString(rankArray));

        // Sort elements by frequency
        int[] frequencySortedArray = sortByFrequency(arr.clone());
        System.out.println("Array sorted by frequency: " + Arrays.toString(frequencySortedArray));
    }
}
