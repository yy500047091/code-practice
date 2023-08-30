package SlidingWindows;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DistinctElenet {
    
    public static List<Integer> distinctElement(int arr[], int k) {
        List<Integer> result = new ArrayList<Integer>();
        Map<Integer, Integer> elemCountMap = new HashMap<>();

        int len = arr.length;
        for (int i = 0; i < k; i++) {
            elemCountMap.put(arr[i], elemCountMap.getOrDefault(arr[i], 0) + 1);
        }

        result.add(elemCountMap.size());

        for (int i = 1; i <= len - k; i++) {
            int removeElem = arr[i - 1];
            int addElem = arr[i + k - 1];

            removeElemFromMap(elemCountMap, removeElem);

            elemCountMap.put(addElem, elemCountMap.getOrDefault(addElem, 0) + 1);
            result.add(elemCountMap.size());
        }

        return result;
    }

    private static void removeElemFromMap(Map<Integer, Integer> elemCountMap, int removeElem) {
        Integer count = elemCountMap.get(removeElem);

        if (count != null && count > 1) {
            elemCountMap.put(removeElem, count - 1);
        } else {
            elemCountMap.remove(removeElem);
        }
    }

    public static void main(String args[]) {

        int[] arr = { 1, 5, 9, 3, 3, 3, 6, 6, 7, 8, 3 };
        int k = 3;
        List<Integer> result = distinctElement(arr, k);
        System.out.println(result);

    }
}
