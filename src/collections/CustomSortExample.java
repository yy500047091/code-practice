package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomSortExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(6);
        numbers.add(15);
        numbers.add(8);

        // Custom sorting based on a specific order
        List<Integer> customOrder = List.of(6, 15, 8, 10);
        Comparator<Integer> customComparator = Comparator.comparingInt(num -> customOrder.indexOf(num));
        Collections.sort(numbers, customComparator);

        System.out.println(numbers); // Output: [6, 15, 8, 10]
    }
}
