package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArraylistQ1 {

    private static boolean monotonicList(List<Integer> list) {
        boolean inc = true;
        boolean dec  = true;
        for (int i = 0; i < list.size()- 1; i++) {
            if (list.get(i) < list.get(i+1))
                dec = false;

            if (list.get(i) > list.get(i+1))
                inc = false;



        }
        return dec || inc;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);

        list.add(3);
        list.add(2);
        System.out.println(monotonicList(list));

    }


}
