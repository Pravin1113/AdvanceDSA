package ArrayList;

import java.util.ArrayList;

public class MostFrequency {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(100);
        list.add(200);
        list.add(1);
        list.add(100);
        System.out.println(mostFrequent(list, 1));
    }
    public static int mostFrequent(ArrayList<Integer> nums, int key) {
        int[] result = new int[100];
        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) == key) {
                result[nums.get(i + 1) - 1]++;
            }
        }
        for (int i = 0; i < 100; i++) {
            System.out.println(result[i]);
        }
        int max = Integer.MIN_VALUE;
        int ans = 0;
        for (int i = 0; i < 100; i++) {
            if (result[i] > max) {
                max = result[i];
                ans = i + 1;
            }
        }
        return ans;
    }
    }
