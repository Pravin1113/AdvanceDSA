package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class SwapNumber {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(6);
        numbers.add(9);
        numbers.add(2);

        int idx = 1, idx2 = 3;
        swap(numbers, idx, idx2);
        System.out.println(numbers);
    }

    private static void swap(List<Integer> numbers, int idx, int idx2) {
        int temp = numbers.get(idx);
        numbers.set(idx, numbers.get(idx2) );
        numbers.set(idx2, temp);
    }
}
