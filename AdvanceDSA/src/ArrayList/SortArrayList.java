package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrayList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(6);
        numbers.add(9);
        numbers.add(2);

        Collections.sort(numbers);
        System.out.println(numbers);
    }


}
