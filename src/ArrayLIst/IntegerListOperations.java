package ArrayLIst;

import java.util.ArrayList;
import java.util.List;

public class IntegerListOperations {
    public static void main(String[] args) {
        // Create ArrayList of integers & populate it.
        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(25);
        integerList.add(15);
        integerList.add(30);
        integerList.add(10);

        // 1. Check if element exists in the list.
        int elementToCheck = 25;
        boolean containsElement = integerList.contains(elementToCheck);
        System.out.println("Contains " + elementToCheck + ": " + containsElement);

        // 2. Display index of 1st occurrence of the element.
        int indexOfFirstOccurrence = integerList.indexOf(elementToCheck);
        System.out.println("Index of first occurrence: " + indexOfFirstOccurrence);

        // 3. Double values in the list --if elem val > 20.
        for (int i = 0; i < integerList.size(); i++) {
            if (integerList.get(i) > 20) {
                integerList.set(i, integerList.get(i) * 2);
            }
        }
        System.out.println("List after doubling values: " + integerList);

        // 4. Remove element at the specified index.
        int indexToRemove = 2;
        if (indexToRemove >= 0 && indexToRemove < integerList.size()) {
            integerList.remove(indexToRemove);
            System.out.println("List after removing element at index " + indexToRemove + ": " + integerList);
        }

        // 5. Remove by element.
        int elementToRemove = 10;
        boolean removed = integerList.remove(Integer.valueOf(elementToRemove));
        System.out.println("Element " + elementToRemove + " removed: " + removed);
        System.out.println("Final list: " + integerList);
    }
}
