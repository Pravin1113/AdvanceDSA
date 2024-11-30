package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LonelyNumber {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);
        List<Integer> lonelyNo =lonelyNumber(list);

        for (int i = 0; i < lonelyNo.size(); i++) {
            System.out.print(lonelyNo.get(i) + " ");
            }

    }

    private static List<Integer> lonelyNumber(List<Integer> list) {
        Collections.sort(list);

        List<Integer> lonelyNo = new ArrayList<>();
        for (int i = 1; i < list.size() - 1; i++) {


          if(list.get(i)+1 != list.get(i+1) &&  list.get(i)-1 != list.get(i-1)){
                lonelyNo.add(list.get(i));
            }
        }

        if(list.get(0)+1 != list.get(1)){
            lonelyNo.add(list.get(0));
        }

        if(list.get(list.size()-1) -1 != list.get(list.size()-2)){
            lonelyNo.add(list.get(list.size()-1));
        }
        return lonelyNo;
    }
}
