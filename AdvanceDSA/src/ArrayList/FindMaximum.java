package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class FindMaximum {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(6);
        numbers.add(9);
        numbers.add(2);
Integer maxValue = Integer.MIN_VALUE;
        for(int i = 0; i < numbers.size(); i++){
            if(maxValue < numbers.get(i))
                maxValue = numbers.get(i);

        }
        System.out.println("maximum value is "+ maxValue);
    }


}
