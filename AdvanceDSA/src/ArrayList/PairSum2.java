package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class PairSum2 {

    private static boolean pairSum(List<Integer> list, int target) {
int bp = -1;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) > list.get(i+1)) {
                bp = list.get(i);
                break;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(7);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(pairSum(list, 9));

    }


}
