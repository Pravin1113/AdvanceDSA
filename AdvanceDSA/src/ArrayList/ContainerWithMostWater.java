package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(6);
        list.add(9);
        list.add(2);

        System.out.println( maxWater(list));
    }

    private static int maxWater(List<Integer> list) {
        int maxWater = 0;

        for(int i = 0; i < list.size(); i++){
            for(int j = i+1; j < list.size(); j++){
                int height = Math.min(list.get(i), list.get(j) );
                int width = j - i;
                int water = height * width;
                maxWater = Math.max(maxWater, water);
            }
        }
        return maxWater;

    }

}
