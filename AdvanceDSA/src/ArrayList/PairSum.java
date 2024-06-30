package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class PairSum {
    private static boolean pairSum(List<Integer> list, int target) {
        int lSide = list.get(0);
        int rSide = list.get(list.size()-1);
        while (lSide != rSide){
            if(lSide - target + rSide + target == target){
                return true;
            } else if(lSide - target + rSide + target > target){
                rSide --;
        } else if(lSide - target + rSide +target < target){
            lSide ++;
        }
        }
        return  false;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(pairSum(list, 9));

    }


}
